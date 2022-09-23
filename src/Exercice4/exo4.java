package src.Exercice4;

import src.checkInputIsInt.CheckIntegerInput;

public class exo4 {

    public static void main(String[] args) {
        System.out.println("Entrez le nombre de terme de la suite à calculer n avec n > 0 (0 pour terminer) :");
        float nb = CheckIntegerInput.entierInt();
        double U = 0 ;
        for (float n = 1; n <= nb ; n++) {
            U = U   + 1 / n;
        }

        System.out.println("U"+nb+" est : "+ (double)Math.round(U *  10000) / 10000);
    }
}
