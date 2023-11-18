
import java.util.Scanner;

public class KahdenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä ensimmäinen luku!");
        int ekaLuku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int tokaLuku = Integer.valueOf(lukija.nextLine());

        double keskiarvo = ((ekaLuku + tokaLuku) / 2.0);
        System.out.println("Syötettyjen lukujen keskiarvo on " + (keskiarvo));

    }
}
