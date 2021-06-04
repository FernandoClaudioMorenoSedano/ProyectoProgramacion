package excepciones;

/**
 * Clase que modela una excepcion cuando no se ha dado un nombre a un entrenador equipo o estadio
 * @author Fernando
 */

public class NombreVacioException extends Exception{

	/**
     * Constructor que recibe un mensaje de excepci�n
     * @param msg mensaje que se lanza cuando se produce la excepci�n
     */
	public NombreVacioException(String msg){
        super(msg);
    }
}
