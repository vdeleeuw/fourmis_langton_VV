import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * <b>ParametresFourmis est la classe representant les parametres sur les
 * fourmis.</b> <br>
 * Elle comporte les informations suivantes :
 * <ul>
 * <li>Le nombre de chaque fourmis.</li>
 * <li>Un boutton pour valider.</li>
 * </ul>
 * 
 * @see Fourmi
 * 
 * @author DE LEEUW Valerian
 * @author COUASNET Robin
 * 
 * @version 1.0
 */
public class ParametresFourmis extends JFrame implements ActionListener {

	/* Champs */
	/**
	 * Le contenu de la fenetre.
	 */
	JPanel container = new JPanel();
	/**
	 * Le nombre de fourmis rouges.
	 */
	JTextField champNbFouRouge = new JTextField("0");
	/**
	 * Le nombre de fourmis bleues.
	 */
	JTextField champNbFouBleue = new JTextField("0");
	/**
	 * Le nombre de fourmis jaunes.
	 */
	JTextField champNbFouJaune = new JTextField("0");
	/**
	 * Le nombre de fourmis oranges.
	 */
	JTextField champNbFouOrange = new JTextField("0");
	/**
	 * Le nombre de fourmis vertes.
	 */
	JTextField champNbFouVerte = new JTextField("0");
	/**
	 * Le nombre de fourmis violettes.
	 */
	JTextField champNbFouViolette = new JTextField("0");
	/**
	 * Le nombre de fourmis cyans.
	 */
	JTextField champNbFouCyan = new JTextField("0");
	/**
	 * Le nombre de fourmis roses.
	 */
	JTextField champNbFouRose = new JTextField("0");
	/**
	 * Le boutton pour valider.
	 */
	JButton OK = new JButton("Ok");

	/* Constructeur */
	/**
	 * Ouvre une fenetre demandant a l'utilisateur de remplir les champs.
	 */
	public ParametresFourmis() {

		// Creation de la fenetre
		this.setLocation(50, 50);
		this.setSize(250, 310);
		this.setTitle("Paramètres des fourmis");

		container.add(new JLabel("Nombre de fourmis rouges : "));
		container.add(champNbFouRouge);
		champNbFouRouge.setPreferredSize(new Dimension(50, 25));
		container.add(new JLabel("Nombre de fourmis bleues : "));
		container.add(champNbFouBleue);
		champNbFouBleue.setPreferredSize(new Dimension(50, 25));
		container.add(new JLabel("Nombre de fourmis jaunes : "));
		container.add(champNbFouJaune);
		champNbFouJaune.setPreferredSize(new Dimension(50, 25));
		container.add(new JLabel("Nombre de fourmis oranges : "));
		container.add(champNbFouOrange);
		champNbFouOrange.setPreferredSize(new Dimension(50, 25));
		container.add(new JLabel("Nombre de fourmis vertes : "));
		container.add(champNbFouVerte);
		champNbFouVerte.setPreferredSize(new Dimension(50, 25));
		container.add(new JLabel("Nombre de fourmis violettes : "));
		container.add(champNbFouViolette);
		champNbFouViolette.setPreferredSize(new Dimension(50, 25));
		container.add(new JLabel("Nombre de fourmis cyans : "));
		container.add(champNbFouCyan);
		champNbFouCyan.setPreferredSize(new Dimension(50, 25));
		container.add(new JLabel("Nombre de fourmis roses : "));
		container.add(champNbFouRose);
		champNbFouRose.setPreferredSize(new Dimension(50, 25));

		// Boutton Ok
		OK.addActionListener(this);
		container.add(OK);

		this.getContentPane().add(container, BorderLayout.CENTER);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	// Action du boutton OK
	/**
	 * Verifie que chaque champs comporte bien un entier positif avant de
	 * valider.
	 */
	public void actionPerformed(ActionEvent e) {
		try {
			// Test champNbFouRouge
			int nbFouRouge = Integer.parseInt(champNbFouRouge.getText());
			if (nbFouRouge >= 0)
				for (int i = 0; i < nbFouRouge; i++)
					new FourmiRouge();
			else
				JOptionPane.showMessageDialog(new JPanel(),
						"Le champ nbFouRouge doit etre >= a 0 !", "Erreur",
						JOptionPane.ERROR_MESSAGE);

			// Test champNbFouBleue
			int nbFouBleue = Integer.parseInt(champNbFouBleue.getText());
			if (nbFouBleue >= 0)
				for (int i = 0; i < nbFouBleue; i++)
					new FourmiBleue();
			else
				JOptionPane.showMessageDialog(new JPanel(),
						"Le champ nbFouBleue doit etre >= a 0 !", "Erreur",
						JOptionPane.ERROR_MESSAGE);

			// Test champNbFouJaune
			int nbFouJaune = Integer.parseInt(champNbFouJaune.getText());
			if (nbFouJaune >= 0)
				for (int i = 0; i < nbFouJaune; i++)
					new FourmiJaune();
			else
				JOptionPane.showMessageDialog(new JPanel(),
						"Le champ nbFouJaune doit etre >= a 0 !", "Erreur",
						JOptionPane.ERROR_MESSAGE);

			// Test champNbFouOrange
			int nbFouOrange = Integer.parseInt(champNbFouOrange.getText());
			if (nbFouOrange >= 0)
				for (int i = 0; i < nbFouOrange; i++)
					new FourmiOrange();
			else
				JOptionPane.showMessageDialog(new JPanel(),
						"Le champ nbFouOrange doit etre >= a 0 !", "Erreur",
						JOptionPane.ERROR_MESSAGE);

			// Test champNbFouVerte
			int nbFouVerte = Integer.parseInt(champNbFouVerte.getText());
			if (nbFouVerte >= 0)
				for (int i = 0; i < nbFouVerte; i++)
					new FourmiVerte();
			else
				JOptionPane.showMessageDialog(new JPanel(),
						"Le champ nbFouVerte doit etre >= a 0 !", "Erreur",
						JOptionPane.ERROR_MESSAGE);

			// Test champNbFouViolette
			int nbFouViolette = Integer.parseInt(champNbFouViolette.getText());
			if (nbFouViolette >= 0)
				for (int i = 0; i < nbFouViolette; i++)
					new FourmiViolette();
			else
				JOptionPane.showMessageDialog(new JPanel(),
						"Le champ nbFouViolette doit etre >= a 0 !", "Erreur",
						JOptionPane.ERROR_MESSAGE);

			// Test champNbFouRose
			int nbFouRose = Integer.parseInt(champNbFouRose.getText());
			if (nbFouRose >= 0)
				for (int i = 0; i < nbFouRose; i++)
					new FourmiRose();
			else
				JOptionPane.showMessageDialog(new JPanel(),
						"Le champ nbFouRose doit etre >= a 0 !", "Erreur",
						JOptionPane.ERROR_MESSAGE);

			// Test champNbFouCyan
			int nbFouCyan = Integer.parseInt(champNbFouCyan.getText());
			if (nbFouCyan >= 0)
				for (int i = 0; i < nbFouCyan; i++)
					new FourmiCyan();
			else
				JOptionPane.showMessageDialog(new JPanel(),
						"Le champ nbFouCyan doit etre >= a 0 !", "Erreur",
						JOptionPane.ERROR_MESSAGE);

			// Tout les champs sont ok, on passe a l'etape suivante
			container.setVisible(true);
			Fourmi.lancement = 2;
			this.dispose();
		} // FinTry
		catch (NumberFormatException nFE) {
			JOptionPane.showMessageDialog(new JPanel(),
					"Un des champs n'est pas un entier !", "Erreur",
					JOptionPane.ERROR_MESSAGE);
		} // FinCatch
	}
}
