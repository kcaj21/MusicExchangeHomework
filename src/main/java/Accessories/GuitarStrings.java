package Accessories;

import Behaviours.ISell;

public class GuitarStrings extends Accessory implements ISell {

    private String gauge;
    private String material;

    public GuitarStrings(String brand, String gauge, String material) {
        super(brand);
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
