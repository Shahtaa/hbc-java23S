
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            // luetaan kaikki tiedoston rivit
            while (tiedostonLukija.hasNextLine()) {
                String[] palat = tiedostonLukija.nextLine().split(",");
                String nimi = palat[0];
                String vuosi = "";
                int ika = Integer.valueOf(palat[1]);
                if (ika == 1) {
                    vuosi = "vuosi";
                } else {
                    vuosi = "vuotta";
                }
                System.out.println(nimi + ", ikä: " + ika + " " + vuosi);
            }

        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnistui.");
        }

    }

}
