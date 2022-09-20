
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

    public static float isFloat() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextFloat()) {
            System.out.println("Rentrez un nombre decimal positif");
            scan.next();
        }
        float nb = scan.nextFloat();
        if (nb < 0) {
            System.out.println("Veuillez entrez un nombre decimal positif");
            return isFloat();
        }
        return nb;
    }

    public static String isString() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextLine()) {
            System.out.println("Rentrez une chaine de caractere");
            scan.next();
        }
        String str = scan.nextLine();
        if (str.length() > 0) {
            return str;
        } else if (str.length() == 0) {
            System.out.println("Votre chaine de caractere est vide ");
            return str;
        }
        return str;
    }

   /* public static boolean isBinary() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int bin = str.length();
        int first = 0;
        for(int i = 0; i < bin; i++) {
            if(str.charAt(i) == '1') {
                first = i;
                break;
            }
        }
        int last = 0;
        for (int i = bin - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                last = i;
                break;
            }
        }

        for (int i = first; i <= last; i++) {
            if (str.charAt(i) == '0') {
                return false;
            }
        }
        return true;
    }

    public static boolean isBinary() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int bin = str.length();
        int first = 0;
        for(int i = 0; i < bin; i++) {
            if(str.charAt(i) == '1') {
                first = i;
                break;
            }
        }
        int last = 0;
        for (int i = bin - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                last = i;
                break;
            }
        }

        for (int i = first; i <= last; i++) {
            if (str.charAt(i) == '0') {
                return false;
            }
        }
        return true;
    }public static String resBinary() {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextLine()) {
            System.out.println("Rentrez un nombre binaire");
            scan.next();
        } else {

        }
        return str;
    }*/

}

