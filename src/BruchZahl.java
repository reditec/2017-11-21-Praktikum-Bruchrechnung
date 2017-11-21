public class BruchZahl {

    private int pZaehler = 0;
    private int pNenner = 0;

    public BruchZahl(int zaehler, int nenner){
        setZaehler(zaehler);
        setNenner(nenner);
    }

    public BruchZahl multipizieren(BruchZahl andereBruchZahl){
        if ((andereBruchZahl == null)) {
            throw new IllegalArgumentException("Argument 'andereBruchZahl' is null");
        } else {
            BruchZahl result = new BruchZahl(pZaehler * andereBruchZahl.pZaehler, pNenner * andereBruchZahl.pNenner);
            return result;
        }
    }

    private void kuerzen(){
        if(pZaehler != 0) {
            int kleinstes = 0;
            if(pZaehler < pNenner) {
                kleinstes = pZaehler;
            }
            else {
                kleinstes = pNenner;
            }

            int vielfaches = 1;
            for(int i = kleinstes; i > 1; i--){
                if((pZaehler % i == 0) && (pNenner % i == 0)) {
                    vielfaches = i;
                }
            }
            pZaehler /= vielfaches;
            pNenner /= vielfaches;
        }

    }

    public void setZaehler(int zahl) {
        pZaehler = zahl;
        kuerzen();
    }

    public void setNenner(int zahl) {
        if(zahl == 0) {
            throw new IllegalArgumentException("Argument 'nenner' is 0");
        }
        else {
            pNenner = zahl;
            kuerzen();
        }
    }

    public int getZaehler(){
        return pZaehler;
    }

    public int getNenner(){
        return pNenner;
    }

}