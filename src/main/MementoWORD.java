package main;


import java.util.ArrayList;

import java.util.List;


/**
 * @author Kimberley Hommes
 */

public class MementoWORD {

    public static void main(String[] args) {

        TekstVerwerker word = new TekstVerwerker();
        SaveMeFromMyself saveMeFromMyself = new SaveMeFromMyself();

        word.setStatusDocument("Dit is een document.");
        saveMeFromMyself.voegToe(word.slaStatusOpInMemento());

        word.setStatusDocument("Dit is een document. Echt waar");
        saveMeFromMyself.voegToe(word.slaStatusOpInMemento());

        System.out.println("Current: " + word.getStatusDocument());

        word.getStatusFromMemento(saveMeFromMyself.doCTRLZ(1));
        System.out.println(word.getStatusDocument());
    }

}


class Memento {

    private String statusDocument;

    public Memento(String statusDocument) {
        this.statusDocument = statusDocument;
    }

    public String getStatusDocument() {
        return statusDocument;
    }
}


class TekstVerwerker {

    private String statusDocument;

    public String getStatusDocument() {
        return statusDocument;
    }


    public void setStatusDocument(String statusDocument) {
        this.statusDocument = statusDocument;
    }


    public Memento slaStatusOpInMemento() {
        return new Memento(statusDocument);
    }

    public void getStatusFromMemento(Memento memento) {
        statusDocument = memento.getStatusDocument();
    }
}

class SaveMeFromMyself {

    private List<Memento> mementoList = new ArrayList<>();

    public void voegToe(Memento status) {
        mementoList.add(status);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

    public Memento doCTRLZ(int indexCurrentState) {

        if (indexCurrentState > 0) {
            return mementoList.get(indexCurrentState - 1);
        } else {
            return null;
        }
    }


    public Memento doCTRLSHIFTZ(int indexCurrentState) {

        if (indexCurrentState < mementoList.size() - 1) {
            return mementoList.get(indexCurrentState + 1);
        } else {
            return null;
        }
    }

}