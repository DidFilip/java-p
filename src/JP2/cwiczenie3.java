package JP2;

public class cwiczenie3 {
    public static void main(String[] args) {
        String imie, imie2, ciag, ciag2;
        imie = "adam";
        imie2 ="ewa";
        ciag = imie + imie2;
        ciag2 = ciag + "ad2019";

        System.out.println(ciag.toUpperCase());
        System.out.println(ciag2.toLowerCase());
        System.out.println(ciag2.length());

        System.out.println(ciag.charAt(2));
        System.out.println(ciag.charAt(5));
        System.out.println(ciag2.charAt(ciag2.length()-3));
        System.out.println(ciag2.substring(0,4));
        System.out.println(ciag2.substring(4,7));
    }
}
