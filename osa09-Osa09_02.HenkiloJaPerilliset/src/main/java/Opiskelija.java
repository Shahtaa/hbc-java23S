
public class Opiskelija extends Henkilo {

    private int opintopistet;

    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
        this.opintopistet = 0;
    }

    public void opiskele() {
        this.opintopistet++;
    }

    public int opintopisteita() {
        return this.opintopistet;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  opintopisteitä " + opintopistet;
    }
}
