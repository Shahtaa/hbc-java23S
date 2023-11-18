
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

    public String pisin() {
        String palautettava = "";
        if (alkiot.size() == 0) {
            return null;
        }
        for (int i = 0; i < alkiot.size(); i++) {
            if (palautettava.length() < alkiot.get(i).length()) {
                palautettava = alkiot.get(i);
            }
        }
        return palautettava;

    }

}
