
public class Kappale {

    private String esittaja;
    private String nimi;
    private int pituusSekunteina;

    public Kappale(String esittaja, String nimi, int pituusSekunteina) {
        this.esittaja = esittaja;
        this.nimi = nimi;
        this.pituusSekunteina = pituusSekunteina;
    }

    public boolean equals(Object verrattava) {
        if (this == verrattava) {
            return true;
        }

        // jos verrattava olio ei ole Henkilo-tyyppinen, oliot eivät ole samat
        if (!(verrattava instanceof Kappale)) {
            return false;
        }

        // muunnetaan olio Henkilo-olioksi
        Kappale verrattavaKappale = (Kappale) verrattava;

        // jos olioiden oliomuuttujien arvot ovat samat, ovat oliot samat
        if (this.esittaja.equals(verrattavaKappale.esittaja) &&
                this.nimi.equals(verrattavaKappale.nimi) &&
                this.pituusSekunteina == verrattavaKappale.pituusSekunteina) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.esittaja + ": " + this.nimi + " (" + this.pituusSekunteina + " s)";
    }

}
