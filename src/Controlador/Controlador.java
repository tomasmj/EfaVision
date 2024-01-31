package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
				
				if(comprobarColumna(sesion, "rango_1_9")) {
					eliminarMenores(sesion,"rango_1_9");
					System.out.println("Columna eliminada");
				}
				
				if(comprobarColumna(sesion, "rango_10_17")) {
					eliminarMenores(sesion,"rango_10_17");
					System.out.println("Columna eliminada");
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
	
	public boolean comprobarColumna(SessionFactory sesion, String nombreColumna) {
		Session session = null;
		boolean existir = false;
		try {
			session = sesion.getCurrentSession();
			session.beginTransaction();

			Query query = session.createSQLQuery("show columns from porcentajes_rangoedad LIKE '" + nombreColumna + "'");
			Object resultado = query.uniqueResult();
			
			if(resultado!=null) {
				existir= true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return existir;
	}
	
	public void eliminarMenores(SessionFactory sesion, String nombreColumna) {
		Session session = null;
		try {
			session = sesion.getCurrentSession();
			session.beginTransaction();

			Query query = session.createSQLQuery("ALTER TABLE porcentajes_rangoedad DROP COLUMN " + nombreColumna);
			query.executeUpdate();

			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
	}

}
