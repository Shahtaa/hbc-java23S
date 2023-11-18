import java.util.ArrayList;

public class Viestipalvelu {

    private ArrayList<String> viestit;

    public Viestipalvelu() {
        this.viestit = new ArrayList<>();
    }

    public ArrayList<Viesti> getViestit() {
        return viestit;
    }

    public void lisaa(Viesti viesti) {
        this.viestit.add(viesti);
    }

    public String toString() {
        return this.viestit + ", pituusalaraj";
    }

}
