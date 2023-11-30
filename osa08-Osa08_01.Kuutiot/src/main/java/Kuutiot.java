
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("loppu")) {
                break;
            }

            int i = Integer.parseInt(syote);
            System.out.println(i * i * i);

        }

    }
}
