package Stall;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Wisps of Heaven", "Nina Flowers", "west", 16);
    }

    @Test
    public void canGetName(){
        assertEquals("Wisps of Heaven", candyFlossStall.getStallName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Nina Flowers", candyFlossStall.getOwnerName());
    }

    @Test
    public void canGetLocation(){
    assertEquals("west", candyFlossStall.getLocation());
    }

    @Test
    public void canGetAgeRestriction(){
        assertEquals(16, candyFlossStall.getAgeRestriction());
    }
}
