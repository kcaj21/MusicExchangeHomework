package Items.Instruments;

public abstract class Instrument {
    private String make;
    private String model;
    private int buyingPrice;
    private int sellingPrice;

    public Instrument(String make, String model, int buyingPrice, int sellingPrice) {
        this.make = make;
        this.model = model;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public int calculateMarkUp() {
        return getSellingPrice() - getBuyingPrice();
    }

}
