
import java.util.Scanner;

public class KokonaisluvunLukeminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luku!");
        String viesti = lukija.nextLine();
        int luku = Integer.valueOf(viesti);
        System.out.println("Syötit luvun " + luku);

        // toteuta ohjelma tänne

    }
}
