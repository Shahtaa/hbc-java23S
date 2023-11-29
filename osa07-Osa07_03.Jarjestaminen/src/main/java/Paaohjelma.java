import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] luvut = { 8, 3, 7, 9, 1, 2, 4 };
        Paaohjelma.jarjesta(luvut);
    }

    public static int pienin(int[] taulukko) {
        int min = taulukko[0];
        // Loop through the array
        for (int i = 0; i < taulukko.length; i++) {
            // Compare elements of array with min
            if (taulukko[i] < min)
                min = taulukko[i];
        }
        return min;
    }

    public static int pienimmanIndeksi(int[] taulukko) {
        int index = 0;
        int min = taulukko[index];

        for (int i = 1; i < taulukko.length; i++) {
            if (taulukko[i] <= min) {
                min = taulukko[i];
                index = i;
            }
        }
        return index;
    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int index = 0;
        int min = taulukko[aloitusIndeksi];

        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (taulukko[i] <= min) {
                min = taulukko[i];
                index = i;
            }
        }
        return index;
    }

    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        // kirjoita koodia tähän
        int temp = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = temp;

    }

    public static void jarjesta(int[] taulukko) {
        for (int i = 0; i < taulukko.length; i++) {
            System.out.println(Arrays.toString(taulukko));
            Paaohjelma.vaihda(taulukko, i, Paaohjelma.pienimmanIndeksiAlkaen(taulukko, i));
        }

    }
}