package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Britt van Mourik
 */

public class BuilderPOTATO {

    public static void main(String[] args) {

        PotatoHeadBuilder phb = new PotatoHeadBuilder();

        MisterPotatoHead ph = phb.maakAardappelhoofd();
        System.out.println("Aardappelhoofdje: ");
        try {
            ph.beschikbaar();
        } catch (Exception onderdeelNietBeschikbaar) {
            System.out.println(onderdeelNietBeschikbaar.toString());
        }

    }

}

interface Onderdeel{
    public String naam();
    public boolean beschikbaar();
}

class Voeten implements Onderdeel {
    @Override
    public String naam(){
         return "hat";
     }

     @Override
    public boolean beschikbaar(){
        return true;
     }
}

class Hoofd implements Onderdeel{
    @Override
    public String naam(){
        return "Aardappel hoofd";
    }

    @Override
    public boolean beschikbaar(){
        return false;
    }
}

class MisterPotatoHead{
    private List<Onderdeel> onderdelen = new ArrayList<>();

    public void onderdeelToevoegen(Onderdeel onderdeel){
        onderdelen.add(onderdeel);
    }

    public void beschikbaar() throws Exception{

        for(Onderdeel onderdeel : onderdelen){
            if(!onderdeel.beschikbaar()){
                throw new Exception();
            } else {
                geefOnderdelen();
            }
        }

    }

    public void geefOnderdelen(){
        System.out.print("Je Potatohead heeft de volgende onderdelen: ");
        for(Onderdeel onderdeel : onderdelen){
            System.out.print(onderdeel.naam() + ", ");
        }

    }

}

class PotatoHeadBuilder{

    public MisterPotatoHead maakAardappelhoofd(){
        MisterPotatoHead ph = new MisterPotatoHead();
        ph.onderdeelToevoegen(new Voeten());
        ph.onderdeelToevoegen(new Hoofd());

        return ph;
    }

}