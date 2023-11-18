
import java.util.Scanner;

public class OnkoTotta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Kirjoita merkkijono: ");
        String syote = lukija.nextLine();
        String merkkijono = "totta";

        if (!(syote.equals(merkkijono))) { // tosi jos ehto merkkijono.equals("maito") on epätosi
            System.out.println("Koitappa uudelleen!");
        } else {
            System.out.println("Oikein meni!");
        }
    }
}
