package src;

import src.Utils.utils;

import java.util.Scanner;


/**
 * @author : Obry Maxime and Jeham Laurie
 * Class pour créer le menu
 */
public class Menu {

    /**
     * Fonction principale du menu
     * @param args Parametre de la ligne de commande(non utilisé)
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("======== Bonjour, choisissez un exercice ========");
        System.out.println("****************************");
        System.out.println("======== Exercice 1 : Racine d'un nombre ========");
        System.out.println("======== Exercice 2 : Arbre de Noel =============");
        System.out.println("======== Exercice 3 : Nombre Binaire ============");
        System.out.println("======== Exercice 4 : Suite =====================");
        System.out.println("======== Exercice 5 : Somme =====================");
        System.out.println("======== Exercice 6 : Tableau ===================");
        System.out.println("Quel exercice souhaitez-vous faire ?");
        int value = utils.entierInt();
        while (true) {
            switch (value) {
                case 1:
                    src.Exercice1.exo1.main(args);
                    Menu.main(args);
                    break;
                case 2:
                    src.Exercice2.exo2.main(args);
                    Menu.main(args);
                    break;
                case 3:
                    src.Exercice3.exo3.main(args);
                    Menu.main(args);
                    break;
                case 4:
                    src.Exercice4.exo4.main(args);
                    Menu.main(args);
                    break;
                case 5:
                    src.Exercice5.exo5.main(args);
                    Menu.main(args);
                    break;
                case 6:
                    src.Exercice6.exo6.main(args);
                    Menu.main(args);
                    break;
            }
            System.out.println("Veuillez entrer un nombre entre 1 et 6");
            Menu.main(args);
            break;
        }

    }
}
