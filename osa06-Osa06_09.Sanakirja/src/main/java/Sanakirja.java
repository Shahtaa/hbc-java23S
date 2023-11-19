
import java.util.HashMap;

public class Sanakirja {

    private HashMap<String, String> kaannokset;

    public Sanakirja() {
        this.kaannokset = new HashMap<>();
    }

    public String kaanna(String sana) {

        if (kaannokset.containsKey(sana)) {
            return kaannokset.get(sana);
        } else {
            return "Sanaa " + sana + " ei löydy";
        }
    }

    public void lisaa(String sana, String kaannos) {

        this.kaannokset.put(sana, kaannos);
    }
}
