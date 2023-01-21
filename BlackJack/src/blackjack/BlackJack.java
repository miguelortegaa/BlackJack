package blackjack;

import player.Player;
import cards.Card;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static player.Player.calculateSumBet;
import static player.Player.isBlackJack;


public class BlackJack {
    
    private List<Card> deck;
    
    public BlackJack(){
    }
    
    public void setDeck(List<Card> deck){
        this.deck=deck;
    }
        
    public List<Player> getWinners(Player player1, Player player2, Player player3, Player crupier, List<Card> deck){
        setDeck(deck);
        List<Player> list = new ArrayList<>();
        List<Player> players = new ArrayList<>(Arrays.asList(player1, player2, player3));
       
        if (calculateSumBet(crupier.getBet()) < 17){
            completeBetCrupier(crupier);
        }   
                
        if (!isBlackJack(crupier.getBet())){
            for(Player player : players){
                if (player.isWinner(crupier)){
                    list.add(player);
                }
            }
            if(list.isEmpty()){
                list.add(crupier);
            }
            return list;
        }else{
            list.add(crupier);
            return list;
        }
    }
    
    private void completeBetCrupier(Player crupier){
        while ((calculateSumBet(crupier.getBet())) < 17){
            List<Card> apuesta = crupier.getBet();          
            apuesta.add(deck.remove(0));
            crupier.setBet(apuesta);   
        }
    }
}
