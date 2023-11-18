
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int lukuja = 0;
        int summa = 0;
        while (true) {
            System.out.println("Syötä luku ");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku > 0) {
                summa = summa + luku;
                lukuja++;
            }

            if (luku == 0) {
                break;
            }

        }
        if (lukuja > 0) {
            double keskiarvo = ((double) summa) / lukuja;
            System.out.println("Lukujen keskiarvo " + keskiarvo);
        } else {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        }
    }
}