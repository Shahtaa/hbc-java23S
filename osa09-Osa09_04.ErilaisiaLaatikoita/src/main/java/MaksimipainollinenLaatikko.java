import java.util.ArrayList;
import java.util.List;

public class MaksimipainollinenLaatikko extends Laatikko {

    private int maksimipaino;
    private List<Tavara> tavarat;

    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.tavarat = new ArrayList<>();
        this.maksimipaino = maksimipaino;
    }

    public void lisaa(Tavara tavara) {
        int yhteispaino = laskePaino();
        if ((yhteispaino + tavara.getPaino()) <= maksimipaino) {
            tavarat.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        for (Tavara asia : tavarat) {
            if (asia.equals(tavara)) {
                return true;
            }
        }
        return false;
    }

    private int laskePaino() {
        int paino = 0;
        for (Tavara tavara : tavarat) {
            paino += tavara.getPaino();
        }
        return paino;
    }

}
