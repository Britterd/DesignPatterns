package main;

/**
 * Britt van Mourik
 */

// bv localDateTime

public class Factory {


    public static void main(String[] args) {
//        Fabriek fabriek = new Fabriek();
//        Voertuig v = fabriek.maakVoertuig(7);
//        v.rijden();

    }

    class Fabriek {
//        Voertuig maakVoertuig(int bestelNummer) {
//            if (bestelNummer < 3) {
//                return new Auto();
//            } else {
//                new Jetski();
//            }
//        }
    }

    interface Voertuig{
        void rijden(); // impleciet public abstract - 4 regels bij Override

        //1 zelfde naam & signature
        //2 returntype moet covariant zijn (is-a)
        //3 acces modifiers mag niet vernauwen
        //4 exception die je throwt moet covariant zijn of niets - Checked Exceptions

    }

    class Auto implements Voertuig {

        @Override
        public void rijden(){
            System.out.println("Rijden in Auto");
        }
    }

    class Jetski implements Voertuig{

        public void rijden(){
            System.out.println("Rijden in Jetski");
        }

    }
}

