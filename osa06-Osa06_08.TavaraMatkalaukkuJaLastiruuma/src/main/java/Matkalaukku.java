import java.util.ArrayList;

public class Matkalaukku {

    // oliomuuttujat

    private ArrayList<Tavara> tavarat;
    private int maksimiPaino;

    // konstruktori
    public Matkalaukku(int maksimiPaino) {
        this.maksimiPaino = maksimiPaino;
        this.tavarat = new ArrayList<>();
    }

    public void lisaaTavara(Tavara tavara) {

        if ((yhteispaino() + tavara.getPaino()) <= this.maksimiPaino) {
            tavarat.add(tavara);
        }

    }

    public int yhteispaino() {
        int paino = 0;
        for (Tavara t : this.tavarat) {
            paino += t.getPaino();
        }
        return paino;
    }

    public void tulostaTavarat() {
        for (Tavara tavara : this.tavarat) {
            System.out.println(tavara);
        }
    }

    public Tavara raskainTavara() {
        if (tavarat.size() == 0) {
            return null;
        } else {
            Tavara painavin = tavarat.get(0);
            for (Tavara tavara : tavarat) {
                if (painavin.getPaino() < tavara.getPaino()) {
                    painavin = tavara;
                }
            }
            return painavin;
        }
    }

    public String toString() {
        int paino = yhteispaino();
        if (tavarat.size() == 0) {
            return "ei tavaroita (" + paino + " kg)";
        } else if (tavarat.size() == 1) {
            return tavarat.size() + " tavara (" + paino + " kg)";
        } else {
            return tavarat.size() + " tavaraa (" + paino + " kg)";
        }
    }
}
