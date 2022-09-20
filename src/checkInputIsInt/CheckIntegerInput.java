
package src.checkInputIsInt;

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


    public static String isBinary() {
        String num;
        Scanner scan = new Scanner(System.in);
        num = scan.next();
        while (!num.startsWith("1")) {
            System.out.println("Rentrez un nombre binaire commencant par 1, composé de 0 et de 1");
            return num;
        }
            if (num.matches("[01]+") && num.startsWith("1")) {     // Regarde si l'input contient bien 0 et 1 et s'il ne commence pas avec un 0
            System.out.println("Votre input est bien un nombre binaire");
            String str3 = String.valueOf(Integer.parseInt(num, 2));
            System.out.println("Le nombre decimal du nombre binaire " + num + " est " + str3);
        }
        return num;
    }
}


