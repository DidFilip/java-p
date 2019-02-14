package Start;
// komentarz
// psvm - public static void main(String[] args)
// sout - System.out.printIn();
// CTRL + SHIFT + F10 - run
// CTRL + / - komentarz
// CTRL + D - duplicate

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");
        // Sprawdzenie JRE
        System.out.println("JRE version: "+ System.getProperty("java.runtime.version"));

        int lunchTimer = 12345;
        int endTimer = -1234565;
        System.out.println(lunchTimer);
        System.out.println(endTimer);

        double salary = 2100.96;
        System.out.println(salary);

        char signA = 'A';
        char sign9 = '9';
        char signTab = '\'';
        char signSpace = ' ';
        System.out.println(signA);
        System.out.println(sign9);
        System.out.println(signTab);
        System.out.println(signSpace);

        boolean flag = true;
        boolean isLunch = false;
        System.out.println(true);
        System.out.println("isLunch = "+ isLunch);



    }

}
