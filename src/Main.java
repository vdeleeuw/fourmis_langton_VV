/**
 * <b>Main est la classe representant le lacement du programme.</b> <br>
 * Elle recupere les donnees aupres de l'utilisateur puis execute le programme. 
 *  
 * @see Fourmi
 * @see ParametresFourmis
 * @see ParametresGrille
 * 
 * @author DE LEEUW Valerian
 * @author COUASNET Robin
 * 
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {

		ParametresGrille PG = new ParametresGrille(Fourmi.tailleGrille,
				Fourmi.delai);

		while (Fourmi.lancement == 0) {
			try {
				Thread.sleep(1000);
			} // FinTry
			catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			} // FinCatch
		}

		ParametresFourmis PF = new ParametresFourmis();

		while (Fourmi.lancement == 1) {
			try {
				Thread.sleep(1000);
			} // FinTry
			catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			} // FinCatch
		}

		// Deplacement fourmi
		while (Fourmi.nbFourmi > 0 && Fourmi.lancement == 2) {
			for (int j = 0; j < FourmiRouge.listeFourmiRouge.size(); j++) {
				FourmiRouge tmpFouRouge = FourmiRouge.listeFourmiRouge.get(j);
				tmpFouRouge.uneEtape();
			} // FinPour
			for (int j = 0; j < FourmiBleue.listeFourmiBleue.size(); j++) {
				FourmiBleue tmpFouBleue = FourmiBleue.listeFourmiBleue.get(j);
				tmpFouBleue.uneEtape();
			} // FinPour
			for (int j = 0; j < FourmiJaune.listeFourmiJaune.size(); j++) {
				FourmiJaune tmpFouJaune = FourmiJaune.listeFourmiJaune.get(j);
				tmpFouJaune.uneEtape();
			} // FinPour
			for (int j = 0; j < FourmiOrange.listeFourmiOrange.size(); j++) {
				FourmiOrange tmpFouOrange = FourmiOrange.listeFourmiOrange.get(j);
				tmpFouOrange.uneEtape();
			} // FinPour
			for (int j = 0; j < FourmiVerte.listeFourmiVerte.size(); j++) {
				FourmiVerte tmpFouVerte = FourmiVerte.listeFourmiVerte.get(j);
				tmpFouVerte.uneEtape();
			} // FinPour
			for (int j = 0; j < FourmiViolette.listeFourmiViolette.size(); j++) {
				FourmiViolette tmpFouViolette = FourmiViolette.listeFourmiViolette.get(j);
				tmpFouViolette.uneEtape();
			} // FinPour
			for (int j = 0; j < FourmiCyan.listeFourmiCyan.size(); j++) {
				FourmiCyan tmpFouCyan = FourmiCyan.listeFourmiCyan.get(j);
				tmpFouCyan.uneEtape();
			} // FinPour
			for (int j = 0; j < FourmiRose.listeFourmiRose.size(); j++) {
				FourmiRose tmpFouRose = FourmiRose.listeFourmiRose.get(j);
				tmpFouRose.uneEtape();
			} // FinPour

			// Delai
			try {
				Thread.sleep(Fourmi.delai);
			} // Fin Try
			catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			} // Fin Catch
		} // Fin TantQue

	} // Fin main

} // Fin Main

