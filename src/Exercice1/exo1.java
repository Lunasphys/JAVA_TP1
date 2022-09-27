package src.Exercice1;

import src.Menu;
import src.Utils.CheckIntegerInput;

;

// @author : Laurie
public class exo1 {
    public static void main(String[] args) {
        System.out.println("Bienvenue sur le premier exerice");
        System.out.println("Entrer un entier positif (0 pour quitter l'exercice)");
        int nb = CheckIntegerInput.entierInt(); // Regarde si l'input est bien un entier positif
        if (nb == 0) {
            //RETOURNER AU MENU NE PAS OUBLIER
            System.out.println("Fin du programme");
            Menu.main(args);
        }
        double r = Math.sqrt(nb); // Fonction permetant d'avoir la racine carre en donnant sa valeur
        System.out.println("La racine carre de "+nb+ " est " + r );
    }
}
