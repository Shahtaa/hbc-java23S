import java.util.ArrayList;
import java.util.Random;

public class Vitsipankki {

    private ArrayList<String> pankki;

    public Vitsipankki() {
        this.pankki = new ArrayList<>();
    }

    public void lisaaVitsi(String vitsi) {

        this.pankki.add(vitsi);
    }

    public String arvoVitsi() {
        if (pankki.isEmpty()) {
            return "Vitsit vähissä.";
        } else {

            Random rand = new Random();
            return pankki.get(rand.nextInt(pankki.size()));
        }

    }

    public void tulostaVitsit() {

        for (String string : pankki) {
            System.out.println(string);

        }
    }
}
