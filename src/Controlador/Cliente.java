package Controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Cliente {
	private int edad1,numVotos;
	String votante;
	String ganador;
	String favorito1, favorito2, favorito3;
	String tipo;
	
	public Cliente(String tipo, String votante, String favorito1, String favorito2, String favorito3) {
		this.tipo = tipo;
		this.votante = votante;
		this.favorito1=favorito1;
		this.favorito2=favorito2;
		this.favorito3=favorito3;
	}
	
	public Cliente(String tipo, String ganador) {
		this.tipo=tipo;
		this.ganador = ganador;	
	}
	
	public void votar() throws IOException {
		Socket socket = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			InetSocketAddress conexion = new InetSocketAddress("localhost", 9876);
			if(tipo.equals("ganador")) {
				socket = new Socket();
				socket.connect(conexion);
				pw = new PrintWriter(socket.getOutputStream());
				pw.write(tipo + "\n");
				pw.write(ganador + "\n");
				pw.flush();
			} else if(tipo.equals("favorito")){
				socket = new Socket();
				socket.connect(conexion);
				pw = new PrintWriter(socket.getOutputStream());
				pw.write(tipo + "\n");
				pw.write(votante + "\n");
				pw.write(favorito1 + "\n");
				pw.write(favorito2+ "\n");
				pw.write(favorito3+ "\n");
				pw.flush();
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(isr!=null) {
				isr.close();
			}
			
			if(br!=null) {
				br.close();
			}
			
			if(pw!=null) {
				pw.close();
			}
			
			if(socket!=null) {
				socket.close();
			}
		}
	}
}
