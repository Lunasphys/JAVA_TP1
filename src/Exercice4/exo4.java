package src.Exercice4;

import src.Menu;
import src.Utils.utils;

/**
 * @author : Obry Maxime
 * CLass de l'exercice 4
 * Calculer la somme des n premiers termes de la suite
 * Un = Un-1 + 1 / n avec n > 0 et U1 = 1
 * La valeur de n sera fournie par l’utilisateur.
 */
public class exo4 {
    /**
     * Fonction principale de l'exercice 4
     *
     * @param args Parametre de la ligne de commande(non utilisé)
     */
    public static void main(String[] args) {
        System.out.println("Entrez le nombre de terme de la suite à calculer n avec n > 0 (0 pour terminer) :");
        int nb = utils.entierInt();
        if (nb == 0) {
            System.out.println("Fin du programme");
            Menu.main(args);
        }
        double U = 0;
        for (float n = 1; n <= nb; n++) {
            U = U + 1 / n;
        }

        System.out.println("U" + nb + " est : " + (double) Math.round(U * 10000) / 10000);
        main(args);
    }
}
