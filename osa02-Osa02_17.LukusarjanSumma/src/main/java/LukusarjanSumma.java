
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mihin asti? ");
        int max = Integer.valueOf(lukija.nextLine());
        int i = 0;
        int summa = 0;
        while (i < max) {
            i++;
            summa = summa + i;
        }
        System.out.println("Summa on " + summa);
    }
}
