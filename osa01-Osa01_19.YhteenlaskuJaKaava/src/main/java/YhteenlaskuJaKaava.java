
import java.util.Scanner;

public class YhteenlaskuJaKaava {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä ensimmäinen luku!");
        int ekaLuku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int tokaLuku = Integer.valueOf(lukija.nextLine());
        System.out.println(ekaLuku + " + " + tokaLuku + " "  + "= " + (ekaLuku + tokaLuku));
        // toteuta ohjelma tänne

    }
}
