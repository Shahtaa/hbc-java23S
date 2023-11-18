import java.util.ArrayList;

public class Lastiruuma {
    private ArrayList<Matkalaukku> laukut;
    private int maksimiPaino;

    public Lastiruuma(int maksimiPaino) {
        this.maksimiPaino = maksimiPaino;
        this.laukut = new ArrayList<>();
    }

    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if (yhteispaino() + laukku.yhteispaino() <= maksimiPaino) {
            laukut.add(laukku);
        }
    }

    public int yhteispaino() {
        int paino = 0;
        for (Matkalaukku l : this.laukut) {
            paino += l.yhteispaino();
        }
        return paino;
    }

    public void tulostaTavarat() {
        for (Matkalaukku laukku : this.laukut) {
            laukku.tulostaTavarat();
        }
    }

    public String toString() {
        return laukut.size() + " matkalaukkua (" + yhteispaino() + " kg)";
    }

}