
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mitä luetaan? ");
        String syote = lukija.nextLine();

        try (Scanner tiedostonLukija = new Scanner(Paths.get(syote))) {
            while (true) {
                System.out.println("");
                System.out.print("Komennot:\nlistaa - listaa reseptit\nlopeta - lopettaa ohjelman\nSyötä komento: ");
                syote = lukija.nextLine();
                if (syote.equals("listaa")) {
                    while (tiedostonLukija.hasNextLine()) {
                        System.out.println(tiedostonLukija.nextLine());
                    }
                }
                if (syote.equals("lopeta")) {
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnstui.");

        }

    }
}
