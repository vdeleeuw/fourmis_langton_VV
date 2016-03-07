package exception;

/**
 * <b>BordureException est la classe representant l'exception renvoyee par une
 * fourmi touchant le bord de la grille.</b>
 * 
 * @author DE LEEUW Valerian
 * @author COUASNET Robin
 * 
 * @version 1.0
 */
public class BordureException extends Exception {

	/* Constructeurs */
	/**
	 * <b>Constructeur avec seulement "Bordure rencontree !"</b>
	 */
	public BordureException() {
		super("Bordure rencontree !");
	}

	/**
	 * <b>Constructeur avec une precision sur les coordonnees.</b>
	 * 
	 * @param x
	 *            L'abscisse de la collision.
	 * @param y
	 *            L'ordonnee de la collision.
	 */
	public BordureException(int x, int y) {
		super("Bordure rencontree en (" + x + "," + y + ") !");
	}

} // Fin BordureException