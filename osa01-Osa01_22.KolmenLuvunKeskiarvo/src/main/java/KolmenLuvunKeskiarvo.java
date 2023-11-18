
import java.util.Scanner;

public class KolmenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int ekaLuku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int tokaLuku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä kolmas luku!");
        int kolmasLuku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötettyjen lukujen keskiarvo on " + (1.0 * ekaLuku + tokaLuku + kolmasLuku) / 3);
    }
}
