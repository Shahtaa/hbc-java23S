
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ensimmäinen luku:");
        int ekaLuku = Integer.valueOf(lukija.nextLine());

        System.out.println("Anna toinen luku: ");
        int tokaLuku = Integer.valueOf(lukija.nextLine());


        if (ekaLuku > tokaLuku) {
            System.out.println("Suurempi luku: " + ekaLuku);
        } else if (tokaLuku > ekaLuku) {
            System.out.println("Suurempu luku: " + tokaLuku);
        } else {
            System.out.println("Luvut ovat yhtä suuret!");
        }
    }
}
