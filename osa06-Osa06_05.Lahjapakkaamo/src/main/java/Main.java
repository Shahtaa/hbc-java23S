public class Main {
    public static void main(String[] args) {
        Lahja l1 = new Lahja("kirja", 2);
        Lahja l2 = new Lahja("nalle", 1);
        Lahja l3 = new Lahja("nauris", 4);
        Pakkaus p = new Pakkaus();
        p.lisaaLahja(l1);
        p.lisaaLahja(l2);
        p.lisaaLahja(l3);
        System.out.println(p.yhteispaino());
    }
}