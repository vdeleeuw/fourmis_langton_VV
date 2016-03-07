import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

/**
 * <b>DessinGrille est la classe permettant de peindre la grille de fourmis.</b> <br>
 * <br>
 * Elle comporte les informations suivantes :
 * <ul>
 * <li>La taille de la grille.</li>
 * <li>La grille elle-meme.</li>
 * </ul>
 * 
 * @see Fenetre
 * 
 * @author DE LEEUW Valerian
 * @author COUASNET Robin
 * 
 * @version 1.0
 */
public class DessinGrille extends JPanel {

	/* Champs */
	/**
	 * La taille de la grille utilisee localement.
	 */
	private int tailleGrille;

	/**
	 * La grille utilisee localement.
	 */
	private boolean[][] grille;

	/* Constructeur */
	/**
	 * Constructeur initialisant les champs locaux.
	 * 
	 * @param grille
	 *            La grille permettant de copier les champs locaux necessaires.
	 */
	public DessinGrille(boolean[][] grille) {
		this.grille = grille;
		this.tailleGrille = grille.length;
		this.setSize(tailleGrille, tailleGrille);
	} // FinConstructeur

	/* Methodes */
	/**
	 * Repeint la grille et les fourmis.
	 * 
	 * @param g
	 *            Le graphique qui est peint.
	 */
	public void paint(Graphics g) {
		for (int i = 0; i < tailleGrille; i++) {
			for (int j = 0; j < tailleGrille; j++) {
				if (grille[i][j] == true) {
					g.setColor(Color.BLACK);
					g.fillRect(i, j, 1, 1);
				} // FinAlors
				else {
					g.setColor(Color.WHITE);
					g.fillRect(i, j, 1, 1);
				} // FinSinon
			} // FinPour
		} // FinPour
		for (int j = 0; j < FourmiRouge.listeFourmiRouge.size(); j++) {
			FourmiRouge tmpFouRouge = FourmiRouge.listeFourmiRouge.get(j);
			g.setColor(Color.RED);
			g.fillRect(tmpFouRouge.positionX, tmpFouRouge.positionY, 1, 1);
			if(tmpFouRouge.direction==1){
				g.fillRect(tmpFouRouge.positionX,tmpFouRouge.positionY-1,1,1);
				g.fillRect(tmpFouRouge.positionX+1,tmpFouRouge.positionY,1,1);
				g.fillRect(tmpFouRouge.positionX-1,tmpFouRouge.positionY,1,1);
			}else if(tmpFouRouge.direction==2){
				g.fillRect(tmpFouRouge.positionX+1,tmpFouRouge.positionY,1,1);
				g.fillRect(tmpFouRouge.positionX,tmpFouRouge.positionY+1,1,1);
				g.fillRect(tmpFouRouge.positionX,tmpFouRouge.positionY-1,1,1);
			}else if(tmpFouRouge.direction==3){
				g.fillRect(tmpFouRouge.positionX,tmpFouRouge.positionY+1,1,1);
				g.fillRect(tmpFouRouge.positionX+1,tmpFouRouge.positionY,1,1);
				g.fillRect(tmpFouRouge.positionX-1,tmpFouRouge.positionY,1,1);
			}else if(tmpFouRouge.direction==4){
				g.fillRect(tmpFouRouge.positionX-1,tmpFouRouge.positionY,1,1);
				g.fillRect(tmpFouRouge.positionX,tmpFouRouge.positionY+1,1,1);
				g.fillRect(tmpFouRouge.positionX,tmpFouRouge.positionY-1,1,1);
			}
		} // FinPour
		for (int j = 0; j < FourmiBleue.listeFourmiBleue.size(); j++) {
			FourmiBleue tmpFouBleue = FourmiBleue.listeFourmiBleue.get(j);
			g.setColor(Color.BLUE);
			g.fillRect(tmpFouBleue.positionX, tmpFouBleue.positionY, 1, 1);
			if(tmpFouBleue.direction==1){
				g.fillRect(tmpFouBleue.positionX,tmpFouBleue.positionY-1,1,1);
				g.fillRect(tmpFouBleue.positionX+1,tmpFouBleue.positionY,1,1);
				g.fillRect(tmpFouBleue.positionX-1,tmpFouBleue.positionY,1,1);
			}else if(tmpFouBleue.direction==2){
				g.fillRect(tmpFouBleue.positionX+1,tmpFouBleue.positionY,1,1);
				g.fillRect(tmpFouBleue.positionX,tmpFouBleue.positionY+1,1,1);
				g.fillRect(tmpFouBleue.positionX,tmpFouBleue.positionY-1,1,1);
			}else if(tmpFouBleue.direction==3){
				g.fillRect(tmpFouBleue.positionX,tmpFouBleue.positionY+1,1,1);
				g.fillRect(tmpFouBleue.positionX+1,tmpFouBleue.positionY,1,1);
				g.fillRect(tmpFouBleue.positionX-1,tmpFouBleue.positionY,1,1);
			}else if(tmpFouBleue.direction==4){
				g.fillRect(tmpFouBleue.positionX-1,tmpFouBleue.positionY,1,1);
				g.fillRect(tmpFouBleue.positionX,tmpFouBleue.positionY+1,1,1);
				g.fillRect(tmpFouBleue.positionX,tmpFouBleue.positionY-1,1,1);
			}
		} // FinPour
		for (int j = 0; j < FourmiJaune.listeFourmiJaune.size(); j++) {
			FourmiJaune tmpFouJaune = FourmiJaune.listeFourmiJaune.get(j);
			g.setColor(Color.YELLOW);
			g.fillRect(tmpFouJaune.positionX, tmpFouJaune.positionY, 1, 1);
			if(tmpFouJaune.direction==1){
				g.fillRect(tmpFouJaune.positionX,tmpFouJaune.positionY-1,1,1);
				g.fillRect(tmpFouJaune.positionX+1,tmpFouJaune.positionY,1,1);
				g.fillRect(tmpFouJaune.positionX-1,tmpFouJaune.positionY,1,1);
			}else if(tmpFouJaune.direction==2){
				g.fillRect(tmpFouJaune.positionX+1,tmpFouJaune.positionY,1,1);
				g.fillRect(tmpFouJaune.positionX,tmpFouJaune.positionY+1,1,1);
				g.fillRect(tmpFouJaune.positionX,tmpFouJaune.positionY-1,1,1);
			}else if(tmpFouJaune.direction==3){
				g.fillRect(tmpFouJaune.positionX,tmpFouJaune.positionY+1,1,1);
				g.fillRect(tmpFouJaune.positionX+1,tmpFouJaune.positionY,1,1);
				g.fillRect(tmpFouJaune.positionX-1,tmpFouJaune.positionY,1,1);
			}else if(tmpFouJaune.direction==4){
				g.fillRect(tmpFouJaune.positionX-1,tmpFouJaune.positionY,1,1);
				g.fillRect(tmpFouJaune.positionX,tmpFouJaune.positionY+1,1,1);
				g.fillRect(tmpFouJaune.positionX,tmpFouJaune.positionY-1,1,1);
			}
		} // FinPour
		for (int j = 0; j < FourmiOrange.listeFourmiOrange.size(); j++) {
			FourmiOrange tmpFouOrange = FourmiOrange.listeFourmiOrange.get(j);
			g.setColor(Color.ORANGE);
			g.fillRect(tmpFouOrange.positionX, tmpFouOrange.positionY, 1, 1);
			if(tmpFouOrange.direction==1){
				g.fillRect(tmpFouOrange.positionX,tmpFouOrange.positionY-1,1,1);
				g.fillRect(tmpFouOrange.positionX+1,tmpFouOrange.positionY,1,1);
				g.fillRect(tmpFouOrange.positionX-1,tmpFouOrange.positionY,1,1);
			}else if(tmpFouOrange.direction==2){
				g.fillRect(tmpFouOrange.positionX+1,tmpFouOrange.positionY,1,1);
				g.fillRect(tmpFouOrange.positionX,tmpFouOrange.positionY+1,1,1);
				g.fillRect(tmpFouOrange.positionX,tmpFouOrange.positionY-1,1,1);
			}else if(tmpFouOrange.direction==3){
				g.fillRect(tmpFouOrange.positionX,tmpFouOrange.positionY+1,1,1);
				g.fillRect(tmpFouOrange.positionX+1,tmpFouOrange.positionY,1,1);
				g.fillRect(tmpFouOrange.positionX-1,tmpFouOrange.positionY,1,1);
			}else if(tmpFouOrange.direction==4){
				g.fillRect(tmpFouOrange.positionX-1,tmpFouOrange.positionY,1,1);
				g.fillRect(tmpFouOrange.positionX,tmpFouOrange.positionY+1,1,1);
				g.fillRect(tmpFouOrange.positionX,tmpFouOrange.positionY-1,1,1);
			}
		} // FinPour
		for (int j = 0; j < FourmiVerte.listeFourmiVerte.size(); j++) {
			FourmiVerte tmpFouVerte = FourmiVerte.listeFourmiVerte.get(j);
			g.setColor(Color.GREEN);
			g.fillRect(tmpFouVerte.positionX, tmpFouVerte.positionY, 1, 1);
			if(tmpFouVerte.direction==1){
				g.fillRect(tmpFouVerte.positionX,tmpFouVerte.positionY-1,1,1);
				g.fillRect(tmpFouVerte.positionX+1,tmpFouVerte.positionY,1,1);
				g.fillRect(tmpFouVerte.positionX-1,tmpFouVerte.positionY,1,1);
			}else if(tmpFouVerte.direction==2){
				g.fillRect(tmpFouVerte.positionX+1,tmpFouVerte.positionY,1,1);
				g.fillRect(tmpFouVerte.positionX,tmpFouVerte.positionY+1,1,1);
				g.fillRect(tmpFouVerte.positionX,tmpFouVerte.positionY-1,1,1);
			}else if(tmpFouVerte.direction==3){
				g.fillRect(tmpFouVerte.positionX,tmpFouVerte.positionY+1,1,1);
				g.fillRect(tmpFouVerte.positionX+1,tmpFouVerte.positionY,1,1);
				g.fillRect(tmpFouVerte.positionX-1,tmpFouVerte.positionY,1,1);
			}else if(tmpFouVerte.direction==4){
				g.fillRect(tmpFouVerte.positionX-1,tmpFouVerte.positionY,1,1);
				g.fillRect(tmpFouVerte.positionX,tmpFouVerte.positionY+1,1,1);
				g.fillRect(tmpFouVerte.positionX,tmpFouVerte.positionY-1,1,1);
			}
		} // FinPour
		for (int j = 0; j < FourmiViolette.listeFourmiViolette.size(); j++) {
			FourmiViolette tmpFouViolette = FourmiViolette.listeFourmiViolette
					.get(j);
			g.setColor(Color.MAGENTA);
			g.fillRect(tmpFouViolette.positionX, tmpFouViolette.positionY, 1, 1);
			if(tmpFouViolette.direction==1){
				g.fillRect(tmpFouViolette.positionX,tmpFouViolette.positionY-1,1,1);
				g.fillRect(tmpFouViolette.positionX+1,tmpFouViolette.positionY,1,1);
				g.fillRect(tmpFouViolette.positionX-1,tmpFouViolette.positionY,1,1);
			}else if(tmpFouViolette.direction==2){
				g.fillRect(tmpFouViolette.positionX+1,tmpFouViolette.positionY,1,1);
				g.fillRect(tmpFouViolette.positionX,tmpFouViolette.positionY+1,1,1);
				g.fillRect(tmpFouViolette.positionX,tmpFouViolette.positionY-1,1,1);
			}else if(tmpFouViolette.direction==3){
				g.fillRect(tmpFouViolette.positionX,tmpFouViolette.positionY+1,1,1);
				g.fillRect(tmpFouViolette.positionX+1,tmpFouViolette.positionY,1,1);
				g.fillRect(tmpFouViolette.positionX-1,tmpFouViolette.positionY,1,1);
			}else if(tmpFouViolette.direction==4){
				g.fillRect(tmpFouViolette.positionX-1,tmpFouViolette.positionY,1,1);
				g.fillRect(tmpFouViolette.positionX,tmpFouViolette.positionY+1,1,1);
				g.fillRect(tmpFouViolette.positionX,tmpFouViolette.positionY-1,1,1);
			}
		} // FinPour
		for (int j = 0; j < FourmiCyan.listeFourmiCyan.size(); j++) {
			FourmiCyan tmpFouCyan = FourmiCyan.listeFourmiCyan.get(j);
			g.setColor(Color.CYAN);
			g.fillRect(tmpFouCyan.positionX, tmpFouCyan.positionY, 1, 1);
			if(tmpFouCyan.direction==1){
				g.fillRect(tmpFouCyan.positionX,tmpFouCyan.positionY-1,1,1);
				g.fillRect(tmpFouCyan.positionX+1,tmpFouCyan.positionY,1,1);
				g.fillRect(tmpFouCyan.positionX-1,tmpFouCyan.positionY,1,1);
			}else if(tmpFouCyan.direction==2){
				g.fillRect(tmpFouCyan.positionX+1,tmpFouCyan.positionY,1,1);
				g.fillRect(tmpFouCyan.positionX,tmpFouCyan.positionY+1,1,1);
				g.fillRect(tmpFouCyan.positionX,tmpFouCyan.positionY-1,1,1);
			}else if(tmpFouCyan.direction==3){
				g.fillRect(tmpFouCyan.positionX,tmpFouCyan.positionY+1,1,1);
				g.fillRect(tmpFouCyan.positionX+1,tmpFouCyan.positionY,1,1);
				g.fillRect(tmpFouCyan.positionX-1,tmpFouCyan.positionY,1,1);
			}else if(tmpFouCyan.direction==4){
				g.fillRect(tmpFouCyan.positionX-1,tmpFouCyan.positionY,1,1);
				g.fillRect(tmpFouCyan.positionX,tmpFouCyan.positionY+1,1,1);
				g.fillRect(tmpFouCyan.positionX,tmpFouCyan.positionY-1,1,1);
			}
		} // FinPour
		for (int j = 0; j < FourmiRose.listeFourmiRose.size(); j++) {
			FourmiRose tmpFouRose = FourmiRose.listeFourmiRose.get(j);
			g.setColor(Color.PINK);
			g.fillRect(tmpFouRose.positionX, tmpFouRose.positionY, 1, 1);
			if(tmpFouRose.direction==1){
				g.fillRect(tmpFouRose.positionX,tmpFouRose.positionY-1,1,1);
				g.fillRect(tmpFouRose.positionX+1,tmpFouRose.positionY,1,1);
				g.fillRect(tmpFouRose.positionX-1,tmpFouRose.positionY,1,1);
			}else if(tmpFouRose.direction==2){
				g.fillRect(tmpFouRose.positionX+1,tmpFouRose.positionY,1,1);
				g.fillRect(tmpFouRose.positionX,tmpFouRose.positionY+1,1,1);
				g.fillRect(tmpFouRose.positionX,tmpFouRose.positionY-1,1,1);
			}else if(tmpFouRose.direction==3){
				g.fillRect(tmpFouRose.positionX,tmpFouRose.positionY+1,1,1);
				g.fillRect(tmpFouRose.positionX+1,tmpFouRose.positionY,1,1);
				g.fillRect(tmpFouRose.positionX-1,tmpFouRose.positionY,1,1);
			}else if(tmpFouRose.direction==4){
				g.fillRect(tmpFouRose.positionX-1,tmpFouRose.positionY,1,1);
				g.fillRect(tmpFouRose.positionX,tmpFouRose.positionY+1,1,1);
				g.fillRect(tmpFouRose.positionX,tmpFouRose.positionY-1,1,1);
			}
		} // FinPour
	} // Finpaint

} // Fin DessinGrille