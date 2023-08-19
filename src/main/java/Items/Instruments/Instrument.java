package Items.Instruments;

import Items.Item;

public abstract class Instrument extends Item {
    private String make;
    private String model;

    public Instrument(String make, String model, int buyingPrice, int sellingPrice) {
        super(buyingPrice, sellingPrice);
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }



}
