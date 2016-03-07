import java.util.ArrayList;
import java.util.Random;
import exception.*;

/**
 * <b>FourmiRouge est la classe representant les fourmis rouges.</b> <br>
 * Une fourmi rouge tourne a droite sur une case noire et a gauche sur une case
 * blanche.<br>
 * Elle colore les cases noire en blanc, et les blanches en noir.<br>
 * <br>
 * Elle comporte les informations suivantes :
 * <ul>
 * <li>La position en X de la fourmi.</li>
 * <li>La position en Y de la fourmi.</li>
 * <li>La direction de la fourmi.</li>
 * <li>Une liste contenant toutes les fourmis rouges.</li>
 * </ul>
 * 
 * @see Fourmi
 * 
 * @author DE LEEUW Valerian
 * @author COUASNET Robin
 * 
 * @version 1.0
 */
public class FourmiRouge extends Fourmi {

	/* Champs */
	/**
	 * La position en X de la fourmi sur la grille.
	 */
	public int positionX;
	/**
	 * La position en Y de la fourmi sur la grille.
	 */
	public int positionY;
	/**
	 * La direction de la fourmi sur la grille.
	 */
	public int direction;
	/**
	 * La liste contenant toutes les fourmis rouges.
	 */
	static ArrayList<FourmiRouge> listeFourmiRouge = new ArrayList<FourmiRouge>();

	/* Constructeur */
	/**
	 * Creer une nouvelle fourmi rouge en la placant et en lui donnant
	 * aleatoirement une direction sur la grille, et en l'ajoutant a la liste de
	 * fourmi rouges.
	 * 
	 * @see FourmiRouge#listeFourmiRouge
	 */
	public FourmiRouge() {
		Random aleatoire = new Random();
		this.positionX = aleatoire.nextInt(tailleGrille);
		this.positionY = aleatoire.nextInt(tailleGrille);
		this.direction = aleatoire.nextInt(4) + 1;
		listeFourmiRouge.add(this);
	} // Fin Constructeur

	/* Methodes */
	/**
	 * Deplace la fourmi d'une case en fonction de sa direction.
	 * 
	 * @throws BordureException
	 *             Si la fourmi atteint une bordure.
	 * @throws DirectionInvalideException
	 *             Si la direction est incorrecte.
	 */
	private void deplacement() throws BordureException,
			DirectionInvalideException {
		if (direction == 1) {
			positionX += 0;
			positionY += -1;
		} else if (direction == 2) {
			positionX += 1;
			positionY += 0;
		} else if (direction == 3) {
			positionX += 0;
			positionY += 1;
		} else if (direction == 4) {
			positionX += -1;
			positionY += 0;
		} else
			throw new DirectionInvalideException(direction);
		if (positionX < 0 || positionY < 0 || positionX >= tailleGrille
				|| positionY >= tailleGrille)
			throw new BordureException();
	} // Fin deplacement

	/**
	 * Fait tourner la fourmi dans vers gaucheDroite.
	 * 
	 * @param gaucheDroite
	 *            Indique si la fourmi doit tourner a gauche ou a droite.
	 * 
	 * @throws BordureException
	 *             Si la fourmi atteint une bordure.
	 * @throws TournantInvalideException
	 *             Si le tournant est incorrecte.
	 * @throws DirectionInvalideException
	 *             Si la direction est incorrecte.
	 */
	private void tournant(String gaucheDroite) throws BordureException,
			TournantInvalideException, DirectionInvalideException {
		if (gaucheDroite.compareTo("gauche") == 0) {
			direction += 1;
			if (direction > 4) {
				direction = 1;
			} // FinAlors
		} // FinaLors
		else if (gaucheDroite.compareTo("droite") == 0) {
			direction -= 1;
			if (direction < 1) {
				direction = 4;
			} // FinSinon
		} // FinAlors
		else {
			throw new TournantInvalideException(gaucheDroite);
		} // FinSinon
		this.deplacement();
	} // Fin tournant

	/**
	 * Fait colorer la case sur laquelle la fourmi se trouve.
	 * 
	 * @throws BordureException
	 *             Si la fourmi atteint une bordure.
	 * @throws TournantInvalideException
	 *             Si le tournant est incorrecte.
	 * @throws DirectionInvalideException
	 *             Si la direction est incorrecte.
	 */
	public void couleur() throws BordureException, TournantInvalideException,
			DirectionInvalideException {
		if (grille[positionX][positionY] == false) {
			grille[positionX][positionY] = true;
			this.tournant("gauche");
		} // FinAlors
		else {
			grille[positionX][positionY] = false;
			this.tournant("droite");
		} // FinSinon
	} // Fin couleur

	/**
	 * Permet a la fourmi d'effectuer une action puis reaffiche la grille.<br>
	 * Dans l'ordre : couleur, tournant, deplacement.
	 */
	public void uneEtape() {
		try {
			this.couleur();
		} // FinTry
		catch (BordureException e) {
			listeFourmiRouge.remove(this);
		} // FinCatch
		catch (TournantInvalideException e) {
			listeFourmiRouge.remove(this);
		} // FinCatch
		catch (DirectionInvalideException e) {
			listeFourmiRouge.remove(this);
		} // FinCatch
		finally {
			f.repaint();
			f.setVisible(true);
		} // Fin Finally
	} // Fin uneEtape

} // FinFourmiRouge
