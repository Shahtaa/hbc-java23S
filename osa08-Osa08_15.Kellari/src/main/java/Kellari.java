import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Kellari {
    private HashMap<String, ArrayList<String>> kellarikomero;

    public Kellari() {
        this.kellarikomero = new HashMap<>();
    }

    public void lisaa(String komero, String tavara) {
        this.kellarikomero.putIfAbsent(komero, new ArrayList<>());
        this.kellarikomero.get(komero).add(tavara);
    }

    public ArrayList<String> sisalto(String komero) {
        return kellarikomero.getOrDefault(komero, new ArrayList<>());
    }

    public void poista(String komeroName, String sisalto) {

        ArrayList<String> komero = this.kellarikomero.get(komeroName);
        komero.remove(sisalto);

        // Additionally, if it is the LAST ITEM, also remove entire komero from keySet
        if (komero.isEmpty()) {
            // Last item was remove, remove also the komero itself
            this.kellarikomero.remove(komeroName);
        }

    }

    public ArrayList<String> komerot() {

        // if (!(this.kellarikomero.values().isEmpty())) {
        // return kellarikomero.getOrDefault(kellarikomero, null);
        // }
        // return null;

        Set<String> keySet = kellarikomero.keySet();
        ArrayList<String> listOfKeys = new ArrayList<String>(keySet);

        return kellarikomero.isEmpty() ? new ArrayList<>() : listOfKeys;

    }
}
