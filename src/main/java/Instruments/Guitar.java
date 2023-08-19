package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numOfStrings;
    private String pickups;

    public Guitar(String make, String model, int numOfStrings, String pickups){
        super(make, model);
        this.numOfStrings = numOfStrings;
        this.pickups = pickups;
    }

    public String playInstrument() {
        return "Djent";
    }
    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String getPickups() {
        return pickups;
    }
}
