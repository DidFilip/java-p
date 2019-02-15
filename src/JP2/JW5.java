package JP2;

import java.util.Scanner;

public class JW5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cyfry arabskie na cyfry Rzymskie");
        int key = scanner.nextInt();

        switch (key){
            case 1:
                System.out.println("I");
                break;
                case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
        }
    }
}
