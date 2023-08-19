import Instruments.Synth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SynthTest {

    Synth synth;

    @Before
    public void before(){
        synth = new Synth("Roland", "Juno-6", "Analog");
    }

    @Test
    public void canGetMake(){
        assertEquals("Roland", synth.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Juno-6", synth.getModel());
    }

    @Test
    public void canGetSignal(){
        assertEquals("Analog", synth.getSignal());
    }

    @Test
    public void canPlaySynth(){
        assertEquals("Incessant ticking noises", synth.playInstrument());
    }
}
