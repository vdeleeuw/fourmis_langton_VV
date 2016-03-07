import java.util.ArrayList;
import java.util.Random;
import exception.*;

/**
 * <b>FourmiViolette est la classe representant les fourmis violettes.</b> <br>
 * Une fourmi violette tourne a droite sur une case noire et a gauche sur une
 * case blanche.<br>
 * Elle colore les cases noire en blanc, et les blanches en noir.<br>
 * Elle mange toutes les fourmis qu'elle rencontre.<br>
 * <br>
 * Elle comporte les informations suivantes :
 * <ul>
 * <li>La position en X de la fourmi.</li>
 * <li>La position en Y de la fourmi.</li>
 * <li>La direction de la fourmi.</li>
 * <li>Une liste contenant toutes les fourmis violettes.</li>
 * </ul>
 * 
 * @see Fourmi
 * 
 * @author DE LEEUW Valerian
 * @author COUASNET Robin
 * 
 * @version 1.0
 */
public class FourmiViolette extends Fourmi {

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
	 * La liste contenant toutes les fourmis violettes.
	 */
	static ArrayList<FourmiViolette> listeFourmiViolette = new ArrayList<FourmiViolette>();

	/* Constructeur */
	/**
	 * Creer une nouvelle fourmi violette en la placant et en lui donnant
	 * aleatoirement une direction sur la grille, et en l'ajoutant a la liste de
	 * fourmi violettes.
	 * 
	 * @see FourmiViolette#listeFourmiViolette
	 */
	public FourmiViolette() {
		Random aleatoire = new Random();
		this.positionX = aleatoire.nextInt(tailleGrille);
		this.positionY = aleatoire.nextInt(tailleGrille);
		this.direction = aleatoire.nextInt(4) + 1;
		listeFourmiViolette.add(this);
	} // Fin Constructeur

	/* Methodes */
	/**
	 * Deplace la fourmi d'une case en fonction de sa direction et verifie la
	 * presence sur la case.
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
		for (int j = 0; j < FourmiRouge.listeFourmiRouge.size(); j++) {
			FourmiRouge tmpFouRouge = FourmiRouge.listeFourmiRouge.get(j);
			if (this.positionX == tmpFouRouge.positionX
					&& this.positionY == tmpFouRouge.positionY)
				FourmiRouge.listeFourmiRouge.remove(tmpFouRouge);
		} // FinPour
		for (int j = 0; j < FourmiBleue.listeFourmiBleue.size(); j++) {
			FourmiBleue tmpFouBleue = FourmiBleue.listeFourmiBleue.get(j);
			if (this.positionX == tmpFouBleue.positionX
					&& this.positionY == tmpFouBleue.positionY)
				FourmiBleue.listeFourmiBleue.remove(tmpFouBleue);
		} // FinPour
		for (int j = 0; j < FourmiJaune.listeFourmiJaune.size(); j++) {
			FourmiJaune tmpFouJaune = FourmiJaune.listeFourmiJaune.get(j);
			if (this.positionX == tmpFouJaune.positionX
					&& this.positionY == tmpFouJaune.positionY)
				FourmiJaune.listeFourmiJaune.remove(tmpFouJaune);
		} // FinPour
		for (int j = 0; j < FourmiOrange.listeFourmiOrange.size(); j++) {
			FourmiOrange tmpFouOrange = FourmiOrange.listeFourmiOrange.get(j);
			if (this.positionX == tmpFouOrange.positionX
					&& this.positionY == tmpFouOrange.positionY)
				FourmiOrange.listeFourmiOrange.remove(tmpFouOrange);
		} // FinPour
		for (int j = 0; j < FourmiVerte.listeFourmiVerte.size(); j++) {
			FourmiVerte tmpFouVerte = FourmiVerte.listeFourmiVerte.get(j);
			if (this.positionX == tmpFouVerte.positionX
					&& this.positionY == tmpFouVerte.positionY)
				FourmiVerte.listeFourmiVerte.remove(tmpFouVerte);
		} // FinPour
		for (int j = 0; j < FourmiRose.listeFourmiRose.size(); j++) {
			FourmiRose tmpFouRose = FourmiRose.listeFourmiRose.get(j);
			if (this.positionX == tmpFouRose.positionX
					&& this.positionY == tmpFouRose.positionY)
				FourmiRose.listeFourmiRose.remove(tmpFouRose);
		} // FinPour
		for (int j = 0; j < FourmiCyan.listeFourmiCyan.size(); j++) {
			FourmiCyan tmpFouCyan = FourmiCyan.listeFourmiCyan.get(j);
			if (this.positionX == tmpFouCyan.positionX
					&& this.positionY == tmpFouCyan.positionY)
				FourmiCyan.listeFourmiCyan.remove(tmpFouCyan);
		} // FinPour
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
			listeFourmiViolette.remove(this);
		} // FinCatch
		catch (TournantInvalideException e) {
			listeFourmiViolette.remove(this);
		} // FinCatch
		catch (DirectionInvalideException e) {
			listeFourmiViolette.remove(this);
		} // FinCatch
		finally {
			f.repaint();
			f.setVisible(true);
		} // Fin Finally
	} // Fin uneEtape

} // Fin FourmiViolette
