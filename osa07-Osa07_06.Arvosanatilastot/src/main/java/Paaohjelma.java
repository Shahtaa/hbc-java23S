
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        int kaikki = 0;
        int hyvaksytyt = 0;
        int lkm = 0;
        int lkm_hyvaksytyt = 0;

        while (true) {
            int syote = lukija.nextInt();
            if (syote == -1) {
                break;
            }
            if (syote > 0) {
                lkm++;
                kaikki += syote;
                if (syote >= 50) {
                    hyvaksytyt += syote;
                    lkm_hyvaksytyt++;
                }
            }

        }
        double keskiarvo = (1.0 * kaikki) / lkm;
        double keskiarvoHyvaksytyt = 1.0 * hyvaksytyt / lkm_hyvaksytyt;
        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        System.out.println("Pisteiden keskiarvo (kaikki): " + keskiarvo);
        if (keskiarvoHyvaksytyt > 0) {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): " + keskiarvoHyvaksytyt);
            System.out.println("Hyväksymisprosentti:" + 100.0 * lkm_hyvaksytyt / lkm);
        } else {
            System.out.println("-");
            System.out.println("Hyväksymisprosentti: 0");
        }

    }
}
