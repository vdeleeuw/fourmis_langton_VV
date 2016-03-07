package exception;

/**
 * <b>TournantInvalideException est la classe representant l'exception renvoyee
 * par une fourmi voulant tourner d'une facon invalide.</b>
 * 
 * @author DE LEEUW Valerian
 * @author COUASNET Robin
 * 
 * @version 1.0
 */
public class TournantInvalideException extends Exception {

	/* Constructeurs */
	/**
	 * <b>Constructeur avec seulement "Tournant invalide !"</b>
	 */
	public TournantInvalideException() {
		super("Tournant invalide !");
	}

	/**
	 * <b>Constructeur avec une precision sur les coordonnees.</b>
	 * 
	 * @param tournant
	 *            Le tournant invalide.
	 */
	public TournantInvalideException(String tournant) {
		super("Tournant : " + tournant + " est invalide !");
	}

} // Fin TournantInvalideException