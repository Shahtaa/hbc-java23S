import java.util.Random;
import java.util.Scanner;

public class Kayttoliittyma {
    private Vitsipankki pankki;
    private Scanner lukija;

    public Kayttoliittyma(Vitsipankki pankki, Scanner lukija) {
        this.pankki = pankki;
        this.lukija = lukija;
    }

    public void kaynnista() {
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
                vitsit.add(vitsi);
            } else if (komento.equals("2")) {
                System.out.println("Arvotaan vitsi.");

                if (vitsit.isEmpty()) {
                    System.out.println("Vitsit vähissä.");
                } else {
                    Random arpa = new Random();
                    int indeksi = arpa.nextInt(vitsit.size());
                    System.out.println(vitsit.get(indeksi));
                }

            } else if (komento.equals("3")) {
                System.out.println("Tulostetaan vitsit.");
                for (String vitsi : vitsit) {
                    System.out.println(vitsi);
                }
            }
    }

}
