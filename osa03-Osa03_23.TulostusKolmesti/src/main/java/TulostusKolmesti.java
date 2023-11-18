
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mikä tulostetaan?");
        // Luetaan käyttäjältä rivi tekstiä ja asetetaan se muuttujaan nimi
        String nimi = lukija.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print(nimi);
        }
        // Toteuta ohjelmasi tähän.

    }
}
