
import java.util.Scanner;

public class EnsimmaisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            // Luetaan käyttäjältä rivi tekstiä ja asetetaan se muuttujaan nimi
            String syote = lukija.nextLine();

            if (syote.length() == 0) {
                break;
            }

            String[] palat = syote.split(" ");
            System.out.println(palat[0]);
        }

    }
}
