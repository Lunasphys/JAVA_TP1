import checkInputIsInt.CheckIntegerInput;

import java.lang.*;


public class exo1 {
    public static void main (String[] args) {
        System.out.println("Bienvenue sur le premier exerice");
        System.out.println("Entrer un entier positif (0 pour quitter l'exercice)");
        int nb = CheckIntegerInput.entierInt();
        if (nb == 0) {
            //RETOURNER AU MENU NE PAS OUBLIER
        }
        double r = Math.sqrt(nb);
        System.out.println("La racine carre de "+nb+ " est " + r );
    }
}
