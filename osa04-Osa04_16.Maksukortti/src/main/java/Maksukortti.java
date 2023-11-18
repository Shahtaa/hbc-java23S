public class Maksukortti {
    private double saldo;

    public Maksukortti(double alkusaldo) {
        // kirjoita koodia tähän
        this.saldo = alkusaldo;
    }

    public String toString() {
        // kirjoita koodia tähän
        return "Kortilla on rahaa " + this.saldo + " euroa";

    }

    public void syoEdullisesti() {
        // kirjoita koodia tähän

        if (this.saldo - 2.60 >= 0) {
            this.saldo = saldo - 2.60;
        }
    }

    public void syoMaukkaasti() {
        // kirjoita koodia tähän
        if (this.saldo - 4.60 >= 0) {
            this.saldo = saldo - 4.60;
        }

    }

    public void lataaRahaa(double rahamaara) {
        // kirjoita koodia tähän
        if (rahamaara > 0) {
            this.saldo = saldo + rahamaara;

        }

        if (this.saldo >= 150) {
            this.saldo = 150;
        }
    }
}