package src.Exercice3;

import src.Menu;
import java.util.Scanner;
import src.checkInputIsInt.CheckIntegerInput;

public class exo3 {
    public static void main(String[] args) {
        System.out.println("Bonjour, que souhaitez-vous faire ?");
        System.out.println("1 - Prendre un nombre decimal et le transformer en binaire ?");
        System.out.println("2 - Prendre un nombre binaire et le transformer en decimal ?");
        int value = CheckIntegerInput.entierInt();
        if (value == 1 || value == 2) {
            switch (value) {
                case 1:
                    System.out.println("Quel nombre souhaitez vous prendre ?");
                    int nb = CheckIntegerInput.entierInt();
                    String str = Integer.toBinaryString(nb);
                    System.out.println("Le nombre binaire de " + nb + " est " + str);
                    System.out.println("Voulez-vous recommencer (1) ou quitter ? (2)");
                    int quit = CheckIntegerInput.entierInt();
                    if (quit == 1 || value == 2) {
                        switch (quit) {
                            case 1:
                                main(args);
                                break;
                            case 2:
                                src.Menu.main(args);
                                break;
                        }
                        break;
                    }
                case 2:
                    System.out.println("Quel nombre binaire souhaitez vous prendre ?");
                    String bin = CheckIntegerInput.isBinary();
                    System.out.println("Voulez-vous recommencer (1) ou quitter ? (2)");
                    int out = src.checkInputIsInt.CheckIntegerInput.entierInt();
                    if (out == 1 || out == 2) {
                        switch (out) {
                            case 1 -> main(args);
                            case 2 -> Menu.main(args);
                        }
                        break;
                    } else {
                        System.out.println("Veuillez entrer seulement l'un des deux choix");
                        main(args);
                    }
            }
        }
    }
}