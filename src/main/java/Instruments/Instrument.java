package Instruments;

public abstract class Instrument {
    private String make;
    private String model;

    public Instrument(String make, String model) {
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
