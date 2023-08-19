package Items.Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numOfStrings;
    private String pickups;

    public Guitar(String make, String model, int buyingPrice, int sellingPrice, int numOfStrings, String pickups){
        super(make, model, buyingPrice, sellingPrice);
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
