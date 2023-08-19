package Items.Accessories;

import Behaviours.ISell;

public class Plectrum extends Accessory implements ISell {

    private double thickness;

    public Plectrum(String brand, int buyingPrice, int sellingPrice, Double thickness) {
        super(brand, buyingPrice, sellingPrice);
        this.thickness = thickness;
    }

    public double getThickness() {
        return thickness;
    }

}
