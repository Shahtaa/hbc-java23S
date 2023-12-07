import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class UseanKaannoksenSanakirja {
    private HashMap<String, ArrayList<String>> sanat;

    public UseanKaannoksenSanakirja() {
        this.sanat = new HashMap<>();
    }

    public void lisaa(String sana, String kaannos) {
        this.sanat.putIfAbsent(sana, new ArrayList<>());
        ArrayList<String> kaannokset = this.sanat.get(sana);
        kaannokset.add(kaannos);
    }

    public ArrayList<String> kaanna(String sana) {

        if (!(sanat.containsKey(sana))) {
            return new ArrayList<>();
        }

        return sanat.get(sana);
    }

    public void poista(String sana) {
        sanat.remove(sana);
    }

}
