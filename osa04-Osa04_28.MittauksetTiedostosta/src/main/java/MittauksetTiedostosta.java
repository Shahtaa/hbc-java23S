
import java.nio.file.Paths;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukuja = 0;
        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();

        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());

        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            // luetaan kaikki tiedoston rivit
            while (tiedostonLukija.hasNextLine()) {
                int luku = Integer.parseInt(tiedostonLukija.nextLine());
                if (luku >= alaraja && luku <= ylaraja) {
                    lukuja++;
                }

            }

        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnistui.");
        }
        System.out.println("Lukuja: " + lukuja);
    }

}
