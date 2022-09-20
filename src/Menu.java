package src;

import java.util.Scanner;


public class Menu {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Bonjour, choississez un exercice");
        System.out.println("Exercice1");
        System.out.println("Exercice2");
        int value = console.nextInt();
        switch (value) {
            case 1:
                src.Exercice1.exo1.main(args);
                break;
            case 2:
                src.Exercice2.exo2.main(args);
                break;
        }

    }
}
