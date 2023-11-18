public class Sekuntikello {
    private Viisari tunnit;
    private Viisari minuutit;
    private Viisari sekunnit;

    public Sekuntikello() {
        this.tunnit = new Viisari(24);
        this.minuutit = new Viisari(60);
        this.sekunnit = new Viisari(100);
    }

    public void etene() {
        this.sekunnit.etene();
        if (this.sekunnit.arvo() == 0) {
            this.minuutit.etene();

            if (this.minuutit.arvo() == 0) {
                this.tunnit.etene();
            }
        }
    }

    public String toString() {
        return minuutit + ":" + sekunnit;
    }
}