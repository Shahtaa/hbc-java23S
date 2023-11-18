import java.util.ArrayList;
import java.util.List;

public class Huone {

    private ArrayList<Henkilo> henkilot;

    public Huone() {
        this.henkilot = new ArrayList<>();
    }

    public boolean onTyhja() {
        if (!henkilot.isEmpty()) {
            return false;
        }
        return true;
    }

    public void lisaa(Henkilo henkilo) {
        this.henkilot.add(henkilo);
    }

    public ArrayList<Henkilo> getHenkilot() {

        return henkilot;
    }

    public Henkilo lyhin() {

        if (this.henkilot.isEmpty()) {
            return null;
        }

        // luo palautettavaa oliota kuvaava oliomuuttuja,
        // jonka arvoksi asetetaan listan ensimmäinen olio
        Henkilo palautettava = this.henkilot.get(0);

        // käy lista läpi
        for (Henkilo hlo : this.henkilot) {
            // vertaa kutakin listalla olevaa oliota
            // palautettavaan -- tässä etsimme lyhintä, joten
            // vertailemme pituuksia

            if (palautettava.getPituus() > hlo.getPituus()) {
                // mikäli vertailussa löydetään lyhyempi henkilö,
                // asetetaan se palautettavan arvoksi
                palautettava = hlo;
            }
        }

        // lopulta palautettavaa oliota kuvaava oliomuuttuja
        // palautetaan
        return palautettava;
    }

    public Henkilo ota() {
        if (this.henkilot.isEmpty()) {
            return null;
        }

        Henkilo palautettava = this.henkilot.get(0);

        // käy lista läpi
        for (Henkilo hlo : this.henkilot) {
            // vertaa kutakin listalla olevaa oliota
            // palautettavaan -- tässä etsimme lyhintä, joten
            // vertailemme pituuksia

            if (palautettava.getPituus() > hlo.getPituus()) {
                // mikäli vertailussa löydetään lyhyempi henkilö,
                // asetetaan se palautettavan arvoksi
                palautettava = hlo;

            }
        }

        // lopulta palautettavaa oliota kuvaava oliomuuttuja
        // poistetaan ja palautetaan
        this.henkilot.remove(palautettava);
        return palautettava;
    }

}
