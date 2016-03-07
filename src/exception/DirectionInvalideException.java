package exception;

/**
 * <b>DirectionInvalideException est la classe representant l'exception renvoyee
 * par une fourmi ayant une direction invalide.</b>
 * 
 * @author DE LEEUW Valerian
 * @author COUASNET Robin
 * 
 * @version 1.0
 */
public class DirectionInvalideException extends Exception {

	/* Constructeurs */
	/**
	 * <b>Constructeur avec seulement "Direction Invalide rencontree !"</b>
	 */
	public DirectionInvalideException() {
		super("Direction Invalide rencontree !");
	}

	/**
	 * <b>Constructeur avec une precision sur la direction.</b>
	 * 
	 * @param direction
	 *            La direction invalide.
	 */
	public DirectionInvalideException(int direction) {
		super("La direction " + direction + " n'est pas valide !");

	}

} // Fin DirectionInvalideException