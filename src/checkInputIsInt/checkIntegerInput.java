
package src.checkInputIsInt;
import java.util.Scanner;

public class checkIntegerInput {
    public static int entierInt() {
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        if (sc.hasNextInt()) {
            System.out.println("Vous avez choisi l'entier " + nb + " , merci");
            return nb;
        } else if (nb < 0){
            System.out.println("Veuillez rentrer un entier positif et NON negatif comme demandé");;
        }
        return nb;
    }

}

