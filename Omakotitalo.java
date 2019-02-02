
// Saila Kivela

public class Omakotitalo extends Rakennus{
    
    private String rakennustyyppi = "omakotitalo";
    
    public Omakotitalo (int asuntojenLkm){
        super(asuntojenLkm);
    }
    
    public String getRakennustyyppi(){
        return rakennustyyppi;
    }
    
    public String toString(){
        return "\nrakennustyyppi: " + rakennustyyppi;
    }
}
