
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Ensimmäinen: ");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.print("Viimeinen: ");
        int toka = Integer.valueOf(lukija.nextLine());

        int summa = 0;
        while (eka <= toka) {
            summa += eka;
            eka++;
        }

        System.out.println("Summa on " + summa);
    }
}