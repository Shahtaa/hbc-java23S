
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String joukkue = lukija.nextLine();
        int ottelut = 0;
        int voitot = 0;
        int haviot = 0;
        ArrayList<Tilastot> tilastot = lueTilastot(tiedosto);
        for (Tilastot tilastot2 : tilastot)
            if (tilastot2.getKotijoukkue().contains(joukkue)) {
                ottelut++;
            } else if (tilastot2.getVierasjoukkue().contains(joukkue)) {
                ottelut++;
            }

        for (Tilastot tilastot2 : tilastot) {
            if (tilastot2.getKotijoukkue().equals(joukkue)) {
                if (tilastot2.getKotipisteet() > tilastot2.getVieraspisteet()) {

                    voitot++;
                } else {
                    haviot++;
                }
            }
            if (tilastot2.getVierasjoukkue().equals(joukkue)) {
                if (tilastot2.getVieraspisteet() > tilastot2.getKotipisteet()) {

                    voitot++;
                } else {
                    haviot++;
                }
            }

        }
        System.out.println("Otteluita: " + ottelut);
        System.out.println("Voittoja: " + voitot);
        System.out.println("Tappioita: " + haviot);

    }

    public static ArrayList<Tilastot> lueTilastot(String tiedosto) {

        ArrayList<Tilastot> tilastot = new ArrayList<>();

        try (Scanner tilastoLukija = new Scanner(Paths.get(tiedosto))) {

            // luetaan kaikki tiedoston rivit
            while (tilastoLukija.hasNextLine()) {
                String rivi = tilastoLukija.nextLine();

                String[] palat = rivi.split(",");
                String kotijoukkue = palat[0];
                String vierasjoukkue = palat[1];
                int kotipisteet = Integer.valueOf(palat[2]);
                int vieraspisteet = Integer.valueOf(palat[3]);

                tilastot.add(new Tilastot(kotijoukkue, vierasjoukkue, kotipisteet, vieraspisteet));

            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        return tilastot;

    }
}
