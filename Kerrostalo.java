
import java.util.Vector;


// Saila Kivela

public class Kerrostalo extends Rakennus{
    
    private String rakennustyyppi = "kerrostalo";
    private Vector<Asunto> kerrostalo = new Vector<Asunto>();
    
    public Kerrostalo (int asuntojenLkm){
        super(asuntojenLkm);
        this.kerrostalo = new Vector<>();
    }
    
    public String getRakennustyyppi(){
        return rakennustyyppi;
    }
    
    public void lisaaTaloon(Asunto asunto) {
        kerrostalo.add(asunto);
    }
    
    public void tulostaTalo(){
        System.out.println(kerrostalo.toString());
    }
    
    public String toString(){
        return "\nrakennustyyppi: " + rakennustyyppi+ "\nasunnot:\n";
    }
}
