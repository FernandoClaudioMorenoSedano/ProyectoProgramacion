package clases;

import java.util.ArrayList;

public class PlayOff {
	private ArrayList<Ronda> rondas;

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
