package JP2;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class JP8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wartość zmiennej a: ");

        int a = scanner.nextInt();


        System.out.println("Podaj wartość zmiennej b: ");

        int b = scanner.nextInt();

        scanner.close();
        // P1
        System.out.println(0.5*a*(a*sqrt(3)/2));

        // P2

        System.out.println(pow(a, 3));


        //P3


        int ocena1 = 5;
        int ocena2 = 3;
        int ocena3 = 6;
        int ocena4 = 1;
        System.out.println(((double)ocena1 + ocena2 + ocena3 + ocena4)/4);

        //P4

        System.out.println(a*b);

        // P5

        double salary_net = 5000;
        int vat_tax = 23;
        System.out.println(salary_net * (1 +((double)vat_tax)/100));

        // P6

    }



}
