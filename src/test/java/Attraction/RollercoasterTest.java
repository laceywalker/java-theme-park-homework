package Attraction;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Death Trap", 50);
    }

    @Test
    public void canGetName(){
        assertEquals("Death Trap", rollercoaster.getAttractionName());
    }

    @Test
    public void canGetHeightRestriction(){
        assertEquals(50, rollercoaster.getHeightRestriction(), 0.01);
    }
}
