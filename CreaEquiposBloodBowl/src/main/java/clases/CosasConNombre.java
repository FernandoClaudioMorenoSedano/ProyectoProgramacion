package clases;

public class CosasConNombre {
	private String nombre;

	public CosasConNombre(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "CosasConNombre [nombre=" + nombre + "]";
	}
	
}
