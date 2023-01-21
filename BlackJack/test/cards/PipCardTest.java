package cards;

import cards.PipCard;
import org.junit.Test;
import static org.junit.Assert.*;


public class PipCardTest {
    
    public PipCardTest() {
    }


    @Test
    public void testValue1() {
        PipCard instance = new PipCard(1);
        int expResult = 1;
        int result = instance.value();
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testValue2() {
        PipCard instance = new PipCard(2);
        int expResult = 2;
        int result = instance.value();
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testValue3() {
        PipCard instance = new PipCard(3);
        int expResult = 3;
        int result = instance.value();
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testValue4() {
        PipCard instance = new PipCard(4);
        int expResult = 4;
        int result = instance.value();
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testValue5() {
        PipCard instance = new PipCard(5);
        int expResult = 5;
        int result = instance.value();
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testValue6() {
        PipCard instance = new PipCard(6);
        int expResult = 6;
        int result = instance.value();
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testValue7() {
        PipCard instance = new PipCard(7);
        int expResult = 7;
        int result = instance.value();
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testValue8() {
        PipCard instance = new PipCard(8);
        int expResult = 8;
        int result = instance.value();
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testValue9() {
        PipCard instance = new PipCard(9);
        int expResult = 9;
        int result = instance.value();
        assertEquals(expResult, result);
      
    }
    
    @Test
    public void testValue10() {
        PipCard instance = new PipCard(10);
        int expResult = 10;
        int result = instance.value();
        assertEquals(expResult, result);
      
    }
    
}
