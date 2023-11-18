
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Esine> esineet = new ArrayList<>();
        while (true) {
            System.out.println("Syötä esineen nimi, tyhjä lopettaa.");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;

            }
            if (esineet.contains(nimi)) {
                System.out.println("");
            }
            System.out.println("Syötä esineen tunnus, tyhjä lopettaa.");
            String tunnus = lukija.nextLine();

            Esine esine = new Esine(nimi, tunnus);

            esineet.add(esine);

        }
        System.out.println("==Esineet==");
        for (Esine esine : esineet) {
            System.out.println(esine);
        }
    }
}
