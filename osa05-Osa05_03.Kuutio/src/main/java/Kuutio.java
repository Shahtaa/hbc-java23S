public class Kuutio {
    private int sarmanPituus;

    // konstruktori
    public Kuutio(int sarmanPituus) {
        this.sarmanPituus = sarmanPituus;
    }

    // metodi
    public int tilavuus() {

        return this.sarmanPituus * this.sarmanPituus * this.sarmanPituus;
    }

    public String toString() {
        return "Kuution särmän pituus on " + this.sarmanPituus + ", tilavuus on " + this.tilavuus();
    }
}
