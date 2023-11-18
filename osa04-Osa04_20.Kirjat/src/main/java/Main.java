
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        ArrayList<KirjaOhjelma> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.print("Sivuja: ");
            int sivuja = Integer.valueOf(lukija.nextLine());
            System.out.print("Julkaisuvuosi: ");
            int vuosi = Integer.valueOf(lukija.nextLine());
            kirjat.add(new KirjaOhjelma(nimi, sivuja, vuosi));

        }
        System.out.println("Mitä tulostetaan? ");
        String tuloste = lukija.nextLine();
        if (tuloste.equals("nimi")) {
            for (KirjaOhjelma kirjaOhjelma : kirjat) {
                System.out.println(kirjaOhjelma.getNimi());
            }
        } else {
            for (int i = 0; i < kirjat.size(); i++) {
                System.out.println(kirjat.get(i));
            }
        }

    }
}