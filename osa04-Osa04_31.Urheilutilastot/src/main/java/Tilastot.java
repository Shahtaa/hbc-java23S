public class Tilastot {
    private String kotijoukkue;
    private String vierasjoukkue;
    private int kotipisteet;
    private int vieraspisteet;

    public Tilastot(String kotijoukkue, String vierasjoukkue, int kotipisteet, int vieraspisteet) {
        this.kotijoukkue = kotijoukkue;
        this.vierasjoukkue = vierasjoukkue;
        this.kotipisteet = kotipisteet;
        this.vieraspisteet = vieraspisteet;
    }

    public String getKotijoukkue() {
        return kotijoukkue;
    }

    public String getVierasjoukkue() {
        return vierasjoukkue;
    }

    public int getKotipisteet() {
        return kotipisteet;
    }

    public int getVieraspisteet() {
        return vieraspisteet;
    }

    public String toString() {
        return this.kotijoukkue + ", " + this.vierasjoukkue;
    }
}
