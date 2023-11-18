
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String rivi = lukija.nextLine();

            if (rivi.equals("loppu")) {
                break;
            }
            int i = Integer.parseInt(rivi);
            System.out.println(i * i * i);
            // lisää luettu rivi listalle myöhempää käsittelyä
            // varten tai käsittele rivi heti

        }
    }
}