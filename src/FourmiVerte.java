import java.util.ArrayList;
import java.util.Random;

import exception.*;

/**
 * <b>FourmiVerte est la classe representant les fourmis vertes.</b> <br>
 * Une fourmi verte se deplace en ligne droite.<br>
 * Elle ne colore pas les cases.<br>
 * Lorsqu'elle atteint le bord de la grille, elle se multiplie en 4 fourmis
 * aleatoire au milieu de al grille. <br>
 * Elle comporte les informations suivantes :
 * <ul>
 * <li>La position en X de la fourmi.</li>
 * <li>La position en Y de la fourmi.</li>
 * <li>La direction de la fourmi.</li>
 * <li>Une liste contenant toutes les fourmis vertes.</li>
 * </ul>
 * 
 * @see Fourmi
 * 
 * @author DE LEEUW Valerian
 * @author COUASNET Robin
 * 
 * @version 1.0
 */
public class FourmiVerte extends Fourmi {

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
	 * La liste contenant toutes les fourmis vertes.
	 */
	static ArrayList<FourmiVerte> listeFourmiVerte = new ArrayList<FourmiVerte>();

	/* Constructeur */
	/**
	 * Creer une nouvelle fourmi verte en la placant et en lui donnant
	 * aleatoirement une direction sur la grille, et en l'ajoutant a la liste de
	 * fourmi vertes.
	 * 
	 * @see FourmiVerte#listeFourmiVerte
	 */
	public FourmiVerte() {
		Random aleatoire = new Random();
		this.positionX = aleatoire.nextInt(tailleGrille);
		this.positionY = aleatoire.nextInt(tailleGrille);
		this.direction = aleatoire.nextInt(4) + 1;
		listeFourmiVerte.add(this);
	} // Fin Constructeur

	/* Methodes */
	/**
	 * Genere 4 fourmis de couleur et de direction aleatoire puis les place au
	 * centre de la grille.
	 */
	private void replicante() {
		for (int i = 1; i < 8; i++) {
			Random aleatoire = new Random();
			int couleurFourmi = aleatoire.nextInt(8) + 1;
			if (couleurFourmi == 1) {
				FourmiRouge tmpFourmi = new FourmiRouge();
				tmpFourmi.positionX = (tailleGrille / 2);
				tmpFourmi.positionY = (tailleGrille / 2);
				tmpFourmi.direction = i;
				FourmiRouge.listeFourmiRouge.add(tmpFourmi);
			} else if (couleurFourmi == 2) {
				FourmiBleue tmpFourmi = new FourmiBleue();
				tmpFourmi.positionX = (tailleGrille / 2);
				tmpFourmi.positionY = (tailleGrille / 2);
				tmpFourmi.direction = i;
				FourmiBleue.listeFourmiBleue.add(tmpFourmi);
			} else if (couleurFourmi == 3) {
				FourmiVerte tmpFourmi = new FourmiVerte();
				tmpFourmi.positionX = (tailleGrille / 2);
				tmpFourmi.positionY = (tailleGrille / 2);
				tmpFourmi.direction = i;
				FourmiVerte.listeFourmiVerte.add(tmpFourmi);
			} else if (couleurFourmi == 4) {
				FourmiOrange tmpFourmi = new FourmiOrange();
				tmpFourmi.positionX = (tailleGrille / 2);
				tmpFourmi.positionY = (tailleGrille / 2);
				tmpFourmi.direction = i;
				FourmiOrange.listeFourmiOrange.add(tmpFourmi);
			} else if (couleurFourmi == 5) {
				FourmiJaune tmpFourmi = new FourmiJaune();
				tmpFourmi.positionX = (tailleGrille / 2);
				tmpFourmi.positionY = (tailleGrille / 2);
				tmpFourmi.direction = i;
				FourmiJaune.listeFourmiJaune.add(tmpFourmi);
			} else if (couleurFourmi == 6) {
				FourmiViolette tmpFourmi = new FourmiViolette();
				tmpFourmi.positionX = (tailleGrille / 2);
				tmpFourmi.positionY = (tailleGrille / 2);
				tmpFourmi.direction = i;
				FourmiViolette.listeFourmiViolette.add(tmpFourmi);
			} else if (couleurFourmi == 7) {
				FourmiCyan tmpFourmi = new FourmiCyan();
				tmpFourmi.positionX = (tailleGrille / 2);
				tmpFourmi.positionY = (tailleGrille / 2);
				tmpFourmi.direction = i;
				FourmiCyan.listeFourmiCyan.add(tmpFourmi);
			} else if (couleurFourmi == 8) {
				FourmiRose tmpFourmi = new FourmiRose();
				tmpFourmi.positionX = (tailleGrille / 2);
				tmpFourmi.positionY = (tailleGrille / 2);
				tmpFourmi.direction = i;
				FourmiRose.listeFourmiRose.add(tmpFourmi);
			}
		} // FinPour
	} // Fin replicante

	/**
	 * Deplace la fourmi d'une case en fonction de sa direction.
	 * 
	 * @see replicante
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
				|| positionY >= tailleGrille) {
			this.replicante();
			throw new BordureException();
		} // FinSi
	} // Fin deplacement

	/**
	 * Permet a la fourmi d'effectuer une action puis reaffiche la grille.<br>
	 * Dans l'ordre : deplacement.
	 */
	public void uneEtape() {
		try {
			this.deplacement();
		} // FinTry
		catch (BordureException e) {
			listeFourmiVerte.remove(this);
		} // FinCatch
		catch (DirectionInvalideException e) {
			listeFourmiVerte.remove(this);
		} // FinCatch
		finally {
			f.repaint();
			f.setVisible(true);
		} // Fin Finally
	} // Fin uneEtape

} // FinFourmiVerte
