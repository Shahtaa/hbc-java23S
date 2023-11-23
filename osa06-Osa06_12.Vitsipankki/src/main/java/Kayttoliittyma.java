import java.util.Random;
import java.util.Scanner;

public class Kayttoliittyma {
    private Scanner lukija;
    private Vitsipankki pankki;

    public Kayttoliittyma(Vitsipankki pankki, Scanner lukija) {
        this.pankki = pankki;
        this.lukija = lukija;

    }

    public void kaynnista() {
        System.out.println("Voihan vitsi!");

        while (true) {
            System.out.println("Komennot:");
            System.out.println(" 1 - lisää vitsi");
            System.out.println(" 2 - arvo vitsi");
            System.out.println(" 3 - listaa vitsit");
            System.out.println(" X - lopeta");

            String komento = lukija.nextLine();

            if (komento.equals("X")) {
                break;
            }

            if (komento.equals("1")) {
                System.out.println("Kirjoita lisättävä vitsi:");
                String vitsi = lukija.nextLine();
                pankki.lisaaVitsi(vitsi);
            } else if (komento.equals("2")) {
                System.out.println(pankki.arvoVitsi());

            } else if (komento.equals("3")) {
                System.out.println("Tulostetaan vitsit.");
                pankki.tulostaVitsit();
            }
        }
    }
}
