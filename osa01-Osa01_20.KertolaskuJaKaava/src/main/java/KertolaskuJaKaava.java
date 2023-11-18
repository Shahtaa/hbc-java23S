
import java.util.Scanner;

public class KertolaskuJaKaava {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int ekaLuku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int tokaLuku = Integer.valueOf(lukija.nextLine());
        System.out.println(ekaLuku + " * " + tokaLuku + " = " + (ekaLuku * tokaLuku));
    }
}
