package src;
import src.Exercice1.exo1;
import src.Exercice2.exo2;
import src.checkInputIsInt.checkIntegerInput;

import java.util.Scanner;

public class Menu {


    public static void main(String[] args) {

        int value;
        Scanner console = new Scanner(System.in);
        System.out.println("Bonjour, choississez un exercice");
        System.out.println("Exercice1");
        System.out.println("Exercice2");
        value = console.nextInt();
        switch(value){
            case 1 -> exo1.main(args);
            case 2 -> exo2.main(args);
        }

    }



}
