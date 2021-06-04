package clases;

import java.util.ArrayList;

import enumeraciones.Razas;
import excepciones.NombreVacioException;

public class Equipo extends CosasConNombre {
	private Entrenador entrenador;
	private Razas raza;
	private ArrayList<Jugador> jugador;
	private String nombreEstadio;
	
	public Equipo(String nombre, Entrenador entrenador, Razas raza, ArrayList<Jugador> jugador, String nombreEstadio) throws NombreVacioException{
		super(nombre);
		this.entrenador = entrenador;
		this.raza = raza;
		this.jugador = jugador;
		this.nombreEstadio = nombreEstadio;
	}
	

	public Equipo(String nombre) throws NombreVacioException {
		super(nombre);
	}


	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public Razas getRaza() {
		return raza;
	}

	public void setRaza(Razas raza) {
		this.raza = raza;
	}

	public ArrayList<Jugador> getJugador() {
		return jugador;
	}

	public void setJugador(ArrayList<Jugador> jugador) {
		this.jugador = jugador;
	}

	public String getNombreEstadio() {
		return nombreEstadio;
	}

	public void setNombreEstadio(String nombreEstadio) {
		this.nombreEstadio = nombreEstadio;
	}

	@Override
	public String toString() {
		return "Equipo [entrenador=" + entrenador + ", raza=" + raza + ", jugador=" + jugador + ", nombreEstadio="
				+ nombreEstadio + "]";
	}
	
	
}
