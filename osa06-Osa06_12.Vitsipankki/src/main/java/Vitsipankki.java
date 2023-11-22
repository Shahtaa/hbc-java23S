import java.util.ArrayList;
import java.util.Random;

public class Vitsipankki {

    private ArrayList<String> vitsit;

    public Vitsipankki() {
        this.vitsit = new ArrayList<>();
    }

    public void lisaaVitsi(String vitsi) {

        this.vitsit.add(vitsi);
    }

    public String arvoVitsi() {
        if (vitsit.isEmpty()) {
            return "Vitsit vähissä.";
        } else {

            Random rand = new Random();
            return vitsit.get(rand.nextInt(vitsit.size()));
        }

    }

    public void tulostaVitsit() {

        for (String string : vitsit) {
            System.out.println(string);
            ;
        }
    }
}
