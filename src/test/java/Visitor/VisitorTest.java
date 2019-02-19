package Visitor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(18, 67, 200);
    }

    @Test
    public void canGetAge(){
        assertEquals(18, visitor.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(67, visitor.getHeight(), 0.01);
    }

    @Test
    public void canGetMoney(){
        assertEquals(200, visitor.getMoney(), 0.01);
    }
}
