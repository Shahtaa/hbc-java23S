public class Esine {
    private String nimi;
    private String tunnus;

    public Esine(String nimi, String tunnus) {
        this.nimi = nimi;
        this.tunnus = tunnus;
    }

    public String getNimi() {
        return nimi;
    }

    public String getTunnus() {
        return tunnus;
    }

    public boolean equals(Object verrattava) {
        // jos muuttujat sijaitsevat samassa paikassa, ovat ne samat
        if (this == verrattava) {
            return true;
        }

        // jos verrattava olio ei ole Kirja-tyyppinen, oliot eivät ole samat
        if (!(verrattava instanceof Esine)) {
            return false;
        }

        // muunnetaan Object-tyyppinen verrattava-olio
        // Paivays-tyyppiseksi verrattavaKirja-olioksi
        Esine verrattavaTunnus = (Esine) verrattava;

        return this.nimi.equals(verrattavaTunnus.nimi)
                && this.tunnus == verrattavaTunnus.getTunnus();
    }

    public String toString() {
        return this.nimi + ": " + this.tunnus;
    }

}
