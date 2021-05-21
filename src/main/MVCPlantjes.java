package main;

import java.util.Scanner;

/**
 * Britt van Mourik
 */

public class MVCPlantjes {

    public static void main(String[] args) {
        Plant plant = haalPlantUitDatabase();
        tuinMeubel tuinMeubel = haalMeubelUitDatabase();

        TuinView tuinView = new TuinView();
        TuinController tuinController = new TuinController(plant, tuinMeubel, tuinView);
        tuinController.updateView();

        tuinController.updatePlant();
        tuinController.updateView();
    }

    private static Plant haalPlantUitDatabase(){
        Plant plant = new Plant();
        plant.setSoortnaam("Lavendel");
        plant.setHoogte(100);
        plant.setKleur("paars");
        return plant;
    }

    private static tuinMeubel haalMeubelUitDatabase(){
        tuinMeubel tm = new tuinMeubel();
        tm.setMeubelType("bankje");
        tm.setMeubelKleur("roze");
        return tm;
    }
}

class Plant{
    private String soortnaam;
    private int hoogte;
    private String kleur;

    public String getSoortnaam() {
        return soortnaam;
    }

    public void setSoortnaam(String soortnaam) {
        this.soortnaam = soortnaam;
    }

    public int getHoogte() {
        return hoogte;
    }

    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
}

class tuinMeubel{
    String meubelType;
    String meubelKleur;

    public String getMeubelType() {
        return meubelType;
    }

    public void setMeubelType(String meubelType) {
        this.meubelType = meubelType;
    }

    public String getMeubelKleur() {
        return meubelKleur;
    }

        public void setMeubelKleur(String meubelKleur) {
            this.meubelKleur = meubelKleur;
        }
}

class TuinView{

    public void printTuin(String soortnaam, int hoogte, String kleur,
    String meubelType, String meubelKleur){

        System.out.println("In je tuintje staat het volgende: \n");

        System.out.println("Plantsoort: " + soortnaam);
        System.out.println("    Hoogte: " + hoogte + " cm");
        System.out.println("     Kleur: " + kleur);

//        System.out.println("Je hebt nu " +  + " planten in de tuin\n");
        System.out.println("");

        System.out.println("Meubeltype: " + meubelType);
        System.out.println("     Kleur: " + meubelKleur + "\n");

    }

    public Plant invoerPlantje(){
        //dto data transfer object

        System.out.println("\n Pas je plantje aan: \n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wat is de naam van je nieuwe plant? ");
        String plantSoort = scanner.nextLine();
        System.out.print("En de hoogte?: ");
        int plantHoogte = scanner.nextInt();
        System.out.print("En de kleur?: ");
        String plantKleur = scanner.next();
        scanner.close();

        Plant plant = new Plant();
        plant.setSoortnaam(plantSoort);
        plant.setHoogte(plantHoogte);
        plant.setKleur(plantKleur);
        return plant;
    }
}

class TuinController{

    private Plant plant;
    private tuinMeubel meubel;
    private TuinView view;

    public TuinController(Plant plant, tuinMeubel meubel, TuinView view){
        this.plant = plant;
        this.meubel = meubel;
        this.view = view;
    }

    public void setPlantSoort(String soort){
        plant.setSoortnaam(soort);
    }

    public String getPlantSoort(){
        return plant.getSoortnaam();
    }

    public void setPlantHoogte(int hoogte){
        plant.setHoogte(hoogte);
    }

    public int getPlantHoogte(){
        return plant.getHoogte();
    }

    public void setPlantKleur(String kleur){
        plant.setKleur(kleur);
    }

    public String getPlantKleur(){
        return plant.getKleur();
    }

    public String getMeubelType() {
        return meubel.getMeubelType();
    }

    public void setMeubelType(String meubelType) {
        meubel.setMeubelType(meubelType);
    }

    public String getMeubelKleur() {
        return meubel.getMeubelKleur();
    }

    public void setMeubelKleur(String meubelKleur) {
        meubel.setMeubelKleur(meubelKleur);
    }

//    public int getAantalPlanten() {
//
//    }

    public void updateView(){
        view.printTuin(plant.getSoortnaam(), plant.getHoogte(), plant.getKleur(),
                meubel.getMeubelType(), meubel.getMeubelKleur());
    }

    public void updatePlant(){
        this.plant = view.invoerPlantje();
    }
}
