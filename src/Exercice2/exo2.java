package src.Exercice2;

import src.Menu;
import src.Utils.utils;

/**
 * @author : Obry Maxime
 * CLass de l'exercice 2
 * Afficher un arbre de Noel en utilisant les symboles = et *. La hauteur de l’arbre sera donnée
 * par l’utilisateur.
 */
public class exo2 {
    /**
     * Fonction principale de l'exercice 2
     *
     * @param args Parametre de la ligne de commande(non utilisé)
     */
    public static void main(String[] args) {
        System.out.println("Rentrez la hauteur de l'arbre (0 pour quitter)");
        int nb = utils.entierInt();
        if (nb == 0) {
            //RETOURNER AU MENU NE PAS OUBLIER
            System.out.println("Fin du programme");
            Menu.main(args);
        }
        int largeur = nb * 2 - 1;
        int longueuractuelle = 0;
        String egale = "=";
        String etoile = "*";

        for (int i = 0; i <= largeur; i++) {
            i++;
            longueuractuelle = longueuractuelle + 2;
            System.out.print(egale.repeat((nb * 3 - longueuractuelle + 1) / 2) + etoile.repeat(i) + egale.repeat((nb * 3 - longueuractuelle + 1) / 2) + "\n");
        }
        System.out.println(egale.repeat((nb * 3 - 1) / 2) + etoile + egale.repeat((nb * 3 - 1) / 2));
        System.out.println(egale.repeat((nb * 3 - 3) / 2) + etoile.repeat(3) + egale.repeat((nb * 3 - 3) / 2));
        main(args);
    }
}

