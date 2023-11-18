
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String nimi = "";
        int apu = 0;
        while (true) {
            // Luetaan käyttäjältä rivi tekstiä ja asetetaan se muuttujaan nimi
            String syote = lukija.nextLine();

            if (syote.length() == 0) {
                break;
            }

            String[] palat = syote.split(",");
            if (apu < Integer.valueOf(palat[1])) {
                apu = Integer.valueOf(palat[1]);
                nimi = palat[0];
            }

        }
        System.out.println("Vanhimman nimi: " + nimi);
    }

}
