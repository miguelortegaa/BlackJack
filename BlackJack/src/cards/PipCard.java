package cards;

public class PipCard extends Card {
    
    private final int value;

    public PipCard(int i) {
        this.value=i;
        
    }

    @Override
    public int value() {
        return value;
    }

    @Override
    public String toString() {
        return "PipCard{" + "value=" + value + '}';
    }
    
}
