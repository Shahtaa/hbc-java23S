
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
         // Luodaan lukemiseen käytettävä Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        // Määritellään syötteet ja luetaan niihin arvot
        int eka = Integer.valueOf(lukija.nextLine());
        int toka = Integer.valueOf(lukija.nextLine());

        // Selvitetään laskuoperaatio ja luodaan laskuoperaation tulokselle muuttuja
        double neliojuuri = Math.sqrt(eka + toka);

        // Tulostetaan laskuoperaation tulos
        System.out.println(neliojuuri);

    }
}
