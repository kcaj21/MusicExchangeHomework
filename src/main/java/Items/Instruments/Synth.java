package Items.Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Synth extends Instrument implements IPlay, ISell {

    private String signal;

    public Synth(String make, String model, int buyingPrice, int sellingPrice, String signal){
        super(make, model, buyingPrice, sellingPrice);
        this.signal = signal;
    }

    public String playInstrument() {
        return "Incessant ticking noises";
    }

    public String getSignal() {
        return signal;
    }
}
