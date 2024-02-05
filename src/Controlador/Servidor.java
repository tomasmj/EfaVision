package Controlador;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor {
	public static void main (String [] args) {

		ServerSocket server;
		try {
			server = new ServerSocket(9876);
			System.out.println("Arrancado");
			while(true) {
				try {
					Socket s = server.accept();
					Hilo h = new Hilo(s);
					h.start();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
