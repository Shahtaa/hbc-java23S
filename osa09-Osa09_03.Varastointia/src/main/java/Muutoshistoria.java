import java.util.ArrayList;

public class Muutoshistoria {

    private ArrayList<Double> historia;

    public Muutoshistoria() {
        historia = new ArrayList<Double>();
    }

    public void lisaa(double tilanne) {
        historia.add(tilanne);
    }

    public void nollaa() {
        historia.clear();
    }

    public double maxArvo() {
        if (historia.size() == 0) {
            return 0;
        } else {
            double max = historia.get(0);
            for (int i = 0; i < historia.size(); i++) {
                if (max < historia.get(i)) {
                    max = historia.get(i);
                }
            }
            return max;
        }

    }

    public double minArvo() {
        if (historia.size() == 0) {
            return 0;
        } else {
            double minimum = historia.get(0);
            for (int i = 0; i < historia.size(); i++) {
                if (minimum > historia.get(i)) {
                    minimum = historia.get(i);
                }
            }
            return minimum;
        }

    }

    public double keskiarvo() {
        double sum = 0;
        if (historia.size() == 0) {
            return 0;
        }

        for (Double double1 : historia) {
            sum += double1;
        }
        return sum / historia.size();
    }

    @Override
    public String toString() {
        return historia.toString();
    }
}
