
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int i = 0;
        while (true) {
            String rivi = lukija.nextLine();
            i++;
            if (rivi.equals("loppu")) {
                break;
            }
            System.out.println(i);
            // lisää luettu rivi listalle myöhempää käsittelyä
            // varten tai käsittele rivi heti

        }
    }
}