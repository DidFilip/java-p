package Loopers;

import java.util.Scanner;

public class TF2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = -1;
        while (key != 0) {
            System.out.println("Wpisz wartość promienia");
            {
                int promien = scanner.nextInt();
                System.out.println("Wybierz funkcję do obliczeń: \n (1) Pole koła \n (2) Obwód okregu \n (3) Sfera");
                // klucz do instrukcji switch-case
                key = scanner.nextInt();
                switch (key) {
                    case 1:
                        System.out.printf("Pole: %.2f \n\n", Math.PI * Math.pow(promien, 2));
                        break;
                    case 2:
                        System.out.printf("Obwód: %.2f \n\n", Math.PI * promien);
                        break;
                    case 3:
                        System.out.printf("Sfera: %.2f \n\n", 4 * Math.PI * Math.pow(promien, 3) / 3);
                        break;
                    case 0:
                        System.out.println("Wyjście\n");
                        break;
                    default:
                        System.out.println("Błędny wybór!\n");
                }
                System.out.println("END");
            }
        }
    }
}
