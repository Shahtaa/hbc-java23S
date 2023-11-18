
import java.nio.file.Paths;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        String nimi = lukija.nextLine();
        try (Scanner tiedostonLukija = new Scanner(Paths.get(nimi))) {
            while (tiedostonLukija.hasNextLine()) {
                System.out.println(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnstui.");
        }

    }
}
