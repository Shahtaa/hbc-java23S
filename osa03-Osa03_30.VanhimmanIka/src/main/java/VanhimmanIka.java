
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int apu = 0;
        while (true) {
            // Luetaan käyttäjältä rivi tekstiä ja asetetaan se muuttujaan nimi
            String syote = lukija.nextLine();

            if (syote.length() == 0) {
                break;
            }

            String[] palat = syote.split(",");
            if (apu <= Integer.valueOf(palat[1])) {
                apu = Integer.valueOf(palat[1]);
            }

        }
        System.out.println("Vanhimman ikä: " + apu);
    }

}