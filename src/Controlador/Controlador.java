package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.View;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
		SessionFactory sesion = null;

		if(vista.Simular == e.getSource()) {
			
			try {
				Configuration configuracion = new Configuration();
				configuracion.configure("hibernate.cfg.xml");
				sesion = configuracion.buildSessionFactory();
				System.out.println("Conexion a la base de datos realizada");
			} catch(Exception a) {
				a.printStackTrace();
				throw a;
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

}
