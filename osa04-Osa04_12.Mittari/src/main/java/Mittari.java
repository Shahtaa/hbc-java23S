public class Mittari {
    private int mitta;

    public int getMitta() {
        return this.mitta;
    }

    public void lisaa() {
        if (this.mitta < 5)
            this.mitta++;
    }

    public void vahenna() {
        if (this.mitta > 0)
            this.mitta--;
    }

    public int mitta() {
        return this.mitta;
    }

    public boolean taynna() {
        if (this.mitta == 5) {
            return true;
        }
        return false;

    }
}