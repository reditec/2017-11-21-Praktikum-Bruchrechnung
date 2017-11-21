public class Main {

    public static void main(String[] args) {

        BruchZahl bruchZahl = new BruchZahl(2,4);
        BruchZahl ergebnis = bruchZahl.multipizieren(new BruchZahl(6,8));

        System.out.println(ergebnis.getZaehler() + " / " + ergebnis.getNenner());
    }

}