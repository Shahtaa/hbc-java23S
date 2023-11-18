
import java.util.Scanner;

public class ToiseenPotenssiin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Määritellään syötteet ja luetaan niihin arvot
        int luku = Integer.valueOf(lukija.nextLine());

        // Selvitetään laskuoperaatio ja luodaan laskuoperaation tulokselle muuttuja
        int tulo = luku * luku;

        // Tulostetaan laskuoperaation tulos
        System.out.println(tulo);

    }
}