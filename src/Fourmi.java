/**
 * <b>Fourmi est la classe abstraite contenant les champs pour toutes les
 * fourmis.</b> <br>
 * <br>
 * Elle comporte les informations suivantes :
 * <ul>
 * <li>La taille de la grille.</li>
 * <li>La grille elle-meme.</li>
 * <li>La fenetre affichee.</li>
 * <li>Le nombre de fourmis.</li>
 * <li>Le delai entre deux mouvements de fourmis.</li>
 * <li>Une variable pour commencer au bon moment</li>
 * </ul>
 * 
 * @see FourmiRouge
 * @see FourmiVerte
 * @see FourmiBleue
 * @see FourmiCyan
 * @see FourmiRose
 * @see FourmiJaune
 * @see FourmiOrange
 * @see FourmiViolette
 * 
 * @author DE LEEUW Valerian
 * @author COUASNET Robin
 * 
 * @version 1.0
 */
public abstract class Fourmi {

	/* Champs pour toutes les fourmis */
	/**
	 * La grille dans laquelle les fourmis bougent.
	 */
	static boolean[][] grille;
	/**
	 * La taille de la grille des fourmis.
	 * 
	 * @see Fourmi#grille
	 * @see ParametresGrille
	 */
	static int tailleGrille;
	/**
	 * La fenetre dans laquelle les fourmis sont affichees.
	 * 
	 * @see Fenetre
	 */
	static Fenetre f;
	/**
	 * Le nombre de fourmis vivantes.
	 */
	static int nbFourmi = 0;
	/**
	 * Le delai entre deux mouvements de fourmis.
	 * 
	 * @see ParametresGrille
	 */
	static int delai;
	/**
	 * L'entier permettant le depart des fourmis.
	 */
	static int lancement = 0;

	/* Constructeur */
	/**
	 * Incremente le nombre de fourmi par 1, Initialise la grille si c'est la
	 * premiere fourmi.
	 */
	public Fourmi() {
		if (nbFourmi == 0) {
			initGrille();
		}
		nbFourmi++;
	} // Fin Constructeur

	/* Methodes */
	/**
	 * Initialise toute la grille avec des cases blanches.
	 */
	public void initGrille() {
		int i = 0, j = 0;
		grille = new boolean[tailleGrille][tailleGrille];
		for (; i < tailleGrille; i++) {
			for (; j < tailleGrille; j++) {
				grille[i][j] = false;
			} // FinPour
		} // FinPour
		f = new Fenetre(grille);
		f.setVisible(false);
	} // Fin initGrille

} // FinFourmi
