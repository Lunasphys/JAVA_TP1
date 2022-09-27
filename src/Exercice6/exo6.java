package src.Exercice6;

import src.Utils.CheckIntegerInput;

import java.util.Arrays;

public class exo6 {
    public static void main(String[] args) {
        //Écrire un programme qui demande à l'utilisateur de taper le contenu d'un tableau de réels de 3 lignes et 3 colonnes et qui affiche ce tableau mais en affichant la moyenne des éléments de chaque ligne, de chaque colonne.
        System.out.println("Entrez la taille du tableau (0 pour quitter)");
        int nb = CheckIntegerInput.entierInt();

        double[][] tab = new double[nb][nb];

        for (int i = 0; i < nb; i++) {
            for (int j = 0; j < nb; j++) {

                System.out.println("Entrez la valeur " + "[" + (i+1) + "," + (j+1) + "]");
                float entry = CheckIntegerInput.isFloat();
                tab[i][j] = entry;
            }
        }
        double[][] tab2 = new double[nb][nb];

        for (int i = 0; i < nb; i++) {
            for (int j = 0; j < nb; j++) {
                tab2[i][j] = tab[j][i];
            }
        }
        System.out.println(Arrays.deepToString(tab));
        System.out.println(Arrays.deepToString(tab2));
        double somme_moyenne = 0;
        double somme_moyenne_colonne = 0;
        for (int i = 0; i < nb; i++) {
            double somme = 0;
            double somme_colonne = 0;

            for (int j = 0; j < nb; j++) {
                somme += tab[i][j];
                somme_colonne += tab2[i][j];
            }
            somme_moyenne = somme_moyenne + (somme/nb) ;
            somme_moyenne_colonne = somme_moyenne_colonne + (somme_colonne/nb) ;
            System.out.println("La moyenne de la ligne " + (i+1) + " est de " + somme/nb);
            System.out.println("La moyenne de la colonne" + (i+1) + " est de " + somme_colonne/nb);
        }
        System.out.println("La somme des moyennes de chaque ligne est de " + somme_moyenne);
        System.out.println("La somme des moyennes de chaque colonne est de " + somme_moyenne_colonne);

    }

}
