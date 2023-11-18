
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }

    public boolean suurempi(Asunto verrattava) {
        if (this.nelioita > verrattava.nelioita) {
            return true;
        }
        return false;
    }

    public int hintaero(Asunto verrattava) {
        if (this.neliohinta * this.nelioita > verrattava.nelioita * verrattava.neliohinta) {
            return this.neliohinta * this.nelioita - verrattava.nelioita * verrattava.neliohinta;
        } else {
            return verrattava.nelioita * verrattava.neliohinta - this.neliohinta * this.nelioita;
        }
    }

    public boolean kalliimpi(Asunto verrattava) {

        if (this.neliohinta * this.nelioita > verrattava.nelioita * verrattava.neliohinta) {
            return true;
        } else {
            return false;
        }

    }
}
