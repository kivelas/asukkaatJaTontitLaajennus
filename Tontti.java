
//Saila Kivela

public class Tontti {
    private String nimi;
    private String osoite;
    private double pintaAla;
    private Rakennus rakennus;
    
    public Tontti (String nimi, String osoite, double pintaAla){
        this.nimi = nimi;
        this.osoite = osoite;
        this.pintaAla = pintaAla;
        
    }
    
    public void setNimi(String nimi){
        this.nimi = nimi;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public void setOsoite(String osoite){
        this.osoite = osoite;
    }
    
    public String getOsoite(){
        return this.osoite;
    }
    
    public void setPintaAla(double pintaAla){
        this.pintaAla = pintaAla;
    }
    
    public double getPintaAla(){
        return this.pintaAla;
    }
    
    public void lisaaRakennus(int asuntojenLkm){
        this.rakennus = new Rakennus (asuntojenLkm);
    }
    
    public String toString(){
        return "\nTontti:\nnimi: " + this.nimi + "\nosoite: " + this.osoite + "\npinta-ala: " + this.pintaAla;
    }
}
