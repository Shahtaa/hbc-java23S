
public class Kassapaate {

    private double rahaa; // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat; // myytyjen maukkaiden lounaiden määrä

    public Kassapaate() {
        this.rahaa = 1000;
        this.edulliset = edulliset;
        this.maukkaat = maukkaat;
        // kassassa on aluksi 1000 euroa rahaa
    }

    public double syoEdullisesti(double maksu) {
        // edullinen lounas maksaa 2.50 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja
        // metodi palauttaa koko summan

        if (maksu >= 2.5) {
            this.edulliset++;
            this.rahaa = this.rahaa + 2.50;
            return maksu - 2.50;
        }
        return maksu;
    }

    public double syoMaukkaasti(double maksu) {
        // maukas lounas maksaa 4.30 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja
        // metodi palauttaa koko summan
        if (maksu >= 4.3) {
            this.maukkaat++;
            this.rahaa = this.rahaa + 4.3;
            return maksu - 4.3;
        }
        return maksu;
    }

    public boolean syoEdullisesti(Maksukortti kortti) {
        // edullinen lounas maksaa 2.50 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan
        // true
        // muuten palautetaan false
        if (this.rahaa >= kortti.saldo()) {
            return true;
        }
        return false;
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        // maukas lounas maksaa 4.30 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan
        // true
        // muuten palautetaan false
        if (kortti.saldo() >= this.rahaa) {
            this.rahaa -= maukkaat;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
                edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
