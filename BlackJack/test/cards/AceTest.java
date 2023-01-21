package cards;

import org.junit.Test;
import static org.junit.Assert.*;

public class AceTest {
    
    public AceTest() {
    }

    @Test
    public void testValue() {
        Ace instance = new Ace();
        int expResult = 11;
        int result = instance.value();
        assertEquals(expResult, result);
    }


    @Test
    public void testSecondValue() {
        System.out.println("secondValue");
        Ace instance = new Ace();
        int expResult = 1;
        int result = instance.secondValue();
        assertEquals(expResult, result);
    }
    
}
