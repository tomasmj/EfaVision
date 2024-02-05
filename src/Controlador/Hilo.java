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

	public String votar (String edad1) throws InterruptedException {
		String resultado = "Todo ok";
			int randomn = (int)(1+Math.random()*100);
			if(Integer.parseInt(edad1)==18) {
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
			}else if(Integer.parseInt(edad1)==26) {
				if(randomn>=1 && randomn<=14) {
					System.out.println("España");
				}else if(randomn>=15 && randomn<=20) {
					System.out.println("Alemania");
				}else if(randomn>=21 && randomn<=33) {
					System.out.println("Francia");
				}else if(randomn>=34 && randomn<=40) {
					System.out.println("Italia");
				}else if(randomn>=41 && randomn<=46) {
					System.out.println("Portugal");
				}else if(randomn>=47 && randomn<=58) {
					System.out.println("Reino unido");
				}else if(randomn>=59 && randomn<=65) {
					System.out.println("Polonia");
				}else if(randomn>=66 && randomn<=81) {
					System.out.println("Paises Bajos");
				}else if(randomn>=82 && randomn<=90) {
					System.out.println("Rumania");
				}else if(randomn>=91 && randomn<=100) {
					System.out.println("Grecia");
				}
			}else if(Integer.parseInt(edad1)==41) {
				if(randomn>=1 && randomn<=5) {
					System.out.println("España");
				}else if(randomn>=6 && randomn<=15) {
					System.out.println("Alemania");
				}else if(randomn>=16 && randomn<=27) {
					System.out.println("Francia");
				}else if(randomn>=28 && randomn<=33) {
					System.out.println("Italia");
				}else if(randomn>=34 && randomn<=40) {
					System.out.println("Portugal");
				}else if(randomn>=41 && randomn<=54) {
					System.out.println("Reino unido");
				}else if(randomn>=55 && randomn<=61) {
					System.out.println("Polonia");
				}else if(randomn>=62 && randomn<=71) {
					System.out.println("Paises Bajos");
				}else if(randomn>=72 && randomn<=88) {
					System.out.println("Rumania");
				}else if(randomn>=89 && randomn<=100) {
					System.out.println("Grecia");
				}
			}else if(Integer.parseInt(edad1)==66) {
				if(randomn>=1 && randomn<=3) {
					System.out.println("España");
				}else if(randomn>=4 && randomn<=20) {
					System.out.println("Alemania");
				}else if(randomn>=21 && randomn<=25) {
					System.out.println("Francia");
				}else if(randomn>=26 && randomn<=37) {
					System.out.println("Italia");
				}else if(randomn>=38 && randomn<=49) {
					System.out.println("Portugal");
				}else if(randomn>=50 && randomn<=58) {
					System.out.println("Reino unido");
				}else if(randomn>=59 && randomn<=65) {
					System.out.println("Polonia");
				}else if(randomn>=66 && randomn<=76) {
					System.out.println("Paises Bajos");
				}else if(randomn>=77 && randomn<=91) {
					System.out.println("Rumania");
				}else if(randomn>=91 && randomn<=100) {
					System.out.println("Grecia");
				}
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
			String resultado= votar(edad1);
			pw = new PrintWriter(socket.getOutputStream());
			pw.write(resultado + "\n");
			pw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		escuchar();
		try {
			Hilo.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
