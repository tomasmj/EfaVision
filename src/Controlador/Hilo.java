package Controlador;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Hilo extends Thread{
	public Socket socket;
	
	
	public Hilo(Socket socket) {
		this.socket = socket;
	}

	public String votar (String edad1, String edad2, String numVotos) throws InterruptedException {
		String resultado = "Todo ok";
		System.out.println("Votando");
		int numVoto=Integer.parseInt(numVotos);
		while(numVoto>0) {
			int randomn = (int)(1+Math.random()*100);
			if(Integer.parseInt(edad1)==18 && Integer.parseInt(edad2)==25) {
				if(randomn>=1 && randomn<=7) {
					System.out.println("España");
				}else if(randomn>=8 && randomn<=10) {
					System.out.println("Alemania");
				}else if(randomn>=11 && randomn<=23) {
					System.out.println("Francia");
				}else if(randomn>=24 && randomn<=30) {
					System.out.println("Italia");
				}else if(randomn>=31 && randomn<=37) {
					System.out.println("Portugal");
				}else if(randomn>=38 && randomn<=51) {
					System.out.println("Reino unido");
				}else if(randomn>=52 && randomn<=61) {
					System.out.println("Polonia");
				}else if(randomn>=62 && randomn<=88) {
					System.out.println("Paises Bajos");
				}else if(randomn>=89 && randomn<=95) {
					System.out.println("Rumania");
				}else if(randomn>=96 && randomn<=100) {
					System.out.println("Grecia");
				}
			}
			numVoto--;
			Hilo.sleep(2000);
		}
		
		return resultado;
	}
	
	public void escuchar() {
		InputStreamReader isr;
		BufferedReader br;
		PrintWriter pw;
		try {
			isr = new InputStreamReader(socket.getInputStream());
			br = new BufferedReader(isr);
			String edad1 = br.readLine();
			String edad2 = br.readLine();
			String numVotos = br.readLine();
			String resultado= votar(edad1,edad2,numVotos);
			pw = new PrintWriter(socket.getOutputStream());
			pw.write(resultado);
			pw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		escuchar();
	}
}
