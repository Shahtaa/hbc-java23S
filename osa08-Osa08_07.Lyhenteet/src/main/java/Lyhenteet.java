import java.util.ArrayList;
import java.util.Arrays;

public class Lyhenteet {
    private final ArrayList<String> lyhenteet;

    public Lyhenteet() {
        this.lyhenteet = new ArrayList<>();
    }

    public void lisaaLyhenne(String lyhenne, String selite) {

        if (this.lyhenteet.contains(lyhenne)) {
            System.out.println("Kirja on jo kirjastossa!");
        } else {
            lyhenteet.add(lyhenne);
            lyhenteet.add(selite);
        }
    }

    public boolean onkoLyhennetta(String lyhenne) {
        return lyhenteet.contains(lyhenne);
    }

    public String haeLyhenne(String lyhenne) {

        for (String string : lyhenteet) {
            if (string == lyhenne) {
                return lyhenne;
            }
        }
        return null;
    }

}
