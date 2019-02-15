package JP2;

import java.util.Scanner;

public class IW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Twój staż pracy: ");
        int staz = scanner.nextInt();
if(staz <6) {
    System.out.println("jesteś Juniorem");
}else if ((staz>=6) && (staz<=10)) {
    System.out.println("jestes Midem");
}       else if(staz>11){
        System.out.println("jestes Seniorem");
        }
    }
}
