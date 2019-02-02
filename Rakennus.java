
// Saila Kivela

import java.util.ArrayList;

public class Rakennus {
    private int asuntojenLkm;
    private Asunto asunto;
    private ArrayList<Asunto> asunnot = new ArrayList<Asunto>();
    
    public Rakennus (int asuntojenLkm){
        this.asuntojenLkm = asuntojenLkm;
        this.asunnot = new ArrayList<>();
    }
    
    public void setAsuntojenLkm(int asuntojenLkm){
        this.asuntojenLkm = asuntojenLkm;
    }
    
    public int getAsuntojenLkm(){
        return this.asuntojenLkm;
    }
    
    public void lisaaAsunto(Asunto asunto){
        asunnot.add(asunto);
    }
    
    public void tulostaTalo(){
    }
    
    public void listaaAsunnot(){
        asunnot.toString();
    }
    
    public String toString(){
        return "\nasuntojen lkm: " + this.asuntojenLkm + "\n\nasunnot:" + asunnot.toString();
    }
}


