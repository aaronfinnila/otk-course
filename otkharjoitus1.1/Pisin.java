public class Pisin {
    public static void main(String[] args) {
        String pitka = "";
        if (args.length == 0) {
            System.out.println("Ei parametreja");
        }
        else {
            for (String parametri : args) {
            if (parametri.length() > pitka.length()) {
                pitka = parametri;  
            }
        }
                System.out.println("Pisin parametri: " + pitka);
        }
    }
}