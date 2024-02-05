package Controlador;

import java.util.HashMap;

public class Puntos extends Thread {
	private int edad;
	
	
	public Puntos(int edad) {
		this.edad = edad;
	}

	public void run( )   {
		try {
			votar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String votar () throws InterruptedException {
			int randomn = (int)(1+Math.random()*100);
			if (edad == 18) {
	            if (randomn >= 1 && randomn <= 7) {
	                return "España";
	            } else if (randomn >= 8 && randomn <= 10) {
	                return "Alemania";
	            } else if (randomn >= 11 && randomn <= 23) {
	                return "Francia";
	            } else if (randomn >= 24 && randomn <= 30) {
	                return "Italia";
	            } else if (randomn >= 31 && randomn <= 37) {
	                return "Portugal";
	            } else if (randomn >= 38 && randomn <= 51) {
	                return "Reino unido";
	            } else if (randomn >= 52 && randomn <= 61) {
	                return "Polonia";
	            } else if (randomn >= 62 && randomn <= 88) {
	                return "Paises Bajos";
	            } else if (randomn >= 89 && randomn <= 95) {
	                return "Rumania";
	            } else if (randomn >= 96 && randomn <= 100) {
	                return "Grecia";
	            }
	        } else if (edad == 26) {
	            if (randomn >= 1 && randomn <= 14) {
	                return "España";
	            } else if (randomn >= 15 && randomn <= 20) {
	                return "Alemania";
	            } else if (randomn >= 21 && randomn <= 33) {
	                return "Francia";
	            } else if (randomn >= 34 && randomn <= 40) {
	                return "Italia";
	            } else if (randomn >= 41 && randomn <= 46) {
	                return "Portugal";
	            } else if (randomn >= 47 && randomn <= 58) {
	                return "Reino unido";
	            } else if (randomn >= 59 && randomn <= 65) {
	                return "Polonia";
	            } else if (randomn >= 66 && randomn <= 81) {
	                return "Paises Bajos";
	            } else if (randomn >= 82 && randomn <= 90) {
	                return "Rumania";
	            } else if (randomn >= 91 && randomn <= 100) {
	                return "Grecia";
	            }
	        } else if (edad == 41) {
	            if (randomn >= 1 && randomn <= 5) {
	                return "España";
	            } else if (randomn >= 6 && randomn <= 15) {
	                return "Alemania";
	            } else if (randomn >= 16 && randomn <= 27) {
	                return "Francia";
	            } else if (randomn >= 28 && randomn <= 33) {
	                return "Italia";
	            } else if (randomn >= 34 && randomn <= 40) {
	                return "Portugal";
	            } else if (randomn >= 41 && randomn <= 54) {
	                return "Reino unido";
	            } else if (randomn >= 55 && randomn <= 61) {
	                return "Polonia";
	            } else if (randomn >= 62 && randomn <= 71) {
	                return "Paises Bajos";
	            } else if (randomn >= 72 && randomn <= 88) {
	                return "Rumania";
	            } else if (randomn >= 89 && randomn <= 100) {
	                return "Grecia";
	            }
	        } else if (edad == 66) {
	            if (randomn >= 1 && randomn <= 3) {
	                return "España";
	            } else if (randomn >= 4 && randomn <= 20) {
	                return "Alemania";
	            } else if (randomn >= 21 && randomn <= 25) {
	                return "Francia";
	            } else if (randomn >= 26 && randomn <= 37) {
	                return "Italia";
	            } else if (randomn >= 38 && randomn <= 49) {
	                return "Portugal";
	            } else if (randomn >= 50 && randomn <= 58) {
	                return "Reino unido";
	            } else if (randomn >= 59 && randomn <= 65) {
	                return "Polonia";
	            } else if (randomn >= 66 && randomn <= 76) {
	                return "Paises Bajos";
	            } else if (randomn >= 77 && randomn <= 91) {
	                return "Rumania";
	            } else if (randomn >= 92 && randomn <= 100) {
	                return "Grecia";
	            }
	        }
		return "";
	}
	
}
