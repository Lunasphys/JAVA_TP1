
package checkInputIsInt;

import java.util.Scanner;

public class CheckIntegerInput {
    public static int entierInt() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Rentrez un entier positif");
            scan.next();
        }
        int nb = scan.nextInt();
        if (nb < 0) {
            System.out.println("Veuillez entrez un entier positif");
            return entierInt();
        }
        return nb;
    }
}

