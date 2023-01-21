package player;

import player.Player;
import cards.PipCard;
import cards.CardWithValueTen;
import cards.Card;
import cards.Ace;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


public class PlayerTest {
    
    public PlayerTest() {
    }


    @Test
    public void isWinner_player_blackJack(){
        List<Card> betPlayer = new ArrayList<>();
        betPlayer.add(new Ace());
        betPlayer.add(new CardWithValueTen());
        
        List<Card> betCrupier = new ArrayList<>();
        betCrupier.add(new CardWithValueTen());
        betCrupier.add(new CardWithValueTen());
        betCrupier.add(new Ace());
        
        Player player = new Player(betPlayer);
        Player crupier = new Player(betCrupier);
        
        assert(player.isWinner(crupier));
    }
    
    @Test
    public void isWinner_crupier_sumBet23(){
        List<Card> betPlayer = new ArrayList<>();
        betPlayer.add(new PipCard(5));
        betPlayer.add(new CardWithValueTen());
        betPlayer.add(new PipCard(3));
        
        List<Card> betCrupier = new ArrayList<>();
        betCrupier.add(new Ace());
        betCrupier.add(new PipCard(6));
        betCrupier.add(new PipCard(6));
        
        Player player = new Player(betPlayer);
        Player crupier = new Player(betCrupier);
        
        assert(player.isWinner(crupier));
    }
    
    @Test
    public void isWinner_crupier_blackJack(){
        List<Card> betPlayer = new ArrayList<>();
        betPlayer.add(new PipCard(5));
        betPlayer.add(new CardWithValueTen());
        betPlayer.add(new PipCard(3));
        
        List<Card> betCrupier = new ArrayList<>();
        betCrupier.add(new Ace());
        betCrupier.add(new CardWithValueTen());
        
        Player player = new Player(betPlayer);
        Player crupier = new Player(betCrupier);
        
        assert(!player.isWinner(crupier));
    }
    
    
    @Test
    public void isWinner_player_sumBet25(){
        List<Card> betPlayer = new ArrayList<>();
        betPlayer.add(new PipCard(5));
        betPlayer.add(new CardWithValueTen());
        betPlayer.add(new CardWithValueTen());
        
        List<Card> betCrupier = new ArrayList<>();
        betCrupier.add(new PipCard(2));
        betCrupier.add(new PipCard(6));
        betCrupier.add(new PipCard(8));
        betCrupier.add(new PipCard(3));

        
        Player player = new Player(betPlayer);
        Player crupier = new Player(betCrupier);
        
        assert(!player.isWinner(crupier));
    }
    
    @Test
    public void getBetTest(){
        List<Card> betPlayer = new ArrayList<>();
        betPlayer.add(new PipCard(5));
        betPlayer.add(new CardWithValueTen());
        betPlayer.add(new CardWithValueTen());
        
        Player player = new Player(betPlayer);
      
        PipCard card1 = new PipCard(5);
        CardWithValueTen card2 = new CardWithValueTen();
        CardWithValueTen card3 = new CardWithValueTen();
        List<Card> list = new ArrayList<>();
        list.add(card1);
        list.add(card2);
        list.add(card3);  
        
        String res = "[PipCard{value=5}, CardWithValueTen{value=10}, CardWithValueTen{value=10}]";
        Assert.assertEquals(player.getBet().toString(), list.toString());
 
    }
    
    @Test
    public void setBetTest(){
        List<Card> betPlayer = new ArrayList<>();
        Player player = new Player(betPlayer);
        
        PipCard card1 = new PipCard(5);
        CardWithValueTen card2 = new CardWithValueTen();
        CardWithValueTen card3 = new CardWithValueTen();
        List<Card> list = new ArrayList<>();
        list.add(card1);
        list.add(card2);
        list.add(card3); 
        
        Assert.assertNotSame(player.getBet(), list);
        
        
        betPlayer.add(new PipCard(5));
        betPlayer.add(new CardWithValueTen());
        betPlayer.add(new CardWithValueTen());
        player.setBet(betPlayer);
        
        Assert.assertEquals(player.getBet().toString(), list.toString());
 
    }
    
}
