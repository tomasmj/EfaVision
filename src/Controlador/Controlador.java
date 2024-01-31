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
				
				eliminarMenores(sesion);
				System.out.println("Eliminar columnas");
				
				
			} catch(Exception a) {
				a.printStackTrace();
				throw a;
			}
		}
	}
	
	public void eliminarMenores(SessionFactory sesion) {
		Session session;
		try {
			session = sesion.getCurrentSession();
			session.beginTransaction();

			Query query = session.createSQLQuery("ALTER TABLE porcentajes_rangoedad DROP COLUMN rango_1_9, DROP COLUMN rango_10_17");
			query.executeUpdate();

			session.getTransaction().commit();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
