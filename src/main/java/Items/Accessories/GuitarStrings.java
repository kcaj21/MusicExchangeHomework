package Items.Accessories;

import Behaviours.ISell;

public class GuitarStrings extends Accessory implements ISell {

    private String gauge;
    private String material;

    public GuitarStrings(String brand, int buyingPrice, int sellingPrice, String gauge, String material) {
        super(brand, buyingPrice, sellingPrice);
        this.gauge = gauge;
        this.material = material;
    }

    public String getGauge() {
        return gauge;
    }

    public String getMaterial() {
        return material;
    }
}
