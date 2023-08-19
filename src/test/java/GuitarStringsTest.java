import Items.Accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("Ernie Ball", 5, 10,  "12-54", "nickle");
    }

    @Test
    public void canGetBrand(){
        assertEquals("Ernie Ball", guitarStrings.getBrand());
    }

    @Test
    public void canGetGauge(){
        assertEquals("12-54", guitarStrings.getGauge());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("nickle", guitarStrings.getMaterial());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(5, guitarStrings.calculateMarkUp());
    }
}
