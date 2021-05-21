package main;

/**
 * Britt van Mourik
 */

// encapsulation Naam
    // probleem oplossen
    // onderdelen UML ingezet private field, public methode, parameters
        // private field public set(arg) public typefield get()
    // programmeren bewijzen

public class Encapsulation {

    public static void main(String[] args) {
        Overschrijving ov = new Overschrijving();
        ov.setBedrag(-75); // invoerveld
        ov.overschrijven();
    }

}

class Overschrijving{
    private int bedrag; // only positive

    public void setBedrag(int amount){
        if(amount < 0){
            System.out.println("Dit is illegaal");
        } else {
            bedrag = amount;
        }
    }

    public int getBedrag(){
        return bedrag;
    }

    void overschrijven() {
        System.out.println("Bij mij gaat er " + bedrag + " af.");
        System.out.println("Bij jou komt er " + bedrag + " bij.");
    }
}
