import java.util.Scanner;

public class Kayttoliittyma {
    private Scanner lukija;
    private Tehtavalista listat;

    public Kayttoliittyma(Tehtavalista listat, Scanner lukija) {
        this.listat = listat;
        this.lukija = lukija;

    }

    public void kaynnista() {
        while (true) {
            System.out.print("Komento:");
            String syote = this.lukija.nextLine();
            if (syote.equals("lisaa")) {
                System.out.println("Lisättävä:");
                String sana = this.lukija.nextLine();
                this.listat.lisaa(sana);
            }
            if (syote.equals("listaa")) {
                this.listat.tulosta();
            }

            if (syote.equals("poista")) {
                System.out.println("Mikä poistetaan?");
                int numero = this.lukija.nextInt();
                this.listat.poista(numero);

            }
            if (syote.equals("lopeta")) {
                break;
            }
        }
    }
}