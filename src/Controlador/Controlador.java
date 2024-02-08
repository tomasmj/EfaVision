package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.text.View;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import Vista.*;
import Persistencias.*;
public class Controlador implements ActionListener {
	Vista vista = new Vista() ;
	int votos18=0,votos26=0,votos41=0,votos66=0;
	ArrayList<PaisPuntos> puntos = new ArrayList<PaisPuntos>();
	
	public Controlador(Vista vista) {
		this.vista = vista;
		vista.btnSimularVotaciones.addActionListener(this);
		vista.btnAtras.addActionListener(this);
		vista.btnSiguiente.addActionListener(this);
		iniciarLista();
		vista.panelInicial.setVisible(true);
		vista.panelVotaciones.setVisible(false);
		vista.panelVotaciones2.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(vista.btnSimularVotaciones == e.getSource()) {
			SessionFactory sesion = null;
			
			try {
				Configuration configuracion = new Configuration();
				configuracion.configure("hibernate.cfg.xml");
				sesion = configuracion.buildSessionFactory();
				System.out.println("Conexion a la base de datos realizada");
				DropFavoritos(sesion);
				DropPuntos(sesion);
				crearTablaFavoritos(sesion);
				System.out.println("Crear tabla favoritos");
				crearTablaPuntos(sesion);
				System.out.println("Crear tabla puntos");
				List<PorcentajesRangoedad> porcentajes = obtenerPorcentajes(sesion);
				for(int i = 0;i<porcentajes.size();i++) {
					insertarPaises(sesion, porcentajes.get(i).getNombrePais());

				}

				for(int i=0;i<porcentajes.size();i++) {
					String paisVotando=porcentajes.get(i).getNombrePais();
					System.out.println(paisVotando);
					votos18=(int) (((double)porcentajes.get(i).getTotalHabitantes()*((double)porcentajes.get(i).getRango1825()/100))/500000);
					while(votos18>0) {
						Puntos hilo = new Puntos(18);
						hilo.start();
						hilo.join();
						String pais = hilo.getPais();
						for(int j=0;j<puntos.size();j++) {
							if(puntos.get(j).getPais().equalsIgnoreCase(pais)) {
								puntos.get(j).setPuntos(puntos.get(j).getPuntos()+1);
							}
						}
						votos18--;
					}
					
					votos26=(int) (((double)porcentajes.get(i).getTotalHabitantes()*((double)porcentajes.get(i).getRango2640()/100))/500000);
					while(votos26>0) {
						Puntos hilo = new Puntos(26);
						hilo.start();
						hilo.join();
						String pais = hilo.getPais();
						for(int j=0;j<puntos.size();j++) {
							if(puntos.get(j).getPais().equalsIgnoreCase(pais)) {
								puntos.get(j).setPuntos(puntos.get(j).getPuntos()+1);
							}
						}
						votos26--;
					}
					votos41=(int) (((double)porcentajes.get(i).getTotalHabitantes()*((double)porcentajes.get(i).getRango4165()/100))/500000);
					while(votos41>0) {
						Puntos hilo = new Puntos(41);
						hilo.start();
						hilo.join();
						String pais = hilo.getPais();
						for(int j=0;j<puntos.size();j++) {
							if(puntos.get(j).getPais().equalsIgnoreCase(pais)) {
								puntos.get(j).setPuntos(puntos.get(j).getPuntos()+1);
							}
						}
						votos41--;
					}
					votos66=(int) (((double)porcentajes.get(i).getTotalHabitantes()*((double)porcentajes.get(i).getRangoMas66()/100))/500000);
					while(votos66>0) {
						Puntos hilo = new Puntos(66);
						hilo.start();
						hilo.join();
						String pais = hilo.getPais();
						for(int j=0;j<puntos.size();j++) {
							if(puntos.get(j).getPais().equalsIgnoreCase(pais)) {
								puntos.get(j).setPuntos(puntos.get(j).getPuntos()+1);
							}
						}
						votos66--;
					}
			        Collections.sort(puntos, Comparator.comparingInt(PaisPuntos::getPuntos).reversed());
			        System.out.println(puntos.toString());

			        String pais1=puntos.get(0).getPais();
			        updatePuntos(sesion, pais1, 15);
			        String cantante1=devolverCantante(sesion, pais1);

			        String pais2=puntos.get(1).getPais();
			        updatePuntos(sesion, pais2, 10 );
			        String cantante2=devolverCantante(sesion, pais2);


			        String pais3=puntos.get(2).getPais();
			        updatePuntos(sesion, pais3, 8);
			        String cantante3=devolverCantante(sesion, pais3);
			        
			        insertarFavoritos(sesion, paisVotando, pais1, pais2, pais3);
			        Cliente c = new Cliente("favorito",paisVotando, pais1, pais2, pais3);
			        c.votar();
			        if(paisVotando.equalsIgnoreCase("Alemania")) {
			        	vista.lblPaisAlemania1.setText(pais1);
			        	vista.lblCantanteAlemania1.setIcon(new ImageIcon("src/Cantantes/"+cantante1+".png"));
			        	vista.lblPaisAlemania2.setText(pais2);
			        	vista.lblCantanteAlemania2.setIcon(new ImageIcon("src/Cantantes/"+cantante2+".png"));
			        	vista.lblPaisAlemania2.setText(pais3);
			        	vista.lblCantanteAlemania3.setIcon(new ImageIcon("src/Cantantes/"+cantante3+".png"));
			        }else if(paisVotando.equalsIgnoreCase("Francia")) {
			        	vista.lblPaisFrancia1.setText(pais1);
			        	vista.lblCantanteFrancia1.setIcon(new ImageIcon("src/Cantantes/"+cantante1+".png"));
			        	vista.lblPaisFrancia2.setText(pais2);
			        	vista.lblCantanteFrancia2.setIcon(new ImageIcon("src/Cantantes/"+cantante2+".png"));
			        	vista.lblPaisFrancia3.setText(pais3);
			        	vista.lblCantanteFrancia3.setIcon(new ImageIcon("src/Cantantes/"+cantante3+".png"));
			        }else if(paisVotando.equalsIgnoreCase("Portugal")) {
			        	vista.lblPaisPortugal.setText(pais1);
			        	vista.lblCantantePortugal1.setIcon(new ImageIcon("src/Cantantes/"+cantante1+".png"));
			        	vista.lblPaisPortugal2.setText(pais2);
			        	vista.lblCantantePortugal2.setIcon(new ImageIcon("src/Cantantes/"+cantante2+".png"));
			        	vista.lblPaisPortugal3.setText(pais3);
			        	vista.lblCantantePortugal3.setIcon(new ImageIcon("src/Cantantes/"+cantante3+".png"));
			        }else if(paisVotando.equalsIgnoreCase("Grecia")) {
			        	vista.lblPaisGrecia1 .setText(pais1);
			        	vista.lblCantanteGrecia1.setIcon(new ImageIcon("src/Cantantes/"+cantante1+".png"));
			        	vista.lblPaisGrecia2.setText(pais2);
			        	vista.lblCantanteGrecia1.setIcon(new ImageIcon("src/Cantantes/"+cantante2+".png"));
			        	vista.lblPaisGrecia3.setText(pais3);
			        	vista.lblCantanteGrecia1.setIcon(new ImageIcon("src/Cantantes/"+cantante3+".png"));
			        }else if(paisVotando.equalsIgnoreCase("Italia")) {
			        	vista.lblPaisItalia1.setText(pais1);
			        	vista.lblCantanteItalia1.setIcon(new ImageIcon("src/Cantantes/"+cantante1+".png"));
			        	vista.lblPaisItalia2.setText(pais2);
			        	vista.lblCantanteItalia2.setIcon(new ImageIcon("src/Cantantes/"+cantante2+".png"));
			        	vista.lblPaisItalia3.setText(pais3);
			        	vista.lblCantanteItalia3.setIcon(new ImageIcon("src/Cantantes/"+cantante3+".png"));
			        }else if(paisVotando.equalsIgnoreCase("Espania")) {
			        	vista.lblPaisEspaña1.setText(pais1);
			        	vista.lblCantanteEspaña1.setIcon(new ImageIcon("src/Cantantes/"+cantante1+".png"));
			        	vista.lblPaisEspaña2.setText(pais2);
			        	vista.lblCantanteEspaña2.setIcon(new ImageIcon("src/Cantantes/"+cantante2+".png"));
			        	vista.lblPaisEspaña3.setText(pais3);
			        	vista.lblCantanteEspaña3.setIcon(new ImageIcon("src/Cantantes/"+cantante3+".png"));
			        }else if(paisVotando.equalsIgnoreCase("Paises Bajos")) {
			        	vista.lblPaisPaisesBajos1.setText(pais1);
			        	vista.lblCantantePaisesBajos1.setIcon(new ImageIcon("src/Cantantes/"+cantante1+".png"));
			        	vista.lblPaisPaisesBajos2.setText(pais2);
			        	vista.lblCantantePaisesBajos2.setIcon(new ImageIcon("src/Cantantes/"+cantante2+".png"));
			        	vista.lblPaisPaisesBajos3.setText(pais3);
			        	vista.lblCantantePaisesBajos3.setIcon(new ImageIcon("src/Cantantes/"+cantante3+".png"));
			        }else if(paisVotando.equalsIgnoreCase("Reino Unido")) {
			        	vista.lblPaisReinoUnido1.setText(pais1);
			        	vista.lblCantanteReinoUnido1.setIcon(new ImageIcon("src/Cantantes/"+cantante1+".png"));
			        	vista.lblPaisReinoUnido2.setText(pais2);
			        	vista.lblCantanteReinoUnido2.setIcon(new ImageIcon("src/Cantantes/"+cantante2+".png"));
			        	vista.lblPaisReinoUnido3.setText(pais3);
			        	vista.lblCantanteReinoUnido3.setIcon(new ImageIcon("src/Cantantes/"+cantante3+".png"));
			        }else if(paisVotando.equalsIgnoreCase("Rumania")) {
			        	vista.lblPaisRumania1.setText(pais1);
			        	vista.lblCantanteRumania1.setIcon(new ImageIcon("src/Cantantes/"+cantante1+".png"));
			        	vista.lblPaisRumania2.setText(pais2);
			        	vista.lblCantanteRumania2.setIcon(new ImageIcon("src/Cantantes/"+cantante2+".png"));
			        	vista.lblPaisRumania3.setText(pais3);
			        	vista.lblCantanteRumania3.setIcon(new ImageIcon("src/Cantantes/"+cantante3+".png"));
			        }else {
			        	vista.lblPaisPolonia1.setText(pais1);
			        	vista.lblCantantePolonia1.setIcon(new ImageIcon("src/Cantantes/"+cantante1+".png"));
			        	vista.lblPaisPolonia2.setText(pais2);
			        	vista.lblCantantePolonia2.setIcon(new ImageIcon("src/Cantantes/"+cantante2+".png"));
			        	vista.lblPaisPolonia3.setText(pais3);
			        	vista.lblCantantePolonia3.setIcon(new ImageIcon("src/Cantantes/"+cantante3+".png"));
			        }
			        vista.progressBar.setValue(vista.progressBar.getValue()+ 10);
			        puntos.removeAll(puntos);
			        iniciarLista();
				}	
				String ganador = devolverGanador(sesion);
				Cliente c1 = new Cliente("ganador",ganador);
				c1.votar();
				esperar();
			
			} catch(Exception a) {
				a.printStackTrace();
			}finally {
				if(sesion!=null) {
					sesion.close();
				}
			}
		}
		if (vista.btnSiguiente == e.getSource()) {
			this.vista.panelVotaciones.setVisible(false);
			this.vista.panelVotaciones2.setVisible(true);
			this.vista.panelInicial.setVisible(false);
		}
		if (vista.btnAtras == e.getSource()) {
			this.vista.panelVotaciones.setVisible(true);
			this.vista.panelVotaciones2.setVisible(false);
			this.vista.panelInicial.setVisible(false);
		}
		
	}
	
	public  void esperar() {
        Timer timer = new Timer(); 
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
            	vista.panelInicial.setVisible(false);
            	vista.panelVotaciones2.setVisible(false);
				vista.panelVotaciones.setVisible(true);
            }
        };
        timer.schedule(task, 1000);
   }
	
	public String devolverCantante(SessionFactory session,String pais) {
		String cantante = null;
	Session sesion;
	try {
		sesion=session.getCurrentSession();
		sesion.beginTransaction();
		
		Query query = sesion.createSQLQuery("SELECT NOMBRE FROM CANTANTE WHERE PAIS = :PAIS");
		query.setParameter("PAIS", pais);
		cantante = (String) query.getSingleResult();
		sesion.getTransaction().commit();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	return cantante;
	}
	
	public String devolverGanador(SessionFactory session) {
		String ganador = null;
		Session sesion;
		try {
			sesion=session.getCurrentSession();
			sesion.beginTransaction();
			
			Query query = sesion.createSQLQuery("select PAIS from puntos_totales order by PUNTOS desc limit 1");
			ganador = (String) query.getSingleResult();
			sesion.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return ganador;
	}
	public void crearTablaPuntos(SessionFactory session) {
		Session sesion;
		try {
			sesion=session.getCurrentSession();
			sesion.beginTransaction();
			
			Query query = sesion.createSQLQuery("CREATE TABLE IF NOT EXISTS PUNTOS_TOTALES (\r\n"
					+ "ID_PUNTOS INT NOT NULL AUTO_INCREMENT,\r\n"
					+ "PAIS VARCHAR(20) NOT NULL,\r\n"
					+ "PUNTOS INT NOT NULL,\r\n"
					+ "CONSTRAINT PK_PUNTOS PRIMARY KEY (ID_PUNTOS)\r\n"
					+ ")");
			query.executeUpdate();
			
			sesion.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertarPaises(SessionFactory session, String pais) {
		Session sesion = null;
		try {
			sesion=session.getCurrentSession();
			sesion.beginTransaction();
			
			Query query = sesion.createSQLQuery("insert into puntos_totales(PAIS,PUNTOS) values (:pais, 0);");
			query.setParameter("pais", pais);
			query.executeUpdate();
			
			sesion.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			sesion.getTransaction().getRollbackOnly();
		}
		
	}
	
	public void insertarFavoritos(SessionFactory session,String pais,String favorito1,String favorito2,String favorito3) {
		Session sesion;
		try {
			sesion=session.getCurrentSession();
			sesion.beginTransaction();
			
			Query query = sesion.createSQLQuery("INSERT INTO FAVORITOS(PAIS,FAVORITO_1,FAVORITO_2,FAVORITO_3) VALUES (:PAIS,:FAVORITO1,:FAVORITO2,:FAVORITO3)");
			query.setParameter("PAIS", pais);
			query.setParameter("FAVORITO1", favorito1);
			query.setParameter("FAVORITO2", favorito2);
			query.setParameter("FAVORITO3", favorito3);

			query.executeUpdate();
			
			sesion.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void crearTablaFavoritos(SessionFactory session) {
		Session sesion;
		try {
			sesion=session.getCurrentSession();
			sesion.beginTransaction();
			
			Query query = sesion.createSQLQuery("CREATE TABLE IF NOT EXISTS FAVORITOS (\r\n"
					+ "ID_VOTO INT NOT NULL AUTO_INCREMENT,\r\n"
					+ "PAIS VARCHAR(20) NOT NULL,\r\n"
					+ "FAVORITO_1 VARCHAR(20) NOT NULL,\r\n"
					+ "FAVORITO_2 VARCHAR(20) NOT NULL,\r\n"
					+ "FAVORITO_3 VARCHAR(20) NOT NULL,\r\n"
					+ "CONSTRAINT PK_VOTOS PRIMARY KEY (ID_VOTO)\r\n"
					+ ")");
			query.executeUpdate();
			
			sesion.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updatePuntos(SessionFactory session, String pais, int puntos) {
		Session sesion;
		try {
			sesion=session.getCurrentSession();
			sesion.beginTransaction();
			
			Query query = sesion.createSQLQuery("update puntos_totales\r\n"
					+ "set PUNTOS = :puntos + PUNTOS\r\n"
					+ "where PAIS = :pais");
			query.setParameter("puntos", puntos);
			query.setParameter("pais", pais);
			query.executeUpdate();
			
			sesion.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void DropPuntos(SessionFactory session) {
		Session sesion = null;
		try {
			sesion=session.getCurrentSession();
			sesion.beginTransaction();
			Query query = sesion.createSQLQuery("DROP TABLE IF EXISTS FAVORITOS;");
			query.executeUpdate();
		} catch (Exception e) {
            // En caso de error, realizar rollback
            if (sesion != null) {
                sesion.getTransaction().rollback();
            }
            e.printStackTrace();
        }
	}
	public void DropFavoritos(SessionFactory session) {
		Session sesion = null;
		try {
			sesion=session.getCurrentSession();
			sesion.beginTransaction();
			Query query = sesion.createSQLQuery("DROP TABLE IF EXISTS puntos_totales;");
			query.executeUpdate();
        } catch (Exception e) {
            // En caso de error, realizar rollback
            if (sesion != null) {
                sesion.getTransaction().rollback();
            }
            e.printStackTrace();
        }
	}
	public void iniciarLista() {
		puntos.add(new PaisPuntos("Alemania",0));
		puntos.add(new PaisPuntos("España",0));
		puntos.add(new PaisPuntos("Italia",0));
		puntos.add(new PaisPuntos("Francia",0));
		puntos.add(new PaisPuntos("Portugal",0));
		puntos.add(new PaisPuntos("Paises bajos",0));
		puntos.add(new PaisPuntos("Reino unido",0));
		puntos.add(new PaisPuntos("Grecia",0));
		puntos.add(new PaisPuntos("Rumania",0));
		puntos.add(new PaisPuntos("Polonia",0));
	}
	
	public List<PorcentajesRangoedad> obtenerPorcentajes(SessionFactory sesion){
		List<PorcentajesRangoedad> porcentajes = null;
		Session session = null;
		try {
			session=sesion.getCurrentSession();
			session.beginTransaction();
			
			Query query = sesion.getCurrentSession().createQuery("FROM PorcentajesRangoedad");
			porcentajes=query.list();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return porcentajes;
	}
}
