package clases;

import java.util.ArrayList;

/**
 * Clase que representa una Ronda de una Liga
 * @author Fernando
 */

public class Ronda {
	private ArrayList<Partido> partidos;//Partidos que componen la ronda

	public Ronda(ArrayList<Partido> partidos) {
		super();
		this.partidos = partidos;
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(ArrayList<Partido> partidos) {
		this.partidos = partidos;
	}

	@Override
	public String toString() {
		return "Ronda [partidos=" + partidos + "]";
	}
	
	
}
