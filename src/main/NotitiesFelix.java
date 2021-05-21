//
//
// https://www.tutorialspoint.com/design_pattern/memento_pattern.htm
//https://docs.oracle.com/javase/8/docs/api/
// https://refactoring.guru/design-patterns/bridge
// http://0111.nl/iwp
//
//iwp
//
//        iwp321pwi
//
//
//
//
//
//
//
//// Singleton
//
//
//
//public class Demo{
//    public static void main(String[] args) {
//        LotNummerUitgever lnu1 = LotNummerUitgever.geefInstantie();
//        LotNummerUitgever lnu2 = LotNummerUitgever.geefInstantie();
//        LotNummerUitgever lnu3 = LotNummerUitgever.geefInstantie();
//        LotNummerUitgever lnu4 = LotNummerUitgever.geefInstantie();
//        System.out.println(lnu1);
//        System.out.println(lnu2);
//        lnu1.lotuitgeven();
//        lnu2.lotuitgeven();
//        lnu1.lotuitgeven();
//        lnu4.lotuitgeven();
//        lnu3.lotuitgeven();
//        lnu1.lotuitgeven();
//    }
//}
//
//
//
//class LotNummerUitgever{
//    private static LotNummerUitgever instance = new LotNummerUitgever();   // terugkomen
//    private int lotnummer = 10;
//    private LotNummerUitgever() {}     // private constructor
//
//    public static LotNummerUitgever geefInstantie() {   // terugkomen
//        return instance;
//    }
//
//    void lotuitgeven() {
//        lotnummer++;
//        System.out.println("ik geef een lot uit: "+lotnummer);
//    }
//
//}
//
//
//
//
//
//
//================
//// encapsulation    Naam
//// probleem opgelossen - voordelen - voorwaarde kan scheppen aan de waarde - controle waarde
//// onderdelen UML ingezet   accessmodifier   private field     public methode    parameter returntype
////   private field    public set(argument)    public typefield get()
//// programmeren bewijzen
//
//
//
//public class Demo{
//    public static void main(String[] args) {
//        Overschrijving ov = new Overschrijving();
//        //ov.bedrag = -50;   // invoerveld
//        ov.setBedrag(-175);
//        ov.overschrijven();
//    }
//}
//class Overschrijving{
//    private int bedrag;   // only positief
//    public void setBedrag(int amount) {
//        if(amount < 0) {
//            System.out.println("dit is illegaal");
//        }else {
//            bedrag = amount;
//        }
//    }
//    public int getBedrag() {
//        return bedrag;
//    }
//    void overschrijven() {
//        System.out.println("Bij mij gaat er "+bedrag +" af.");
//        System.out.println("Bij jou komt er "+bedrag +" bij.");
//    }
//}
//
//
//
//
//
//
//
//
//================
//public class Demo{   // DRY    Dont repeat yourself   SOLID
//    public static void main(String[] args) {
//        Mens m1 = new Mens(5);     // instantieren
//        m1.voornaam = "fred";  // waarde van kenmerk    // value   // overloading - Signature
//        int d = 5;
//        Mens m2 = new Mens(d);   // argument
//        Mens m3 = new Mens(7,9);
//        m2.voornaam = "anne";
//        m1.leeftijd = 33;
//        m2.leeftijd = 35;
//        System.out.println(m1.leeftijd);
//        Mens.leeftijd = 44;
//
//    }
//}
//// default constructor verdwijnt zodra je een handmatige maakt
//// synoniem dinero cash geld doekoe
//// homoniem bank bank    kenmerk attribuut property
//
//// OOP - werkelijkheid
//
////final                        Mens     geboortedatum   ||     gemaakt  geboren  materiaal
////static                    Huis hoeveelheidInNederland Mens gemiddeldeLeeftijdVerwachting    Ticket-vliegtuig  stoelenOver
////final static                uitvinder ontdekker eerste   - zwaartekracht
////niks                        Mens     leeftijd snelheid
//
//
//
//class Mens{  // impliciet implementeerd     //1 naam als klasse 2 geen returntype
//    int leeftijd = 3;
//    static int aantalMensenOpAarde;
//    String voornaam = "fred";
//    Mens(int a){
//        System.out.println("er wordt een mens gemaakt");
//        aantalMensenOpAarde++;
//    }
//    Mens(int a, int b){    // variabele     // parameters   aantal - type - volgorde
//        int c = 3;  // locale variabele
//        System.out.println("er wordt een ander mense gemaakt");
//    }
//    public Mens() {   //   private [niks(default package-private)] protected public    access modifier     kan ik buiten klasse gebruiken
//        //    non access modifiers static?? abstract final
//    }
//    void doodgaan() {
//        aantalMensenOpAarde--;
//    }
//
//}
//class Huis{
//
//}
//
//
//// procedurele 47 - 90
//// OOP 90   -  wereld waarnemen
//// functioneel programmeren - stateless  14 streams lambda's
//
//
//
///*
// *
// *                     final
//                    14 m
//                __________________
//                |                  |
//                |                  | 6 m
//                |                  |        kleur gordijntjes??
//                |_________________|
//
//
//            karolien   34
//
//*/
//
//
//
//// Has-a - potentieel bezit    Is-a - Inheritance - Covariant            classes    -    relatie
//
//class LevendeWezens{
//
//}
//
//class Mens extends LevendeWezens{
//    Auto voorbeeldje;    // has-a relatie
//}
//
//
//
//class Auto{
//    void rijden() {
//        System.out.println("rijden");
//    }
//}