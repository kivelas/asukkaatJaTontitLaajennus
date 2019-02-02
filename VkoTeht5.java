
// Saila Kivela
// Olio-ohjelmointi -kurssin harjoitustehtava 5.
// Kurssitehtava 2:n laajennus. 


import java.util.Scanner;

public class VkoTeht5 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna omakotitalon tiedot:");
        Tontti tontti1 = kysyTontinTiedot();
        Omakotitalo omakotitalo = new Omakotitalo(1);
        Asunto asunto = kysyAsunnonTiedot();
        
        System.out.println("Anna rivitalon tiedot:");
        Tontti tontti2 = kysyTontinTiedot();
        int asuntojenLkmRt = kysyAsuntojenLkm();
        Rivitalo rivitalo = new Rivitalo(asuntojenLkmRt);
        int i = 0;
        while(asuntojenLkmRt > i){
            Asunto asuntoRt = kysyAsunnonTiedot();
            rivitalo.lisaaTaloon(asuntoRt);
            i++;
        }
        
        System.out.println("Anna kerrostalon tiedot:");
        Tontti tontti3 = kysyTontinTiedot();
        int asuntojenLkmKt = kysyAsuntojenLkm();
        Kerrostalo kerrostalo = new Kerrostalo(asuntojenLkmKt);
        int j = 0;
        while (asuntojenLkmKt > j){
            Asunto asuntoKt = kysyAsunnonTiedot();
            kerrostalo.lisaaTaloon(asuntoKt);
            j++;
        }
        
        System.out.println(tontti1);
        System.out.println(omakotitalo);
        System.out.println(asunto);
        
        System.out.println(tontti2);
        System.out.println("Asuntojen lkm: " + asuntojenLkmRt);
        System.out.println(rivitalo);
        rivitalo.tulostaTalo();
        
        System.out.println(tontti3);
        System.out.println("Asuntojen lkm: " + asuntojenLkmKt);
        System.out.println(kerrostalo);
        kerrostalo.tulostaTalo();
    }
    
    public static Tontti kysyTontinTiedot(){
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna tontin nimi: ");
        String nimi = lukija.nextLine();
        
        System.out.println("Anna osoite: ");
        String osoite = lukija.nextLine();
        boolean ok = false;
        do {
            try {
                System.out.println("Anna tontin pinta-ala: ");
                double pintaAla = Double.parseDouble(lukija.nextLine());
                if (pintaAla < 0){
                    System.out.println("Et voi antaa negatiivista pinta-alaa.");
                } else {
                    Tontti tontti = new Tontti(nimi, osoite, pintaAla);
                    ok = true;
                    return tontti;
                }
            } catch (NumberFormatException nfe) {
		System.out.println("Virhe syotteessa.");
		System.out.println(nfe.toString());
            }
	} while (ok != true);
        return null;
    }
    
    public static int kysyAsuntojenLkm(){
        Scanner lukija = new Scanner (System.in);
        boolean ok = false;
        do{
            try {
                System.out.println("Anna asuntojen lukumaara:");
                int asuntojenLkm = Integer.parseInt(lukija.nextLine());
                if(asuntojenLkm < 0){
                    System.out.println("Et voi antaa negatiivista asuntojenlukumaaraa.");
                } else {
                    ok = true;
                    return asuntojenLkm;
                }
            } catch (NumberFormatException nfe) {
		System.out.println("Virhe syotteessa.");
		System.out.println(nfe.toString());
            }
        } while (ok != true);
        return 0;
    }
    
    public static Asunto kysyAsunnonTiedot(){
        Scanner lukija = new Scanner(System.in);
        boolean ok = false;
        do {
            try {
                System.out.println("Anna asunnon pinta-ala: ");
                double pintaAla = Double.parseDouble(lukija.nextLine());
                if (pintaAla < 0){
                    System.out.println("Et voi antaa negatiivista pinta-alaa.");
                } else {
                    System.out.println("Anna huoneiden lukumaara: ");
                    int huoneidenLkm = Integer.parseInt(lukija.nextLine());
                    if (huoneidenLkm < 0){
                        System.out.println("Et voi antaa negatiivista huoneiden lukumaaraa.");
                    } else {
                        Asunto asunto = new Asunto (pintaAla, huoneidenLkm);
                        System.out.println(asunto);
                        kysyAsukkaidenTiedot(asunto);
                        ok = true;
                        return asunto;
                    }
                }
            } catch (NumberFormatException nfe) {
		System.out.println("Virhe syotteessa.");
		System.out.println(nfe.toString());
            }
        } while (ok != true);
        return null;
    }
    
    public static void kysyAsukkaidenTiedot(Asunto asunto){
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.println("Anna asukkaan nimi (tyhja lopettaa): ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()){
            break;
            }					
	asunto.lisaaAsukas(nimi);
	}
    }
}
