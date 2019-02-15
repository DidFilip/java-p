package JP2;


import java.util.Scanner;

public class Warunki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rok urodzenia");
        int year = scanner.nextInt();
        scanner.nextLine();
        if (year < 0 || year > 2019) {
            System.out.println("Błędne dane!");
        } else {
            if ((2019 - year) >= 18) {
                System.out.println("Logowanie: podaj login i hasło!");
                String login = scanner.nextLine();
                String password = scanner.nextLine();
                if(login.equals("admin") && password.equals("admin")) {
                    System.out.println("Witaj podróżniku.");
                }else if (login.equals("user") && password.equals("user")){
                    System.out.println("Witaj młody padawanie");
                }
                 else {
                    System.out.println("Błąd logowania");
                }
                System.out.println("Pełnoletni");
            } else {
              System.out.println("Niepełnoletni");


            }
        }
    }
}