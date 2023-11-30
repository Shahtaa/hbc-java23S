import java.util.Scanner;

public class Kayttoliittyma {
    private Scanner lukija;
    private Tehtavalista lista;

    public Kayttoliittyma(Tehtavalista lista, Scanner lukija) {
        this.lista = lista;
        this.lukija = lukija;
    }

    public void kaynnista() {
        while (true) {
            System.out.print("Komento:");
            String syote = this.lukija.nextLine();
            if (syote.equals("lisaa")) {
                System.out.println("Lisättävä:");
                String sana = this.lukija.nextLine();
                this.lista.lisaa(sana);
            }
            if (syote.equals("listaa")) {
                this.lista.tulosta();
            }

            if (syote.equals("poista")) {
                System.out.println("Mikä poistetaan?");
                int numero = this.lukija.nextInt();
                this.lista.poista(numero);

            }
            if (syote.equals("lopeta")) {
                break;
            }
        }
    }
}