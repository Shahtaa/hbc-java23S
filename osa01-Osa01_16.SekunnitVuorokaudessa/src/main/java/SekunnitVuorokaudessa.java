
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        int kokonaisluku = Integer.valueOf(lukija.nextLine());
        int sekunnit = kokonaisluku * 86400;
        System.out.println(sekunnit);
        
        // toteuta ohjelma tänne

    }
}
