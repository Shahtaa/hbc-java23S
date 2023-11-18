
import java.nio.file.Paths;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        boolean loytyi = false;
        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            // luetaan kaikki tiedoston rivit
            while (tiedostonLukija.hasNextLine()) {

                if (tiedostonLukija.nextLine().contains(etsittava)) {
                    loytyi = true;

                }

            }

        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnistui.");
        }
        if (loytyi) {
            System.out.println("Löytyi!");

        } else {
            System.out.println("ei löytynyt");
        }
    }
}
