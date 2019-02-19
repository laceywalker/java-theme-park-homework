package Attraction;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttractionTest {

    Attraction attraction;

    @Before
    public void before(){
        attraction = new Attraction("Upside-down Machine");
    }

    @Test
    public void canGetAttractionName(){
        assertEquals("Upside-down Machine", attraction.getAttractionName());
    }
}
