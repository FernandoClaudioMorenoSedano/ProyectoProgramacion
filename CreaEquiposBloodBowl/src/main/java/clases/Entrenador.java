package clases;

import excepciones.NombreVacioException;

/**
 * Clase  que representa a un Entrenador
 * @author Fernando
 */

public class Entrenador extends CosasConNombre{

	public Entrenador(String nombre) throws NombreVacioException{
		super(nombre);
		
	}

	@Override
	public String toString() {
		return "Entrenador []";
	}



	
}
