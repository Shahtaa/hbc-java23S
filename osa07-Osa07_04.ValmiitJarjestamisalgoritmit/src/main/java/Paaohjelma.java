import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(3);
        luvut.add(2);
        luvut.add(0);
        luvut.add(1);
        jarjestaLuvut(luvut);
        System.out.println(luvut);
    }

    public static void jarjesta(int[] taulukko) {
        Arrays.sort(taulukko);
    }

    public static void jarjesta(String[] taulukko) {
        Arrays.sort(taulukko);
    }

    public static void jarjestaLuvut(ArrayList<Integer> luvut) {
        Collections.sort(luvut);
    }

    public static void jarjestaMerkkijonot(ArrayList<String> merkkijonot) {
        Collections.sort(merkkijonot);
    }

}
