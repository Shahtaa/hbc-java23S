
public class MuistavaTuotevarasto extends Tuotevarasto {

    private Muutoshistoria muutoshistoria = new Muutoshistoria();

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        muutoshistoria.lisaa(alkuSaldo);
        super.lisaaVarastoon(alkuSaldo);
    }

    public String historia() {
        return muutoshistoria.toString();
    }

    public void lisaaVarastoon(double maara) {
        super.lisaaVarastoon(maara);
        muutoshistoria.lisaa(getSaldo());

    }

    public double otaVarastosta(double maara) {
        double tilanne = super.otaVarastosta(maara);
        muutoshistoria.lisaa(tilanne);
        return tilanne;
    }
}