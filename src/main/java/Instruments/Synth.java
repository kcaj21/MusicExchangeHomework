package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Synth extends Instrument implements IPlay, ISell {

    private String signal;

    public Synth(String make, String model, String signal){
        super(make, model);
        this.signal = signal;
    }

    public String playInstrument() {
        return "Incessant ticking noises";
    }

    public String getSignal() {
        return signal;
    }
}
