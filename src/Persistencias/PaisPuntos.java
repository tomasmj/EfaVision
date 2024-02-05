package Persistencias;

public class PaisPuntos {
	private int puntos;
	private String pais;
	
	public PaisPuntos(String pais,int puntos) {
		this.puntos = puntos;
		this.pais = pais;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "PaisPuntos [puntos=" + puntos + ", pais=" + pais + "]";
	}
	
	
}
