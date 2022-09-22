
package src.checkInputIsInt;

import java.util.Scanner;

// @author : Laurie
public class CheckIntegerInput {
    public static int entierInt() { // Permet de savoir si l'input de l'utilisateur est bien un entier
        Scanner scan = new Scanner(System.in); // Scan l'input
        while (!scan.hasNextInt()) { // Tant que l'input n'est pas un int, renvoit un message d'erreur et scan le prochain input
            System.out.println("Rentrez un entier");
            scan.next();
        }
        int nb = scan.nextInt();
        if (nb < 0) { // Tant que l'input n'est pas un int positif, renvoit un message d'erreur et scan le prochain input
            System.out.println("Veuillez entrez un entier positif");
            return entierInt();
        }
        return nb;
    }

    public static boolean isFloat2(String string) { // Bouléen qui permet de verifier si la valeur est bien un nombre decimal
        float floatValue;
        System.out.printf("Verification: \"%s\"%n", string);
        if(string == null || string.equals("")) { // Si la valeur est null ou contient une string vide
            System.out.println("Ne peut être lu");
            return false;
        }

        try { // Si la chaine de caractère est bien un float renvoit : vrai
            floatValue = Float.parseFloat(string);
            return true;
        } catch (NumberFormatException e) { // // Sinon demande de réessayer avec une autre valeur
            System.out.println("Le nombre saisi n'est pas un nombre decimal, veuillez reessayer");
        }
        return false;
    }

    public static String isString() { // Fonction qui permet de savoir si l'entrée est bien une chaîne de caractère
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextLine()) { // Si l'input n'est pas une chaine de caractere (scan la prochaine ligne)
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


    public static String isBinary() {  // Fonction qui permet de savoir si la chaine de caractère est bien un nombre binaire
        String num;
        Scanner scan = new Scanner(System.in);
        num = scan.next(); // Permet de rentrer un input
        while (!num.startsWith("1")) { // Si l'input ne commence pas par un 1
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


