package Controlador;

public class Puntos extends Thread {
	private int edad;
	private String pais;

	public Puntos(int edad) {
		this.edad = edad;
		this.pais = "";
	}

	public void run() {
		votar();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void votar() {
		int randomn = (int) (1 + Math.random() * 100);
		if (edad == 18) {
			if (randomn >= 1 && randomn <= 7) {
				pais = "España";
			} else if (randomn >= 8 && randomn <= 10) {
				pais = "Alemania";
			} else if (randomn >= 11 && randomn <= 23) {
				pais = "Francia";
			} else if (randomn >= 24 && randomn <= 30) {
				pais = "Italia";
			} else if (randomn >= 31 && randomn <= 37) {
				pais = "Portugal";
			} else if (randomn >= 38 && randomn <= 51) {
				pais = "Reino unido";
			} else if (randomn >= 52 && randomn <= 61) {
				pais = "Polonia";
			} else if (randomn >= 62 && randomn <= 88) {
				pais = "Paises Bajos";
			} else if (randomn >= 89 && randomn <= 95) {
				pais = "Rumania";
			} else if (randomn >= 96 && randomn <= 100) {
				pais = "Grecia";
			}
		} else if (edad == 26) {
			if (randomn >= 1 && randomn <= 14) {
				pais = "España";
			} else if (randomn >= 15 && randomn <= 20) {
				pais = "Alemania";
			} else if (randomn >= 21 && randomn <= 33) {
				pais = "Francia";
			} else if (randomn >= 34 && randomn <= 40) {
				pais = "Italia";
			} else if (randomn >= 41 && randomn <= 46) {
				pais = "Portugal";
			} else if (randomn >= 47 && randomn <= 58) {
				pais = "Reino unido";
			} else if (randomn >= 59 && randomn <= 65) {
				pais = "Polonia";
			} else if (randomn >= 66 && randomn <= 81) {
				pais = "Paises Bajos";
			} else if (randomn >= 82 && randomn <= 90) {
				pais = "Rumania";
			} else if (randomn >= 91 && randomn <= 100) {
				pais = "Grecia";
			}
		} else if (edad == 41) {
			if (randomn >= 1 && randomn <= 5) {
				pais = "España";
			} else if (randomn >= 6 && randomn <= 15) {
				pais = "Alemania";
			} else if (randomn >= 16 && randomn <= 27) {
				pais = "Francia";
			} else if (randomn >= 28 && randomn <= 33) {
				pais = "Italia";
			} else if (randomn >= 34 && randomn <= 40) {
				pais = "Portugal";
			} else if (randomn >= 41 && randomn <= 54) {
				pais = "Reino unido";
			} else if (randomn >= 55 && randomn <= 61) {
				pais = "Polonia";
			} else if (randomn >= 62 && randomn <= 71) {
				pais = "Paises Bajos";
			} else if (randomn >= 72 && randomn <= 88) {
				pais = "Rumania";
			} else if (randomn >= 89 && randomn <= 100) {
				pais = "Grecia";
			}
		} else if (edad == 66) {
			if (randomn >= 1 && randomn <= 3) {
				pais = "España";
			} else if (randomn >= 4 && randomn <= 20) {
				pais = "Alemania";
			} else if (randomn >= 21 && randomn <= 25) {
				pais = "Francia";
			} else if (randomn >= 26 && randomn <= 37) {
				pais = "Italia";
			} else if (randomn >= 38 && randomn <= 49) {
				pais = "Portugal";
			} else if (randomn >= 50 && randomn <= 58) {
				pais = "Reino unido";
			} else if (randomn >= 59 && randomn <= 65) {
				pais = "Polonia";
			} else if (randomn >= 66 && randomn <= 76) {
				pais = "Paises Bajos";
			} else if (randomn >= 77 && randomn <= 91) {
				pais = "Rumania";
			} else if (randomn >= 92 && randomn <= 100) {
				pais = "Grecia";
			}
		}
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
