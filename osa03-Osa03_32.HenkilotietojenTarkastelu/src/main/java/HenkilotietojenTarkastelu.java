
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String nimi = "";
        int apu = 0;
        int summa = 0;
        int lkm = 0;
        while (true) {
            // Luetaan käyttäjältä rivi tekstiä ja asetetaan se muuttujaan nimi
            String syote = lukija.nextLine();

            if (syote.length() == 0) {
                break;
            }

            String[] palat = syote.split(",");
            if (apu < palat[0].length()) {
                apu = palat[0].length();
                nimi = palat[0];
            }
            summa = summa + Integer.valueOf(palat[1]);
            lkm++;

        }
        System.out.println("Pisin nimi: " + nimi);
        System.out.println("Syntymävuosien keskiarvo: " + 1.0 * summa / lkm);
    }

}
