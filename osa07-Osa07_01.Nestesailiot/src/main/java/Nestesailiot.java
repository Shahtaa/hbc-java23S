
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int eka = 0;
        int toka = 0;
        while (true) {
            System.out.println("Ensimmäinen: " + eka + "/100");
            System.out.println("Toinen " + toka + "/100");
            String luettu = lukija.nextLine();
            String[] osat = luettu.split(" ");

            String komento = osat[0];

            if (komento.equals("lopeta")) {
                break;
            }
            if (komento.equals("lisaa")) {
                int maara = Integer.valueOf(osat[1]);
                if (maara > 0) {
                    eka += maara;
                    if (eka > 100) {
                        eka = 100;
                    }
                }

            }
            if (komento.equals("siirra")) {
                int siirto = Integer.valueOf(osat[1]);
                if (toka + siirto <= 100) {
                    if (siirto == eka) {

                        eka -= siirto;
                        toka += siirto;
                    }
                    if (siirto > eka) {

                        toka += eka;
                    }
                    if (siirto < eka) {
                        eka -= siirto;
                        toka += siirto;
                    }

                } else {
                    toka = 100;
                    eka -= (100 - toka);
                }

            }
            if (komento.equals("poista")) {
                int poista = Integer.valueOf(osat[1]);
                if (poista > 0) {
                    if (poista <= toka) {
                        toka -= poista;
                    }
                }
            }
        }
    }
}
