public class LukujenSumma {

    public static int summa(int luku1, int luku2, int luku3, int luku4) {
        // kirjoita koodia tähän
        int vastaus = luku1+luku2+luku3+luku4;
        return vastaus;
    }

    public static void main(String[] args) {
        int vastaus = summa(4, 3, 6, 1);
        System.out.println("Summa: " + vastaus);
    }
}
