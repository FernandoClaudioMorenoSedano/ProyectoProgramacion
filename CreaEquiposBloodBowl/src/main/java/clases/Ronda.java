package clases;

import java.util.ArrayList;

public class Ronda {
	private ArrayList<Partido> partidos;

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
