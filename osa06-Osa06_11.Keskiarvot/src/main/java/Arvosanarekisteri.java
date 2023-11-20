
import java.util.ArrayList;

public class Arvosanarekisteri {

    private ArrayList<Integer> arvosanat;

    public Arvosanarekisteri() {
        this.arvosanat = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        this.arvosanat.add(pisteetArvosanaksi(pisteet));
    }

    public int montakoSaanutArvosanan(int arvosana) {
        int lkm = 0;
        for (int saatu : this.arvosanat) {
            if (saatu == arvosana) {
                lkm++;
            }
        }

        return lkm;
    }

    public double arvosanojenKeskiarvo() {
        double keskiarvo = 0;
        if (this.arvosanat.isEmpty()) {
            return -1;
        } else {

            int sum = 0;
            for (int i = 0; i < arvosanat.size(); i++) {
                sum += arvosanat.get(i);
            }
            keskiarvo = sum * 1.0 / arvosanat.size();

            return keskiarvo;
        }

    }

    public double koepisteidenKeskiarvo(int pisteet) {
        double keskiarvo = 0;
        if (this.arvosanat.isEmpty()) {
            return -1;
        } else {
            this.arvosanat.add(pisteet);
            int sum = 0;
            for (int i = 0; i < arvosanat.size(); i++) {
                sum += arvosanat.get(i);
            }
            keskiarvo = sum * 1.0 / arvosanat.size();

            return keskiarvo;
        }

    }

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
}
