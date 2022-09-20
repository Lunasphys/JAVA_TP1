package src.Exercice4;

import src.checkInputIsInt.CheckIntegerInput;

public class exo4 {

    public static void main(String[] args) {
        System.out.println("Entrez le nombre de terme de la suite à calculer n avec n > 0 (0 pour terminer) :");
        double nb = CheckIntegerInput.entierInt();
        double res ;
        res = nb - 1 + 1 / nb;
        System.out.println("U"+nb+" est : "+ res);
    }
}
