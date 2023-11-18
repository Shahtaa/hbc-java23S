
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int parillisetSumma = 0;
        int parittomatSumma = 0;
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi

        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä
        // eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva
        // ja viimeisenä parittomien summan laskeva olio)!
        System.out.println("Anna lukuja: ");
        Lukutilasto tilasto = new Lukutilasto();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            } else if (luku % 2 == 0) {
                tilasto.parilliset(luku);

            }
            tilasto.lisaaLuku(luku);

        }
        System.out.println("Määrä: " + tilasto.haeLukujenMaara());
        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Keskiarvo: " + tilasto.keskiarvo());
        System.out.println("Parillisten summa: " + tilasto.parilliset(luku));
        System.out.println("Parittomien summa: " + parittomatSumma);

    }
}
