package main;

import org.w3c.dom.ls.LSOutput;

/**
 * Britt van Mourik
 */


// object dat nieuw BSN maakt bijvoorbeeld; wil je er maar 1 van hebben!

public class Singleton {


    public static void main(String[] args) {
        LotNummerUitgever lnu1 = LotNummerUitgever.geefInstantie();
        LotNummerUitgever lnu2 = LotNummerUitgever.geefInstantie();
        System.out.println(lnu1);
        System.out.println(lnu2);
        lnu1.lotUitgeven();
        lnu2.lotUitgeven();
    }
}

class LotNummerUitgever{

    private static LotNummerUitgever instance = new LotNummerUitgever();
    private int lotNummer = 10; // in dit voorbeeld kan het ook static zijn

    private LotNummerUitgever(){ // private constructor

    }

    public static LotNummerUitgever geefInstantie(){
        return instance;
    }

    void lotUitgeven(){
        lotNummer++;
        System.out.println("Ik geef mijn lot uit: " + lotNummer);
    }

}
