package excepciones;

/**
 * Clase que modela una excepcion cuando no se ha dado un nombre a un entrenador equipo o estadio
 * @author Fernando
 */

public class NombreVacioException extends Exception{

	/**
     * Constructor que recibe un mensaje de excepción
     * @param msg mensaje que se lanza cuando se produce la excepción
     */
	public NombreVacioException(String msg){
        super(msg);
    }
}
