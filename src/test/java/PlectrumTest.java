import Items.Accessories.Plectrum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlectrumTest {

    Plectrum plectrum;

    @Before
    public void before(){
        plectrum = new Plectrum("Jim Dunlop", 1, 2, 1.00);
    }

    @Test
    public void canGetBrand(){
        assertEquals("Jim Dunlop", plectrum.getBrand());
    }

    @Test
    public void canGetThickness(){
        assertEquals(1.00, plectrum.getThickness(),0);
    };
}
