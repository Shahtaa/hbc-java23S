
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Lahjan suuruus?");
        int summa = Integer.valueOf(lukija.nextLine());
        double vero = 0;
        if (summa >= 5000 && summa <= 25000) {
            vero = (100 + (summa - 5000) * 0.08);
        } else if (summa >= 25000 && summa <= 55000) {
            vero = (1700 + (summa - 25000) * 0.1);
        } else if (summa >= 55000 && summa <= 200000) {
            vero = (4700 + (summa - 55000) * 0.12);
        } else if (summa >= 200000 && summa <= 1000000) {
            vero = (22100 + (summa - 200000) * 0.15);
        } else if (summa > 1000000) {
            vero = (142100 + (summa - 1000000) * 0.17);
        } else {
            System.out.println("Ei veroa!");
        }
        System.out.println("Vero: " + vero);
    }
}
