import java.util.ArrayList;
import java.util.Random;
import exception.*;

/**
 * <b>FourmiOrange est la classe representant les fourmis oranges.</b> <br>
 * Une fourmi orange tourne a droite sur une case noire mais sinon se deplace
 * aleatoirement.<br>
 * Elle colore les cases noire en blanc, et les blanches en noir.<br>
 * <br>
 * Elle comporte les informations suivantes :
 * <ul>
 * <li>La position en X de la fourmi.</li>
 * <li>La position en Y de la fourmi.</li>
 * <li>La direction de la fourmi.</li>
 * <li>Une liste contenant toutes les fourmis oranges.</li>
 * </ul>
 * 
 * @see Fourmi
 * 
 * @author DE LEEUW Valerian
 * @author COUASNET Robin
 * 
 * @version 1.0
 */
public class FourmiOrange extends Fourmi {

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
	 * La liste contenant toutes les fourmis oranges.
	 */
	static ArrayList<FourmiOrange> listeFourmiOrange = new ArrayList<FourmiOrange>();

	/* Constructeur */
	/**
	 * Creer une nouvelle fourmi orange en la placant et en lui donnant
	 * aleatoirement une direction sur la grille, et en l'ajoutant a la liste de
	 * fourmi orange.
	 * 
	 * @see FourmiOrange#listeFourmiOrange
	 */
	public FourmiOrange() {
		Random aleatoire = new Random(System.currentTimeMillis());
		this.positionX = aleatoire.nextInt(tailleGrille);
		this.positionY = aleatoire.nextInt(tailleGrille);
		this.direction = aleatoire.nextInt(4) + 1;
		listeFourmiOrange.add(this);
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
		Random aleatoire = new Random();
		direction = aleatoire.nextInt(4) + 1;
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
	 * Deplace la fourmi vers la droite.
	 * 
	 * @throws BordureException
	 *             Si la fourmi atteint une bordure.
	 * @throws DirectionInvalideException
	 *             Si la direction est incorrecte.
	 */
	private void deplacementDroite() throws BordureException,
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
	} // Fin deplacementDroite

	/**
	 * Fait tourner la fourmi dans vers la droite.
	 * 
	 * @param droite
	 *            Indique si la fourmi doit tourner a droite.
	 * 
	 * @throws BordureException
	 *             Si la fourmi atteint une bordure.
	 * @throws TournantInvalideException
	 *             Si le tournant est incorrecte.
	 * @throws DirectionInvalideException
	 *             Si la direction est incorrecte.
	 */
	private void tournant(String droite) throws BordureException,
			TournantInvalideException, DirectionInvalideException {
		if (droite.compareTo("droite") == 0) {
			direction -= 1;
			if (direction < 1) {
				direction = 4;
			} // FinAlors
			this.deplacementDroite();
		} // FinAlors
		else {
			throw new TournantInvalideException(droite);
		} // FinSinon
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
		if (grille[positionX][positionY] == true) {
			grille[positionX][positionY] = false;
			this.tournant("droite");
		} // FinAlors
		else {
			grille[positionX][positionY] = true;
			this.deplacement();
		} // FinSinon
	} // Fin couleur

	/**
	 * Permet a la fourmi d'effectuer une action puis reaffiche la grille.<br>
	 * Dans l'ordre : couleur, tournant - deplacement, deplacement.
	 */
	public void uneEtape() {
		try {
			this.couleur();
		} // FinTry
		catch (BordureException e) {
			listeFourmiOrange.remove(this);
		} // FinCatch
		catch (TournantInvalideException e) {
			listeFourmiOrange.remove(this);
		} // FinCatch
		catch (DirectionInvalideException e) {
			listeFourmiOrange.remove(this);
		} // FinCatch
		finally {
			f.repaint();
			f.setVisible(true);
		} // Fin Finally
	} // Fin uneEtape

} // Fin FourmiOrange
