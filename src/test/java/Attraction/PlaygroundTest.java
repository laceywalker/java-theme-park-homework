package Attraction;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("Friends of Richard Nixon Playground", 15);
    }

    @Test
    public void getPlaygroundName(){
        assertEquals("Friends of Richard Nixon Playground", playground.getAttractionName());
    }

    @Test
    public void getMaximumAge(){
        assertEquals(15, playground.getMaximumAge());
    }
}
