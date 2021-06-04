package clases;

import excepciones.MismoNombreException;

public class CosasConNombre {
	private String nombre;

	public CosasConNombre(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws MismoNombreException{
		if(nombre) {
			throw new MismoNombreException("Este nombre ya Existe");
		}else {
		this.nombre = nombre;
		}
	}

	@Override
	public String toString() {
		return "CosasConNombre [nombre=" + nombre + "]";
	}
	
}
