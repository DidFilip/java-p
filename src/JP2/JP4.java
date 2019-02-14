package JP2;

public class JP4 {
    public static void main(String[] args) {
String zdanie ="ALA MA KOTA A KOT MA ALE";
String slowo [] = zdanie.split(" ");
        System.out.println(slowo[0]);
        System.out.println(slowo[1]);
        System.out.println(slowo[2]);
        System.out.println(slowo[3]);
        System.out.println(slowo[4]);
        System.out.println(slowo[5]);
        System.out.println(slowo[6]);
// automatyzacja/ pętla
        for (String word : slowo){
            System.out.println(word);
        }
    }
}
