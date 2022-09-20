package src;

import java.util.Scanner;


public class Menu {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Bonjour, choississez un exercice");
        System.out.println("Exercice1");
        System.out.println("Exercice2");
        System.out.println("Exercice3");
        System.out.println("Exercice4");
        int value = console.nextInt();
        switch (value) {
            case 1:
                src.Exercice1.exo1.main(args);
                break;
            case 2:
                src.Exercice2.exo2.main(args);
                break;
            case 3:
                src.Exercice3.exo3.main(args);
                break;
            case 4:
                src.Exercice4.exo4.main(args);
                break;
        }

    }
}
