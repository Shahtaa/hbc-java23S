import java.util.Scanner;

public class Tekstikayttoliittyma {

    private Scanner lukija;
    private Sanakirja sanat;

    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanat = sanakirja;
    }

    public void kaynnista() {

        while (true) {
            // Luetaan käyttäjältä rivi tekstiä ja asetetaan se muuttujaan nimi
            System.out.print("Komento:");
            String syote = this.lukija.nextLine();

            if (syote.equals("lopeta")) {
                break;
            }

            if (syote.equals("lisaa")) {
                System.out.print("Sana: ");
                String sana = this.lukija.nextLine();

                System.out.print("Käännös: ");
                String kaannos = this.lukija.nextLine();
                sanat.lisaa(sana, kaannos);

            }
            if (syote.equals("hae")) {
                String sana = this.lukija.nextLine();

                System.out.println("Käännös: " + sanat.kaanna(sana));
                System.out.println("");
            }

            else {
                System.out.println("Tuntematon komento");
            }

        }
        System.out.println("Hei hei!"); // This somehow never get printed.
    }
}
