package Accessories;

import Behaviours.ISell;

public class Plectrum extends Accessory implements ISell {

    private double thickness;

    public Plectrum(String brand, Double thickness) {
        super(brand);
        this.thickness = thickness;
    }

    public double getThickness() {
        return thickness;
    }
}
