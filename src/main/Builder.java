package main;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Britt van Mourik
 */

// Builder
    // stapsgewijze opbouw van een object (bv. maaltijd samenstellen of een huis bouwen waar je de onderdelen steeds toevoegd)

public class Builder {

    public static void main(String[] args) {

        LocalDateTime nu = LocalDateTime.now();

        MyBuilder mb = MyBuilder.create();
        mb = mb.withNaam("Johan");
        System.out.println(mb);

    }

}

class MyBuilder{

    private String naam;
    private int value;

    // geen constructor

    public static MyBuilder create(){
        return new MyBuilder();
    }

    public MyBuilder withValue(int waarde){
        this.value = waarde;
        return this;
    }

    public MyBuilder withNaam(String naam){
        this.naam = naam;
        return this;
    }

}
