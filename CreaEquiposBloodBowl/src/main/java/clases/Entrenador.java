package clases;

import excepciones.MismoNombreException;

public class Entrenador extends CosasConNombre{
	private byte numEquipos;

	public Entrenador(String nombre, byte numEquipos) throws MismoNombreException{
		
		super(nombre);
		this.numEquipos = numEquipos;
	}

	public byte getNumEquipos() {
		return numEquipos;
	}

	public void setNumEquipos(byte numEquipos) {
		this.numEquipos = numEquipos;
	}

	@Override
	public String toString() {
		return "Entrenador [numEquipos=" + numEquipos + "]";
	}
	
}
