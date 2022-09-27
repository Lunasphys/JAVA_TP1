package src.Exercice3;

import src.Menu;
import src.Utils.utils;


/**
 * @author : Jeham Laurie
 * Class de l'exercice 3
 * Ecrire un programme permettant de :
 * Transformer un nombre binaire vers son équivalent décimale
 * Transformer un nombre décimal en binaire
 */
public class exo3 {
    /**
     * Fonction principale de l'exercice 3
     *
     * @param args Parametre de la ligne de commande(non utilisé)
     */
    public static void main(String[] args) {
        System.out.println("Bonjour, que souhaitez-vous faire ?");
        System.out.println("1 - Prendre un nombre decimal et le transformer en binaire ?");
        System.out.println("2 - Prendre un nombre binaire et le transformer en decimal ?");
        int value = utils.entierInt(); // Permet de savoir si l'input est bien un entier positif
        if (value == 1 || value == 2) {
            switch (value) {
                case 1:
                    System.out.println("Quel nombre souhaitez vous prendre ?");
                    int nb = utils.entierInt(); // Permet de savoir si l'input est bien un entier positif
                    String str = Integer.toBinaryString(nb); // Permet de scanner l'input d'un entier positif et le transformer en nombre binaire
                    System.out.println("Le nombre binaire de " + nb + " est " + str);
                    System.out.println("Voulez-vous recommencer (1) ou quitter ? (2)");
                    int quit = utils.entierInt(); // Permet de savoir si l'input est bien un entier positif
                    if (quit == 1 || value == 2) {
                        switch (quit) {
                            case 1:
                                main(args); // Renvoi à l'exercice
                                break;
                            case 2:
                                src.Menu.main(args); // Renvoi au menu
                                break;
                        }
                        break;
                    }
                case 2:
                    System.out.println("Quel nombre binaire souhaitez vous prendre ?");
                    String bin = utils.isBinary(); // Verifie que l'input est bien un nombre binaire
                    System.out.println("Voulez-vous recommencer (1) ou quitter ? (2)");
                    int out = utils.entierInt(); // Permet de savoir si l'input est bien un entier positif
                    if (out == 1 || out == 2) {
                        switch (out) {
                            case 1 -> main(args);
                            case 2 -> Menu.main(args);
                        }
                        break;
                    } else {
                        System.out.println("Veuillez entrer seulement l'un des deux choix");
                        main(args);
                    }
            }
        }
    }
}