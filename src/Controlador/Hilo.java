package Controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import Vista.Vista;

public class Hilo extends Thread{
	Socket socket = null;
	
	public Hilo(Socket s) {
		this.socket=s;	
	}
	
	public void run() {
		try {
			imprimirCantantes();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void imprimirCantantes() throws IOException {
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(socket.getInputStream());
			br = new BufferedReader(isr);
			String tipo= br.readLine();
			
			if(tipo.equals("favorito")) {
				String votante = br.readLine();
				String pais1 = br.readLine();
				String pais2 = br.readLine();
				String pais3 = br.readLine();
				System.out.println("pais que vota: " + votante);
				System.out.println("1º" + pais1);
				System.out.println("2º" + pais2);
				System.out.println("3º" +pais3);
				
			} else if((tipo.equals("ganador"))) {
				String ganador = br.readLine();
				System.out.println("EL GANADOR DE EFAVISION ES: " + ganador);		
			}	
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(isr!=null) {
				isr.close();
			}
			
			if(br!=null) {
				br.close();
			}
		}
	}
}
