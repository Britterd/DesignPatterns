package main;

/**
 * Britt van Mourik
 */

public class FactoryBar {

    public static void main(String[] args) {

        Bar bar = new Bar();
        bar.geefDrankje("wijn").drinken();

        Drankje drankje = bar.geefDrankje("bier");
        drankje.drinken();
    }

}

class Bar {
    public Drankje geefDrankje(String drankje) {

        if (drankje.equals("wijn")) {
            return new Wijn();
        } else if (drankje.equals("bier")) {
            return new Bier();
        } else if (drankje.equals("cola")) {
            return new Cola();
        } else {
            return null;
        }
    }
}

    interface Drankje {
        void drinken();
    }

    class Wijn implements Drankje {

        @Override
        public void drinken() {
            System.out.println("Drink je wijntje");
        }
    }

    class Bier implements Drankje {

        @Override
        public void drinken() {
            System.out.println("Drink je biertje");
        }

    }

    class Cola implements Drankje {

        @Override
        public void drinken() {
            System.out.println("Drink je colaatje");
        }

    }

