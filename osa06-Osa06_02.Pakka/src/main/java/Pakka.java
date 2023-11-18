import java.util.ArrayList;
import java.util.Collections;

public class Pakka {

    private ArrayList<String> arvot;

    public Pakka() {
        this.arvot = new ArrayList<>();
    }

    public ArrayList<String> arvot() {
        return arvot;
    }

    public void lisaa(String arvo) {
        this.arvot.add(arvo);

    }

    public boolean onTyhja() {
        if (arvot.isEmpty()) {
            return true;
        }
        return false;
    }

    public String ota() {
        int index = arvot.size() - 1;
        return this.arvot.remove(index);

    }
}
