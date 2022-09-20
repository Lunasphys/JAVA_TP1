package src.Exercice2;

import src.checkInputIsInt.CheckIntegerInput;

import java.lang.*;

public class exo2 {
    public static void main(String[] args) {
        System.out.println("Rentrez la hauteur de l'arbre");
        int largeur = 15;
        char egale = '=';
        char etoile = '*';
        int nb = CheckIntegerInput.entierInt();
        for (int it = 0 ; it < largeur ; it ++) {
            System.out.print(egale);
            for (int i = 1; i < nb; i++) {
                System.out.println(egale);
            }
        }
        }
    }

