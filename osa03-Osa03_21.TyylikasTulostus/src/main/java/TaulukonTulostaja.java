
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = { 5, 1, 3, 4, 2 };
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        if (taulukko.length >= 1) {
            System.out.print(taulukko[0]);
        }

        // note that i starts at 1, since we already printed the element at index 0
        for (int i = 1; i < taulukko.length; i++) {
            System.out.print(", " + taulukko[i]);
        }

    }
}