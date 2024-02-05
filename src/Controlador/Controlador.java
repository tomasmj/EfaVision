package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.View;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import Vista.*;
import Persistencias.*;
public class Controlador implements ActionListener {
	Vista vista = new Vista() ;
	public Controlador(Vista vista) {
		this.vista = vista;
		vista.Simular.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(vista.Simular == e.getSource()) {
			SessionFactory sesion = null;
			try {
				Configuration configuracion = new Configuration();
				configuracion.configure("hibernate.cfg.xml");
				sesion = configuracion.buildSessionFactory();
				System.out.println("Conexion a la base de datos realizada");
				
				List<PorcentajesRangoedad> porcentajes = obtenerPorcentajes(sesion);
				for(int i=0;i<porcentajes.size();i++) {
					int votos18=(int) (((double)porcentajes.get(i).getTotalHabitantes()*((double)porcentajes.get(i).getRango1825()/100))/500000);
					Cliente c1 = new Cliente(18,votos18);
					c1.votar();
					int votos26=(int) (((double)porcentajes.get(i).getTotalHabitantes()*((double)porcentajes.get(i).getRango2640()/100))/500000);
					Cliente c2 = new Cliente(26,votos26);
					c2.votar();
					int votos41=(int) (((double)porcentajes.get(i).getTotalHabitantes()*((double)porcentajes.get(i).getRango4165()/100))/500000);
					Cliente c3 = new Cliente(41,votos41);
					c3.votar();
					int votos66=(int) (((double)porcentajes.get(i).getTotalHabitantes()*((double)porcentajes.get(i).getRangoMas66()/100))/500000);
					Cliente c4 = new Cliente(66,votos66);
					c4.votar();
				}
					
			} catch(Exception a) {
				a.printStackTrace();
				throw a;
			}finally {
				if(sesion!=null) {
					sesion.close();
				}
			}
		}
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
