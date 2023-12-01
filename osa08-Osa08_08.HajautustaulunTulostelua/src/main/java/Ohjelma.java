
import java.util.HashMap;
import java.util.Map;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        HashMap<String, String> hm = new HashMap<>();
        hm.put("a", "b");
        hm.put("c", "d");
        hm.put("e", "f");
        tulostaAvaimetJoissa(hm, "a");

    }

    public static void tulostaAvaimet(HashMap<String, String> taulu) {
        for (String avain : taulu.keySet()) {
            System.out.println(avain);
        }
    }

    public static void tulostaAvaimetJoissa(HashMap<String, String> taulu, String string) {

        for (String haunkohde : taulu.keySet()) {
            if (haunkohde.contains(string)) {
                System.out.println(haunkohde);
            }
        }

    }

    public static void tulostaArvotJosAvaimessa(HashMap<String, String> taulu, String string) {
        for (String haunkohde : taulu.keySet()) {
            if (haunkohde.contains(string)) {
                System.out.println(taulu.get(haunkohde));
            }
        }
    }

}
