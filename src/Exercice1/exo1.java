package src.Exercice1;

import src.checkInputIsInt.checkIntegerInput;

import java.lang.*;


public class exo1 {
    public static void main (String[] args) {
        System.out.println("Bienvenue sur le premier exerice");
        System.out.println("Veuillez entrer une valeur positive");
        int nb = checkIntegerInput.entierInt();
        System.out.println("aled" );
        double r = Math.sqrt(nb);
        System.out.println("La racine carre de "+nb+ " est " + r );
    }
}
