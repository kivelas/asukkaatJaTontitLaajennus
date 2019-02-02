
// Saila Kivela

import java.util.ArrayList;

public class Asunto {
    private double pintaAla;
    private int huoneidenLkm;
    private Asukas asukas;
    private ArrayList<Asukas> asukkaat = new ArrayList<Asukas>();

    public Asunto(double pintaAla, int huoneidenLkm){
        this.pintaAla = pintaAla;
        this.huoneidenLkm = huoneidenLkm;
        this.asukkaat = new ArrayList<>();
    }
    
    public void setPintaAla(double pintaAla){
        this.pintaAla = pintaAla;
    }
    
    public double getPintaAla(){
        return this.pintaAla;
    }
    
    public void setHuoneidenLkm(int huoneidenLkm){
        this.huoneidenLkm = huoneidenLkm;
    }
    
    public int getHuoneidenLkm(){
        return this.huoneidenLkm;
    }
    
    public void lisaaAsukas(String nimi){
	Asukas uusi = new Asukas (nimi);
	asukkaat.add(uusi);
	}
    
    public void listaaAsukkaat(){
        for (Asukas asukas: asukkaat){
            asukas.tulostaAsukas();
        }
    }
    
    public String toString(){
        return "\n\npinta-ala: " + this.pintaAla + "\nhuoneiden lkm: " + this.huoneidenLkm + "\nasukkaat:" + asukkaat.toString();
    }
}
