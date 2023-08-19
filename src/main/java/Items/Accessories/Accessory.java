package Items.Accessories;

import Items.Item;

public abstract class Accessory extends Item {

    private String brand;

    public Accessory(String brand, int buyingPrice, int sellingPrice) {
        super(buyingPrice, sellingPrice);
        this.brand = brand;

    }
    public String getBrand() {
        return brand;
    }

}
