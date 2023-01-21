package player;

import cards.Ace;
import cards.Card;
import java.util.List;


public class Player {
    
    private List<Card> bet;
    
    public Player(List<Card> bet){
        this.bet=bet;
    }

    public void setBet(List<Card> bet) {
        this.bet = bet;
    }
    
    public List<Card> getBet() {
        return bet;
    }
    
    public static boolean isBlackJack(List<Card> bet){
        return calculateSumBet(bet) == 21 && bet.size() == 2;
    }
    
    public static int calculateSumBet(List<Card> bet) {
        int sum = 0;
        int numberAce = 0;
        
        for (Card card : bet){
            sum += card.value();
            if (card instanceof Ace){
                numberAce++;
            }
        }
        while ((sum > 21) && (numberAce > 0)){
            sum -= 10;
            numberAce--;
        }  
        return sum;
    }

    public boolean isWinner(Player crupier) {      
        int sumBetCrupier = calculateSumBet(crupier.getBet());
        int sumBetPlayer = calculateSumBet(getBet());
        
        if ((isBlackJack(crupier.getBet())) || (sumBetPlayer > 21)){
            return false;
        }
        
        if ((isBlackJack(this.getBet())) || (sumBetCrupier > 21)){
            return true;
        }
      
        return (21-sumBetCrupier) > (21-sumBetPlayer);
    }
}
