import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Fender", "Telecaster", 6, "Split-coil");
    }

    @Test
    public void canGetMake(){
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Telecaster", guitar.getModel());
    }

    @Test
    public void canGetNumOfStrings(){
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void doesItDjent(){
        assertEquals("Djent", guitar.playInstrument());
    }
}
