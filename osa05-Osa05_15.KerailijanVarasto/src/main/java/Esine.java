public class Esine {
    private String nimi;
    private String tunnus;

    public Esine(String nimi, String tunnus) {
        this.nimi = nimi;
        this.tunnus = tunnus;
    }

    public String toString() {
        return this.nimi + ": " + this.tunnus;
    }

}
