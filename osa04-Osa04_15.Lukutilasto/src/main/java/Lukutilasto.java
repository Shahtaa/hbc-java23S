public class Lukutilasto {
    private int lukujenMaara;
    private int summa;

    public Lukutilasto() {
        this.lukujenMaara = 0;
        this.summa = 0;
        // alusta tässä muuttuja lukujenMaara
    }

    public void lisaaLuku(int luku) {
        // kirjoita koodia tähän
        this.lukujenMaara++;
        this.summa += luku;

    }

    public int haeLukujenMaara() {
        // kirjoita koodia tähän

        return this.lukujenMaara;
    }

    public int summa() {
        // kirjoita koodia tähän

        return this.summa;

    }

    public double keskiarvo() {
        // kirjoita koodia tähän

        // return this.summa();
        if (this.summa == 0.0) {
            return 0.0;
        }
        return 1.0 * this.summa / this.lukujenMaara;
    }
}