package cards;


public class Ace extends Card{
    
    public Ace(){
    }
    
    @Override
    public int value(){
        return 11;
    }
    
    public int secondValue(){
        return 1;
    }
    
}
