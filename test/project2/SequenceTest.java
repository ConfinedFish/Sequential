package project2;

import org.junit.Test;
import static org.junit.Assert.*;

public class SequenceTest {
    
    public SequenceTest() {}
    /**
     * Test of size method, of class Sequence.
     */
    @Test
    public void testSize() {
        System.out.println("size - Input");
        int expResult = 12;
        Sequence instance = new Sequence(expResult);
        assertEquals(expResult, instance.size());
    }
    @Test
    public void testSizeDefault() {
        System.out.println("size - Default");
        Sequence instance = new Sequence();
        int expResult = 10;
        assertEquals(expResult, instance.size());
    }
    /**
     * Test of append method, of class Sequence.
     */
    @Test
    public void testAppendDouble() {
        System.out.println("append - Double");
        Object expResult = 1.0;
        Sequence<Double> instance = new Sequence();
        instance.append((double)expResult);
        assertEquals(expResult, instance.get(0));
    }
    @Test
    public void testAppendInteger() {
        System.out.println("append - Integer");
        Object expResult = 1;
        Sequence<Integer> instance = new Sequence();
        instance.append((Integer)expResult);
        assertEquals(expResult, instance.get(0));
    }
    /**
     * Test of set method, of class Sequence.
     */
    @Test
    public void testSetDouble() {
        System.out.println("set - Double");
        int index = 0;
        Object expResult = 2.1;
        Sequence<Double> instance = new Sequence();
        instance.set(index, (Double)expResult);
        assertEquals(expResult, instance.get(index));
    }
        @Test
    public void testSetInteger() {
        System.out.println("set - Integer");
        int index = 0;
        Object expResult = 2;
        Sequence<Integer> instance = new Sequence();
        instance.set(index, (Integer)expResult);
        assertEquals(expResult, instance.get(index));
    }
    /**
     * Test of get method, of class Sequence.
     */
    @Test
    public void testGetDouble() {
        System.out.println("get - Double");
        int index = 0;
        Sequence<Double> instance = new Sequence();
        Object expResult = 2.1;
        instance.set(index, (Double)expResult);
        Object result = instance.get(index);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetInteger() {
        System.out.println("get");
        int index = 0;
        Sequence<Integer> instance = new Sequence();
        Object expResult = 2;
        instance.set(index, (Integer)expResult);
        Object result = instance.get(index);
        assertEquals(expResult, result);
    }
    /**
     * Test of getLastPosition method, of class Sequence.
     */
    @Test
    public void testGetLastPosition() {
        System.out.println("getLastPosition");
        Sequence<Double> instance = new Sequence();
        instance.set(0, 1.0);
        instance.set(1, 2.0);
        int expResult = 1;
        int result = instance.getLastPosition();
        assertEquals(expResult, result);
    }
}
