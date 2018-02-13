package kuningaskuntaSimulaatio;

/*
Aiheemme on C. Peli.

Peli alkaa muodostamalla kuningaskunnan, jossa pelaaja on kuningas. Pelaajana hallitset sukuja, joilla on riitoja ja suhteita toisiinsa.
Sukuja on monenlaisia (maagisia, uskonnollisia, sotilaallisia... jne.). Suvuille tulee ongelmia joihin sinun tulee tehd� viisaita
p��t�ksi�. P��t�ksesi vaikuttaa resursseihin ja sukujen suhteisiin, joten valitse viisaasti.

Peliss� on useita vuoroja joiden aikana p��t�ksi� tehd��n eri sukujen erilaisiin ongelmiin. Lopussa lasketaan pisteet kuinka "hyv�"
kuningaskunta saadaan aikaiseksi.
*/

import java.util.*;

public class Kuningas{ //Pelaaja
  private static String nimi;
  private static int raha;
  private static int ruoka;
  private static int vuorot;
  public ArrayList<Suku> suvut;
  public static Scanner vastaus;
  
  private static void vuorokierto(){ // Koko peli t��ll�
    raha = 100;
    ruoka = 100;
    for(int i = 0; i < vuorot; i++){
      Ongelma vuoronOngelma = new Ongelma();
      vuoronOngelma.tulosta();
      Paatos paatos = kysyPaatos(); 
      paatos.toteutaSeuraukset();
      laskePisteet();
    }
  }
  
  private static Paatos kysyPaatos(){
    return new Paatos();
  }
  
  private static void laskePisteet(){
	  
  }
  
  public static void main(String[] args){
    //prologi
    vastaus = new Scanner(System.in);
    System.out.println("Tervetuloa pelaamaan Kuningaskunta Simulaattoria! Mik� on nimenne ja tittelinne teid�n ylh�isyytenne?");
    nimi = vastaus.next();
    System.out.println("Kuinka monta vuotta aiot hallita? (Vuodessa tulee 12 ongelmaa!)");
    vuorot = vastaus.nextInt() * 12;
    
    //peli alkaa
    vuorokierto();
    
    //pelin lopetus
    System.out.println("Valtakautesi on p��ttynyt.");
    tulostaPisteet();
  }

  private static void tulostaPisteet(){
	
  }
}

class Suku{
  private int suhdeKuninkaaseen;
  private HashMap<Suku,Integer> suhteet;
  private String nimi;
  private String edustaja;
  private int populaatio;
  private int aatelisuus;			//Aina arvot 0-3
  
  private int magia;				//Suvun maagisuus (0-4)
  private int sotilaallinen;		//Suvun sotilaallisuus (0-4)
  private int uskonnollinen;		//Suvun uskonnollisuus (0-4)   ARVOT YHTEENS� 4 PER SUKU!
  private int kauppias;				//Suvun kauppiaisuus (0-4)
  private int maalainen;			//Suvun maallisuus (0-4)
  
  public void annaTiedot(){
    //Anna edustaja, suvun nimi, aatelisuus ja muut ominaisuudet pisteineen. Annetaan aina kun vuorossa esitell��n ongelma.
  }
  public Suku(){
  }
}

class Ongelma{
  private String nimi;
  private String selitys;
  private ArrayList<Suku> kohteet; //Ensimm�inen kohde on esittelija, 
  private ArrayList<Paatos> paatokset;
    // Mahdollisesti vaikeusastelis�ys n�ille ajan my�t�
  public void tulosta(){
    
  }
  public Ongelma(){
    
  }
}
class Paatos{
  public void tulostaPaatosrivi(){
    
  }
  public void toteutaSeuraukset(){
    
  }
}