
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi
        // palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);

        int summa = 0;
        int lkm = 0;
        int parilliset = 0;
        int parittomat = 0;
        while (true) {
            System.out.print("Syötä luvut: "); // luetaan syöte
            int luvut = Integer.valueOf(lukija.nextLine());

            if (luvut == -1) {
                break;
            }
            if (luvut > 0) {
                summa += luvut; // lasketaan summa
                lkm++; // //lasketaan lukumäärä
                if (luvut % 2 == 0) {
                    parilliset++;
                } else if (luvut % 2 == 1) {

                    parittomat++;
                }

            }
        }
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lkm);
        double keskiarvo = 1.0 * summa / lkm;
        System.out.println("Keskiarvo: " + keskiarvo);
        System.out.println("Parillisia: " + parilliset);
        System.out.println("Parittomia: " + parittomat);
    }
}