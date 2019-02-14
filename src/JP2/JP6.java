package JP2;

import java.util.Random;

public class JP6 {
    public static void main(String[] args) {

// losowanie 0-10
        Random rnd = new Random();
        int x = rnd.nextInt (10) + 1;
        System.out.println("x =" + x);
        int y = rnd.nextInt (10) + 1;
        System.out.println("y =" + y);

        System.out.println(x>y);
        System.out.println(x*2>y);
        System.out.println(x-2<y);
        System.out.println(x*y%2);
    }
}
