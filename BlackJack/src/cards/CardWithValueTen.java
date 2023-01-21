package cards;


public class CardWithValueTen extends Card {
    
    private final int value;

    public CardWithValueTen() {
        this.value=10;
    }

    @Override
    public int value() {
        return value;
    }

    @Override
    public String toString() {
        return "CardWithValueTen{" + "value=" + value + '}';
    }    
}
