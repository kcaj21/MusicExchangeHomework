package Items.Accessories;

public abstract class Accessory {

    private String brand;

    private int buyingPrice;
    private int sellingPrice;

    public Accessory(String brand, int buyingPrice, int sellingPrice) {
        this.brand = brand;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }
    public String getBrand() {
        return brand;
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
