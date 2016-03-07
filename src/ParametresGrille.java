import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * <b>ParametresGrille est la classe representant les parametres sur la
 * grille.</b> <br>
 * Elle comporte les informations suivantes :
 * <ul>
 * <li>La taille de la grille.</li>
 * <li>Le delai entre les actions de chaque fourmi.</li>
 * <li>Un boutton pour valider.</li>
 * </ul>
 * 
 * @see DessinGrille
 * 
 * @author DE LEEUW Valerian
 * @author COUASNET Robin
 * 
 * @version 1.0
 */
public class ParametresGrille extends JFrame implements ActionListener {

	/* Champs */
	/**
	 * Le contenu de la fenetre.
	 */
	JPanel container = new JPanel();
	/**
	 * La taille de la grille.
	 */
	JTextField champTaille = new JTextField("300");
	/**
	 * Le delai souhaite.
	 */
	JTextField champDelai = new JTextField("0");
	/**
	 * Le boutton pour valider.
	 */
	JButton OK = new JButton("Ok");

	/* Constructeur */
	/**
	 * Ouvre une fenetre demandant a l'utilisateur de remplir les champs.
	 * 
	 * @param tailleGrille
	 *            La taille de la grille (par defaut = 300).
	 * @param duree
	 *            Le delai (par defaut = 0).
	 */
	public ParametresGrille(int tailleGrille, int duree) {

		// Creation de la fenetre
		this.setLocation(50, 50);
		this.setSize(200, 125);
		this.setTitle("Paramètres de la Grille");

		container.add(new JLabel("Taille de la grille : "));
		container.add(champTaille);
		champTaille.setPreferredSize(new Dimension(50, 25));
		container.add(new JLabel("Delai du mode auto : "));
		container.add(champDelai);
		champDelai.setPreferredSize(new Dimension(50, 25));

		// Boutton Ok
		OK.addActionListener(this);
		container.add(OK);
		this.getContentPane().add(container, BorderLayout.CENTER);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	} // Fin Constructeur

	/* Methodes */
	/**
	 * Verifie que chaque champs comporte bien un entier positif avant de
	 * valider.
	 */
	public void actionPerformed(ActionEvent e) {
		try {
			Fourmi.tailleGrille = Integer.parseInt(champTaille.getText());
			Fourmi.delai = Integer.parseInt(champDelai.getText()) * 1000;
			if (Fourmi.tailleGrille > 0 && Fourmi.delai >= 0) {
				container.setVisible(true);
				Fourmi.lancement = 1;
				this.dispose();
			} // FinAlors
			else
				JOptionPane
						.showMessageDialog(
								new JPanel(),
								"Un des champs n'est pas un entier positif ! \n Rappel : tailleGrille > 0 et delai >= 0",
								"Erreur", JOptionPane.ERROR_MESSAGE);
		} // Fin Try
		catch (NumberFormatException nFE) {
			JOptionPane.showMessageDialog(new JPanel(),
					"Un des champs n'est pas un entier !", "Erreur",
					JOptionPane.ERROR_MESSAGE);
		} // Fin Catch
	} // Fin actionPerformed

} // Fin ParametresGrille
