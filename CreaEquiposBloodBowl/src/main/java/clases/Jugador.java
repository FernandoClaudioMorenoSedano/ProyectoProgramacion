package clases;

import excepciones.NombreVacioException;

/**
 * Clase que representa a un jugador
 * @author Fernando
 */

public class Jugador extends CosasConNombre{
	private byte movimiento; // valor de movimiento del jugador
	private byte fuerza; // valor de fuerza del jugador
	private byte agilidad; // valor de agilidad del jugador
	private byte armadura; // valor de armadura del jugador
	private static byte numMaxPorEquipo; // num maximo de este tipo de jugador en un equipo
	public Jugador(String nombre, byte movimiento, byte fuerza, byte agilidad, byte armadura) throws NombreVacioException{
		super(nombre);
		this.movimiento = movimiento;
		this.fuerza = fuerza;
		this.agilidad = agilidad;
		this.armadura = armadura;
	}
	public byte getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(byte movimiento) {
		this.movimiento = movimiento;
	}
	public byte getFuerza() {
		return fuerza;
	}
	public void setFuerza(byte fuerza) {
		this.fuerza = fuerza;
	}
	public byte getAgilidad() {
		return agilidad;
	}
	public void setAgilidad(byte agilidad) {
		this.agilidad = agilidad;
	}
	public byte getArmadura() {
		return armadura;
	}
	public void setArmadura(byte armadura) {
		this.armadura = armadura;
	}
	public static byte getNumMaxPorEquipo() {
		return numMaxPorEquipo;
	}
	public static void setNumMaxPorEquipo(byte numMaxPorEquipo){
		Jugador.numMaxPorEquipo = numMaxPorEquipo;
	}
	@Override
	public String toString() {
		return "Jugador [movimiento=" + movimiento + ", fuerza=" + fuerza + ", agilidad=" + agilidad + ", armadura="
				+ armadura + "]";
	}
	
	
}
