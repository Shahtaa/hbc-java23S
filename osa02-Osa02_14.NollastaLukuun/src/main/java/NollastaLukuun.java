
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = Integer.valueOf(lukija.nextLine());
        int i = 0;
        while (i <= luku) {
            System.out.println(i);
            i++;
        }
    }
}
