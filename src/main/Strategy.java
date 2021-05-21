package main;

public class Strategy{
    public static void main(String[] args) {
        Pallet pallet = new Pallet();
        pallet.setBreedte(120);

        VervoersContext vc = new VervoersContext(new VrachtVervoer(23));
        System.out.println(vc.vervoerUitvoeren(pallet));
    }
}

class VervoersContext{
    private Vervoerswijze vw;

    VervoersContext(Vervoerswijze vw){
        this.vw = vw;
    }
    String vervoerUitvoeren(Pallet pallet){
        return vw.vervoerBeschrijven(pallet) + " totaal: " + vw.vervoeren(pallet);

    }
}

interface Vervoerswijze{
    public int vervoeren(Pallet pallet);
    public String vervoerBeschrijven(Pallet pallet);
}

class BootVervoer implements Vervoerswijze{

    @Override
    public int vervoeren(Pallet pallet) {
        return pallet.getGewicht() * pallet.getHoogte();
    }

    @Override
    public String vervoerBeschrijven(Pallet pallet) {
        return "Het bootvervoer kost hoogte * breedte:" + vervoeren(pallet);
    }

}
class LuchtVervoer implements Vervoerswijze{
    private int kerosineprijs;

    LuchtVervoer(int kerosineprijs){
        this.kerosineprijs = kerosineprijs;
    }

    @Override
    public int vervoeren(Pallet pallet) {
        return (pallet.getBreedte() * pallet.getHoogte() * pallet.getLengte())*kerosineprijs;
    }

    @Override
    public String vervoerBeschrijven(Pallet pallet) {
        return "Het Luchtvervoer kost de omvang:" + vervoeren(pallet);
    }

}
class VrachtVervoer implements Vervoerswijze{
    private int tolwegenprijs;

    VrachtVervoer(int tolwegenprijs){
        this.tolwegenprijs = tolwegenprijs;
    }

    @Override
    public int vervoeren(Pallet pallet) {
        return (pallet.getBreedte() * pallet.getHoogte() * pallet.getLengte())*tolwegenprijs;
    }

    @Override
    public String vervoerBeschrijven(Pallet pallet) {
        return "Het Vrachtvervoer kost de omvang:" + vervoeren(pallet);
    }

}





class Pallet{
    private int gewicht;
    private String naam;
    private int hoogte;
    private int breedte;
    private int lengte;

    public int getGewicht() {
        return gewicht;
    }
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public int getHoogte() {
        return hoogte;
    }
    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;
    }
    public int getBreedte() {
        return breedte;
    }
    public void setBreedte(int breedte) {
        this.breedte = breedte;
    }
    public int getLengte() {
        return lengte;
    }
    public void setLengte(int lengte) {
        this.lengte = lengte;
    }


}