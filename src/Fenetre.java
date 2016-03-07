import javax.swing.JFrame;

/**
 * <b>Fenetre est la classe permettant d'afficher la fenetre contenant la grille
 * de fourmis.</b> <br>
 * <br>
 * Elle comporte les informations suivantes :
 * <ul>
 * <li>La taille de la grille.</li>
 * <li>La grille elle-meme.</li>
 * </ul>
 * 
 * @see DessinGrille
 * @see ParametresFourmis
 * @see ParametresGrille
 * 
 * @author DE LEEUW Valerian
 * @author COUASNET Robin
 * 
 * @version 1.0
 */
public class Fenetre extends JFrame {

	/* Champs */
	/**
	 * La taille de la grille utilisee localement.
	 */
	private int tailleGrille;
	/**
	 * La grille de fourmi dessinee et peinte.
	 */
	private DessinGrille dessinGrille;

	/* Constructeur */
	/**
	 * Affiche une fenetre de la taille de la grille et contenant la grille.
	 * 
	 * @param grille
	 *            La grille qui sera afficher dans la fenetre.
	 */
	public Fenetre(boolean[][] grille) {

		// Initialisation de la grille
		this.tailleGrille = grille.length;
		this.setSize(tailleGrille + 7, tailleGrille + 28);

		// Creation de la fenetre
		this.setLocation(50, 50);
		dessinGrille = new DessinGrille(grille);
		this.getContentPane().add(dessinGrille);
		this.setTitle("Fourmi de Langton");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	} // Fin Constructeur

} // Fin Fenetre