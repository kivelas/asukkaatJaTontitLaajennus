
import java.util.Vector;


// Saila Kivela

public class Rivitalo extends Rakennus{
    
    private String rakennustyyppi = "rivitalo";
    private Vector<Asunto> rivitalo = new Vector<Asunto>();
    
    public Rivitalo (int asuntojenLkm){
        super(asuntojenLkm);
        this.rivitalo = new Vector<>();
    }
    
    public String getRakennustyyppi(){
        return rakennustyyppi;
    }
    
    public void lisaaTaloon(Asunto asunto) {
        rivitalo.add(asunto);
    }
    
    public void tulostaTalo(){
        System.out.println(rivitalo.toString());
    }
    
    public String toString(){
        return "\nrakennustyyppi: " + rakennustyyppi + "\nasunnot:\n";
    }
}
