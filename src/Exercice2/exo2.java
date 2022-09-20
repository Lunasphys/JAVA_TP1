package src.Exercice2;

import checkInputIsInt.CheckIntegerInput;

import java.lang.*;

    public class exo2 {
        public static void main(String[] args) {
        System.out.println("Rentrez la hauteur de l'arbre");
        int nb = CheckIntegerInput.entierInt();
        int largeur = nb * 2 - 1;
        int longueuractuelle = 0;
        String egale = "=";
        String etoile = "*";


            for (int i = 0; i <= largeur ; i++){
                i++;
                longueuractuelle = longueuractuelle + 2;
                    System.out.print(egale.repeat((nb * 3 - longueuractuelle + 1 ) / 2) + etoile.repeat(i) + egale.repeat((nb * 3 - longueuractuelle + 1 ) / 2) +  "\n");

            }
                System.out.println(egale.repeat((nb * 3 - 1 )  /  2  ) +  etoile  + egale.repeat((nb * 3 - 1  )  /  2  ));
                System.out.println(egale.repeat((nb * 3 - 3)  /  2  ) +  etoile.repeat(3)  + egale.repeat((nb * 3 - 3)  /  2  ));
        }
    }

