package Items;

public abstract class Item {

    private int buyingPrice;
    private int sellingPrice;

    public Item(int buyingPrice, int sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
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
