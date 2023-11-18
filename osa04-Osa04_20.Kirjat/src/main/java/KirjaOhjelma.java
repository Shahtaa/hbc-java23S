public class KirjaOhjelma {
    private String nimi;
    private int sivuja;
    private int vuosi;

    public KirjaOhjelma(String nimi, int sivuja, int vuosi) {
        this.nimi = nimi;
        this.sivuja = sivuja;
        this.vuosi = vuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public int getSivuja() {
        return sivuja;
    }

    public int getVuosi() {
        return vuosi;
    }

    public String toString() {
        return this.nimi + ", " + this.sivuja + " sivua, " + this.vuosi;
    }
}
