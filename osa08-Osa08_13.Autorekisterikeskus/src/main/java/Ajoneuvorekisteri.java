import java.util.ArrayList;
import java.util.HashMap;

public class Ajoneuvorekisteri {

    private HashMap<Rekisterinumero, String> omistajat;

    public Ajoneuvorekisteri() {
        omistajat = new HashMap<>();
    }

    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if (!(omistajat.containsKey(rekkari))) {
            omistajat.put(rekkari, omistaja);
            return true;

        }
        if (omistajat.containsKey(rekkari)) {
            return false;
        }
        return false;
    }

    public String hae(Rekisterinumero rekkari) {
        if (omistajat.containsKey(rekkari)) {
            return omistajat.get(rekkari);
        }
        return null;
    }

    public boolean poista(Rekisterinumero rekkari) {

        if (omistajat.containsKey(rekkari)) {
            omistajat.clear();
            return true;
        }
        return false;
    }

    public void tulostaRekisterinumerot() {
        for (Rekisterinumero avain : omistajat.keySet()) {

            System.out.println(avain);
        }
    }

    public void tulostaOmistajat() {

        ArrayList<String> nimet = new ArrayList();
        for (String value : omistajat.values()) {
            if (!nimet.contains(value)) {
                nimet.add(value);
            }
        }
        for (String nimi : nimet) {
            System.out.println(nimi);
        }
    }
}
