package src.Exercice1;

import src.Menu;
import src.Utils.utils;

;

/**
 * @author : Jeham Laurie
 * Class de l'exercice 1
 * Ecrire un programme qui calcule la racine carrée de nombres fournis par l’utilisateur.
 * Ce programme devra afficher une erreur si l’utilisateur fournit des valeurs négatives,
 * et s’arrêter lorsque l’utilisateur entre la valeur 0.
 */
public class exo1 {
    /**
     * Fonction principale de l'exercice 1
     *
     * @param args Parametre de la ligne de commande(non utilisé)
     */
    public static void main(String[] args) {
        System.out.println("Bienvenue sur le premier exerice");
        System.out.println("Entrer un entier positif (0 pour quitter l'exercice)");
        int nb = utils.entierInt(); // Regarde si l'input est bien un entier positif
        if (nb == 0) {
            //RETOURNER AU MENU NE PAS OUBLIER
            System.out.println("Fin du programme");
            Menu.main(args);
        }
        double r = Math.sqrt(nb); // Fonction permetant d'avoir la racine carre en donnant sa valeur
        System.out.println("La racine carre de " + nb + " est " + r);
    }
}
