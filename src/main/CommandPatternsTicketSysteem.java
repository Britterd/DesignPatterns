package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Britt van Mourik
 */

public class CommandPatternsTicketSysteem {

    public static void main(String[] args) {

        Ticket ticket = new Ticket("Pietersen");

        TicketBeantwoorden tb = new TicketBeantwoorden(ticket);
        TicketWeggooien tw = new TicketWeggooien(ticket);
        TicketOpvolgen to = new TicketOpvolgen(ticket);

        TicketVerwerker ticketVerwerker = new TicketVerwerker();
        ticketVerwerker.voegOpdrachtToe(tb);
        ticketVerwerker.voegOpdrachtToe(tw);
        ticketVerwerker.voegOpdrachtToe(to);
        ticketVerwerker.voerVerwerkingenUit();

    }

}

interface TicketVerwerking{
    void verwerken();
}

class Ticket{

    String klantnaam;

    Ticket(String klantnaam){ //shadowing
        this.klantnaam = klantnaam;
    }

    void weggooien(){
        System.out.println("ticket weggooien " + klantnaam);
    }

    void beantwoorden(){
        System.out.println("ticket beantwoorden " + klantnaam);
    }

    void opvolgen(){
        System.out.println("ticket opvolgen " + klantnaam);
    }
}

class TicketWeggooien implements TicketVerwerking{
    private Ticket ticket;

    public TicketWeggooien(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void verwerken(){
        ticket.weggooien();
    }

}

class TicketBeantwoorden implements TicketVerwerking{
    private Ticket ticket;

    public TicketBeantwoorden(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void verwerken(){
        ticket.beantwoorden();
    }

}
class TicketOpvolgen implements TicketVerwerking{
    private Ticket ticket;

    public TicketOpvolgen(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void verwerken(){
        ticket.opvolgen();
    }

}

class TicketVerwerker{
    private List<TicketVerwerking> verwerkingsLijst = new ArrayList<>();

    public void voegOpdrachtToe(TicketVerwerking ticketVerwerking){
        verwerkingsLijst.add(ticketVerwerking);
    }

    public void voerVerwerkingenUit(){
        for (TicketVerwerking ticketVerwerking : verwerkingsLijst) {
            ticketVerwerking.verwerken();
        }

        verwerkingsLijst.clear();
    }
}


