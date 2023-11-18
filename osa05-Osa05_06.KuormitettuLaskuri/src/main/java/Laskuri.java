public class Laskuri {
    private int alkuarvo;

    public Laskuri(int alkuarvo) {
        this.alkuarvo = alkuarvo;
    }

    public Laskuri() {
        this.alkuarvo = 0;
    }

    public int arvo() {
        return alkuarvo;
    }

    public void lisaa() {
        this.alkuarvo += 1;
    }

    public void vahenna() {
        this.alkuarvo -= 1;
    }

    public void lisaa(int lisays) {
        if (lisays >= 0) {
            this.alkuarvo += lisays;
        }

    }

    public void vahenna(int vahennys) {
        if (vahennys >= 0) {
            this.alkuarvo -= vahennys;
        }

    }
}