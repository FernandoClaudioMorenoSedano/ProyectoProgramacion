package clases;

import excepciones.NombreVacioException;

public class CosasConNombre {
	private String nombre;

	public CosasConNombre(String nombre) throws NombreVacioException{
		super();
	this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreVacioException{
		if(nombre.isEmpty()) {
			throw new NombreVacioException("No puede haber nombres vacios");
		}else {
		this.nombre = nombre;
		}
	}

	@Override
	public String toString() {
		return "CosasConNombre [nombre=" + nombre + "]";
	}
	
}
