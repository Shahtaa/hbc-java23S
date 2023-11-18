
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }

    public String toString() {

        String tulostus = "";
        String alkiossaOlijat = "";
        if (alkiot.isEmpty()) {
            tulostus = "Joukko " + this.nimi + " on tyhjä.";

        } else if (alkiot.size() == 1) {
            for (int i = 0; i < alkiot.size(); i++) {
                alkiossaOlijat = alkiossaOlijat += alkiot.get(i);
            }
            tulostus = "Joukossa " + this.nimi + " on 1 alkio:" + "\n" + alkiossaOlijat;

        } else {
            for (int i = 0; i < alkiot.size(); i++) {
                alkiossaOlijat = alkiossaOlijat += alkiot.get(i) + "\n";
            }
            tulostus = "Joukossa " + this.nimi + " on " + alkiot.size() + " alkiota:" + "\n" + alkiossaOlijat;
        }

        return tulostus;
    }
}