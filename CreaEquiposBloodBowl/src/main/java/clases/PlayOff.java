package clases;

import java.util.ArrayList;

/**
 * Clase que representa una Liga
 * @author Fernando
 */

public class PlayOff {
	private ArrayList<Ronda> rondas; //Rondas que componen la liga

	public PlayOff(ArrayList<Ronda> rondas) {
		super();
		this.rondas = rondas;
	}

	public ArrayList<Ronda> getRondas() {
		return rondas;
	}

	public void setRondas(ArrayList<Ronda> rondas) {
		this.rondas = rondas;
	}

	@Override
	public String toString() {
		return "PlayOff [rondas=" + rondas + "]";
	}
	
	
}
