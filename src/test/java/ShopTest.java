import Items.Accessories.GuitarStrings;
import Items.Accessories.Plectrum;
import Items.Instruments.Guitar;
import Items.Instruments.Synth;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Plectrum plectrum;
    Synth synth;
    GuitarStrings guitarStrings;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
        guitar = new Guitar("Fender", "Stratocaster", 300, 500, 6, "Single-coil");
        synth = new Synth("Access", "Virus TI", 800, 1500, "Digital");
        plectrum = new Plectrum("Anvil", 10, 30, 10.00);
        guitarStrings = new GuitarStrings("Daddario", 3, 8, "10-49", "Nickle");
    }

    @Test
    public void canGetName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void stockListStartsEmpty(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddGuitar(){
        shop.add(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveGuitar(){
        shop.add(guitar);
        shop.remove(guitar);
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddSynth(){
        shop.add(synth);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveSynth(){
        shop.add(synth);
        shop.remove(synth);
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddPlectrum(){
        shop.add(plectrum);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemovePlectrum(){
        shop.add(plectrum);
        shop.remove(plectrum);
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddGuitarStrings(){
        shop.add(guitarStrings);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveGuitarStrings(){
        shop.add(guitarStrings);
        shop.remove(guitarStrings);
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canRemoveAllStock(){
        shop.add(guitarStrings);
        shop.add(plectrum);
        shop.add(synth);
        shop.add(guitar);
        shop.removeAll();
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canGetPotentialProfit(){
        shop.add(guitarStrings);
        shop.add(plectrum);
        assertEquals(25, shop.getPotentialProfit());
    }

}
