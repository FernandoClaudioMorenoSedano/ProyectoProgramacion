package clases;

/**
 * Clase que representa un partido
 * @author Fernando
 */

public class Partido {
	private Equipo equipoLocal; //Equipo local que juega en el partido
	private Equipo equipoVisitante; //Equipo visitante que juega el partido
	private byte numTouchdownEquipoLocal; //Numero de touchdowns que ha marcado el equipo local
	private byte numTouchdownEquipoVisitante; //Numero de touchdowns que ha marcado el equipo visitante
	
	public Partido(Equipo equipoLocal, Equipo equipoVisitante, byte numTouchdownEquipoLocal,
			byte numTouchdownEquipoVisitante) {
		super();
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.numTouchdownEquipoLocal = numTouchdownEquipoLocal;
		this.numTouchdownEquipoVisitante = numTouchdownEquipoVisitante;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public byte getNumTouchdownEquipoLocal() {
		return numTouchdownEquipoLocal;
	}

	public void setNumTouchdownEquipoLocal(byte numTouchdownEquipoLocal) {
		this.numTouchdownEquipoLocal = numTouchdownEquipoLocal;
	}

	public byte getNumTouchdownEquipoVisitante() {
		return numTouchdownEquipoVisitante;
	}

	public void setNumTouchdownEquipoVisitante(byte numTouchdownEquipoVisitante) {
		this.numTouchdownEquipoVisitante = numTouchdownEquipoVisitante;
	}

	@Override
	public String toString() {
		return "Partido [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
				+ ", numTouchdownEquipoLocal=" + numTouchdownEquipoLocal + ", numTouchdownEquipoVisitante="
				+ numTouchdownEquipoVisitante + "]";
	}
	
	
}
