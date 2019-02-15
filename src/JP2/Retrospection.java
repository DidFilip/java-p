package JP2;

import java.util.Locale;
import java.util.Scanner;

public class Retrospection {
//

    public static void main(String[] args) {
        byte age = 5;
        double salary = 500.99;
        char sign = 'T';
        boolean flag = true;

        System.out.println(sign + 1);
        System.out.println((char)(sign +1));

        System.out.printf("%d | %.2f | %c | %s \n", age, salary, sign, flag);
        System.out.println("Hello Word!");
// () ? () : ()

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj rok urodzenia:");
//        int age_scanner = scanner.nextInt();
//        String decision = (2019 - age_scanner) >=18 ? "pełnoletnia" : "małolat";
//        System.out.println(decision);

        System.out.println("Podaj staż pracy");
        scanner.useLocale(Locale.US);
        double staz = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("podaj imię");
        String name = scanner.nextLine();

        System.out.println("Twój staż: " + staz);
        System.out.println("Twoje imię: " + name);
        scanner.close();


    }
}
