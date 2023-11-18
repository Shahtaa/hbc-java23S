
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            // Luetaan käyttäjältä rivi tekstiä ja asetetaan se muuttujaan nimi
            String syote = lukija.nextLine();

            if (syote.length() == 0) {
                break;
            }
            if (syote.contains("av")) {
                String[] palat = syote.split(" ");
                for (int i = 0; i < palat.length; i++) {
                    if (palat[i].contains("av")) {
                        System.out.println(palat[i]);
                    }

                }
            }

        }

    }
}
