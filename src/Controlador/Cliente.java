package Controlador;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Cliente {
	private int edad1,edad2,numVotos;

	public Cliente(int edad1, int edad2, int numVotos) {
		this.edad1 = edad1;
		this.edad2 = edad2;
		this.numVotos = numVotos;
	}
	
	public void votar() {
		Socket socket;
		InputStreamReader isr;
		BufferedReader br;
		PrintWriter pw;
		try {
			InetSocketAddress conexion = new InetSocketAddress("localhost", 9876);
				socket = new Socket();
				socket.connect(conexion);
				pw = new PrintWriter(socket.getOutputStream());
				pw.write(edad1 + "\n");
				pw.write(edad2 + "\n");
				pw.write(numVotos + "\n");
				pw.flush();
				isr = new InputStreamReader(socket.getInputStream());
				br = new BufferedReader(isr);
				String resultado= br.readLine();
				System.out.println(resultado);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
