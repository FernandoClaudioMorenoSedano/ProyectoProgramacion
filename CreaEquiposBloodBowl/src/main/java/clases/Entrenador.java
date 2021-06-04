package clases;

import excepciones.NombreVacioException;

public class Entrenador extends CosasConNombre{

	public Entrenador(String nombre) throws NombreVacioException{
		super(nombre);
		
	}

	@Override
	public String toString() {
		return "Entrenador []";
	}



	
}
