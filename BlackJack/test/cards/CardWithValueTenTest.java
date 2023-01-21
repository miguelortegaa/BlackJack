package cards;

import cards.CardWithValueTen;
import org.junit.Test;
import static org.junit.Assert.*;


public class CardWithValueTenTest {
    
    public CardWithValueTenTest() {
    }
    
    @Test
    public void testValue() {
        CardWithValueTen instance = new CardWithValueTen();
        int expResult = 10;
        int result = instance.value();
        assertEquals(expResult, result);   
    }
}
