import java.util.ArrayList;

public class Pakkaus {
    private ArrayList<Lahja> lahjat;

    public Pakkaus() {
        this.lahjat = new ArrayList<>();
    }

    public void lisaaLahja(Lahja lahja) {
        this.lahjat.add(lahja);
    }

    public int yhteispaino() {
        int paino = 0;
        for (Lahja lahja : lahjat) {
            paino += lahja.getPaino();
        }
        return paino;
    }
}
