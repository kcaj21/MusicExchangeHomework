package Shop;

import Behaviours.ISell;
import Items.Item;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void add(ISell item){stock.add(item);
    }

    public void remove(ISell item){stock.remove(item);
    }

    public void removeAll(){stock.clear();
    }

    public int stockCount() {
        return stock.size();
    }

    public int getPotentialProfit(){
        int potentialProfit = 0;
        for (ISell item: stock){
            potentialProfit = potentialProfit + item.calculateMarkUp();
        }
        return potentialProfit;
    }
}
