package Stall;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IcecreamTest {

    IcecreamStall icecreamStall;

    @Before
    public void before(){
        icecreamStall = new IcecreamStall("Lacto Paradise", "Jim Jones", "east", 10);
    }

    @Test
    public void getName(){
        assertEquals("Lacto Paradise", icecreamStall.getStallName());
    }

    @Test
    public void getOwnerName(){
        assertEquals("Jim Jones", icecreamStall.getOwnerName());
    }

    @Test
    public void getLocation(){
        assertEquals("east", icecreamStall.getLocation());
    }

    @Test
    public void getPrice(){
        assertEquals(10, icecreamStall.getPrice());
    }

}
