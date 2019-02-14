

public class JP7 {
    public static void main(String[] args) {
        String name ="danuta";
        name = name.toUpperCase();

        System.out.println("Kim jesteś?");
        System.out.println(
                name.toUpperCase().charAt(name.length()-1) =='A' &&
                    !name.equals("KUBA") && !name.equals("BARNABA") ? "kobieta" : "mężczyzna");
        }

    }

