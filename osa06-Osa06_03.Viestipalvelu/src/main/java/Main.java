
public class Main {

    public static void main(String[] args) {

        // Kokeile luokkaasi täällä
        Viestipalvelu vp = new Viestipalvelu();
        System.out.println(vp.getViestit());
        Viesti v = new Viesti("lahettaja", "viesti");
        vp.lisaa(v);
        System.out.println(vp.getViestit());
    }
}
