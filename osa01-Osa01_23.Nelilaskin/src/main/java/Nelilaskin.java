
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä ensimmäinen luku!");
        int ekaLuku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int tokaLuku = Integer.valueOf(lukija.nextLine());
        System.out.println(ekaLuku + " + " + tokaLuku + " = " + (ekaLuku + tokaLuku));
        System.out.println(ekaLuku + " - " + tokaLuku + " = " + (ekaLuku - tokaLuku));
        System.out.println(ekaLuku + " * " + tokaLuku + " = " + (ekaLuku * tokaLuku));
        System.out.println(ekaLuku + " / " + tokaLuku + " = " + (1.0* ekaLuku / tokaLuku));

        // toteuta ohjelma tänne

    }
}
