package src.Exercice5;

import src.Utils.utils;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Laurie
 * Class de l'exercice 5
 * Ecrire et tester une méthode de la classe TP qui calcule la somme des éléments d’un tableau de flottants.
 * La taille du tableau sera fournie par l’utilisateur
 */
public class exo5 {
    /**
     * Fonction principale de l'exercice 5
     *
     * @param args Parametre de la ligne de commande(non utilisé)
     */
    public static void main(String[] args) {
        System.out.println("Bienvenue sur le cinquième exercice");
        while (true) {
            System.out.println("Veuillez saisir la taille du tableau (0 pour terminer) : ");
            int nb = utils.entierInt(); // Permet de savoir si l'input est bien un entier positif
            if (nb == 0) {
                src.Menu.main(args); // Renvoie au menu
            }
            String[] tableau = new String[nb]; // Crée un tableau de string de la taille de l'input donné
            System.out.println("La taille de votre tableau est de " + nb);
            System.out.println("Saisissez les floats ou les ints que vous souhaitez integrer dans votre nouveau tableau ");
            float somme = 0;
            Arrays.fill(tableau, ""); // Permet d'enlever la string "null" sur chaque index
            for (int i = 0; i <= tableau.length - 1; i++) { // Boucle qui permet d'ajouter chaque nouveau float au tableau
                System.out.println("Entrez la valeur n° " + (i + 1));
                Scanner scan = new Scanner(System.in);
                String str = scan.next();
                if (utils.isFloat(str)) { // Verifie si l'input donné est bien un float
                    tableau[i] += str;
                    somme += Float.parseFloat(str); // Permet d'additionner chaque décimal dans le tableau
                } else {
                    i--;
                }
            }
            System.out.println(Arrays.toString(tableau));
            System.out.println("La somme des decimaux dans ce tableau est de : " + somme);
        }
    }
}
