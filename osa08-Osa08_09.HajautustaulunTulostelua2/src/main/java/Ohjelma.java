
import java.util.HashMap;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        HashMap<String, Kirja> taulu = new HashMap<>();
        taulu.put("tunteet", new Kirja("Järki", 1811, "..."));
        taulu.put("luulot", new Kirja("Ylpeys", 1813, "...."));
        taulu.put("onni", new Kirja("Don't let the pigeon drive the bus", 2003, "...."));
        tulostaArvoJosNimessa(taulu, "peys");
    }

    public static void tulostaArvoJosNimessa(HashMap<String, Kirja> taulu, String string) {
        for (Kirja arvo : taulu.values()) {
            if (arvo.getNimi().contains(string)) {
                System.out.println(arvo);
            }
        }
    }

    // if (taulu.values().toString().contains(string)) {
    // System.out.println(1);
    // }

    public static void tulostaArvot(HashMap<String, Kirja> hajautustaulu) {
        for (Kirja arvo : hajautustaulu.values()) {
            System.out.println(arvo);

        }
    }
}
