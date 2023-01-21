package blackjack;

import player.Player;
import cards.PipCard;
import cards.CardWithValueTen;
import cards.Card;
import cards.Ace;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;


public class BlackJackTest {
    
    public BlackJackTest() {
    }
    
    @Test
    public void return_player_case1(){
        
        List<Card> betPlayer1 = new ArrayList<>();
        betPlayer1.add(new CardWithValueTen());
        betPlayer1.add(new Ace());
        
        List<Card> betPlayer2 = new ArrayList<>();
        betPlayer2.add(new CardWithValueTen());
        betPlayer2.add(new PipCard(5));
        betPlayer2.add(new PipCard(6));
        
        List<Card> betPlayer3 = new ArrayList<>();
        betPlayer3.add(new PipCard(3));
        betPlayer3.add(new PipCard(6));
        betPlayer3.add(new Ace());
        betPlayer3.add(new PipCard(3));
        betPlayer3.add(new Ace());
        betPlayer3.add(new CardWithValueTen());
        
        List<Card> betcroupier = new ArrayList<>();
        betcroupier.add(new PipCard(9));
        betcroupier.add(new PipCard(7));
        
        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(5));
        deck.add(new PipCard(4));
        deck.add(new CardWithValueTen());
        deck.add(new PipCard(2));
        
        Player player1 = new Player(betPlayer1);
        Player player2 = new Player(betPlayer2);
        Player player3 = new Player(betPlayer3);
        Player croupier = new Player(betcroupier);
        
        BlackJack blackjack = new BlackJack();
        
        List<Player> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(player1);
        
        List<Player> resultado = blackjack.getWinners(player1, player2, player3, croupier, deck);
        
      
        assert((resultadoEsperado.get(0).equals(resultado.get(0))) && (resultadoEsperado.size() == resultado.size()));
       
    } 

    
    @Test
    public void return_player_case2(){
        
        List<Card> betPlayer1 = new ArrayList<>();
        betPlayer1.add(new CardWithValueTen());
        betPlayer1.add(new CardWithValueTen());
        
        List<Card> betPlayer2 = new ArrayList<>();
        betPlayer2.add(new CardWithValueTen());
        betPlayer2.add(new PipCard(2));
        betPlayer2.add(new PipCard(6));
        
        List<Card> betPlayer3 = new ArrayList<>();
        betPlayer3.add(new PipCard(8));
        betPlayer3.add(new PipCard(8));
        betPlayer3.add(new PipCard(5));
        
        
        List<Card> betcroupier = new ArrayList<>();
        betcroupier.add(new PipCard(5));
        betcroupier.add(new CardWithValueTen());
        
        List<Card> deck = new ArrayList<>();
        deck.add(new Ace());
        deck.add(new PipCard(3));
        deck.add(new CardWithValueTen());
        deck.add(new PipCard(2));
        
        Player player1 = new Player(betPlayer1);
        Player player2 = new Player(betPlayer2);
        Player player3 = new Player(betPlayer3);
        Player croupier = new Player(betcroupier);
        
        BlackJack blackjack = new BlackJack();
        
        List<Player> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(player1);
        resultadoEsperado.add(player3);
                
        List<Player> resultado = blackjack.getWinners(player1, player2, player3, croupier, deck);
        
        assert((resultadoEsperado.get(0).equals(resultado.get(0))) && (resultadoEsperado.get(1).equals(resultado.get(1))) && (resultadoEsperado.size() == resultado.size()));
       
    }
    
    @Test
    public void return_player_case3(){
        
        List<Card> betPlayer1 = new ArrayList<>();
        betPlayer1.add(new CardWithValueTen());
        betPlayer1.add(new CardWithValueTen());
        
        List<Card> betPlayer2 = new ArrayList<>();
        betPlayer2.add(new CardWithValueTen());
        betPlayer2.add(new PipCard(2));
        betPlayer2.add(new PipCard(6));
        
        List<Card> betPlayer3 = new ArrayList<>();
        betPlayer3.add(new PipCard(9));
        betPlayer3.add(new PipCard(7));
        betPlayer3.add(new PipCard(9));
        
        
        List<Card> betcroupier = new ArrayList<>();
        betcroupier.add(new PipCard(9));
        betcroupier.add(new CardWithValueTen());
        betcroupier.add(new PipCard(4));
        
        List<Card> deck = new ArrayList<>();
        deck.add(new Ace());
        deck.add(new PipCard(3));
        deck.add(new CardWithValueTen());
        deck.add(new PipCard(2));
        
        Player player1 = new Player(betPlayer1);
        Player player2 = new Player(betPlayer2);
        Player player3 = new Player(betPlayer3);
        Player croupier = new Player(betcroupier);
        
        BlackJack blackjack = new BlackJack();
        
        List<Player> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(player1);
        resultadoEsperado.add(player2);
                
        List<Player> resultado = blackjack.getWinners(player1, player2, player3, croupier, deck);
        
        assert((resultadoEsperado.get(0).equals(resultado.get(0))) && (resultadoEsperado.get(1).equals(resultado.get(1))) && (resultadoEsperado.size() == resultado.size()));
       
    }   
    
    
    @Test
    public void return_player_case4(){
        
        List<Card> betPlayer1 = new ArrayList<>();
        betPlayer1.add(new Ace());
        betPlayer1.add(new CardWithValueTen());
        
        List<Card> betPlayer2 = new ArrayList<>();
        betPlayer2.add(new Ace());
        betPlayer2.add(new CardWithValueTen());
        
        List<Card> betPlayer3 = new ArrayList<>();
        betPlayer3.add(new PipCard(8));
        betPlayer3.add(new PipCard(8));
        betPlayer3.add(new PipCard(5));
        
        
        List<Card> betcroupier = new ArrayList<>();
        betcroupier.add(new PipCard(5));
        betcroupier.add(new PipCard(10));
        
        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(4));
        deck.add(new PipCard(3));
        deck.add(new CardWithValueTen());
        deck.add(new PipCard(2));
        
        Player player1 = new Player(betPlayer1);
        Player player2 = new Player(betPlayer2);
        Player player3 = new Player(betPlayer3);
        Player croupier = new Player(betcroupier);
        
        BlackJack blackjack = new BlackJack();
        
        List<Player> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(player1);
        resultadoEsperado.add(player2);
        resultadoEsperado.add(player3);
                
        List<Player> resultado = blackjack.getWinners(player1, player2, player3, croupier, deck);
        
        assert((resultadoEsperado.get(0).equals(resultado.get(0))) && (resultadoEsperado.get(1).equals(resultado.get(1))) && (resultadoEsperado.get(2).equals(resultado.get(2))) && (resultadoEsperado.size() == resultado.size()));
    }
  
    
    @Test
    public void return_player_case5(){
        
        List<Card> betPlayer1 = new ArrayList<>();
        betPlayer1.add(new Ace());
        betPlayer1.add(new CardWithValueTen());
        
        List<Card> betPlayer2 = new ArrayList<>();
        betPlayer2.add(new Ace());
        betPlayer2.add(new CardWithValueTen());
        
        List<Card> betPlayer3 = new ArrayList<>();
        betPlayer3.add(new PipCard(8));
        betPlayer3.add(new PipCard(8));
        betPlayer3.add(new PipCard(5));
        
        
        List<Card> betcroupier = new ArrayList<>();
        betcroupier.add(new Ace());
        betcroupier.add(new CardWithValueTen());
        
        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(4));
        deck.add(new PipCard(3));
        deck.add(new CardWithValueTen());
        deck.add(new PipCard(2));
        
        Player player1 = new Player(betPlayer1);
        Player player2 = new Player(betPlayer2);
        Player player3 = new Player(betPlayer3);
        Player croupier = new Player(betcroupier);
        
        BlackJack blackjack = new BlackJack();
        
        List<Player> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(croupier);
                
        List<Player> resultado = blackjack.getWinners(player1, player2, player3, croupier, deck);
        
        assert((resultadoEsperado.get(0).equals(resultado.get(0))) && (resultadoEsperado.size() == resultado.size()));
       
    }
    
    
    @Test
    public void return_player_case6(){
        
        List<Card> betPlayer1 = new ArrayList<>();
        betPlayer1.add(new PipCard(2));
        betPlayer1.add(new PipCard(2));
        
        List<Card> betPlayer2 = new ArrayList<>();
        betPlayer2.add(new PipCard(2));
        betPlayer2.add(new PipCard(3));
        
        List<Card> betPlayer3 = new ArrayList<>();
        betPlayer3.add(new PipCard(2));
        betPlayer3.add(new PipCard(2));        
        
        List<Card> betcroupier = new ArrayList<>();
        betcroupier.add(new PipCard(2));
        betcroupier.add(new PipCard(2));
        
        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(4));
        deck.add(new PipCard(5));
        deck.add(new Ace());
        deck.add(new PipCard(2));
        deck.add(new PipCard(4));
        
        Player player1 = new Player(betPlayer1);
        Player player2 = new Player(betPlayer2);
        Player player3 = new Player(betPlayer3);
        Player croupier = new Player(betcroupier);
        
        BlackJack blackjack = new BlackJack();
        
        List<Player> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(croupier);
                
        List<Player> resultado = blackjack.getWinners(player1, player2, player3, croupier, deck);
        
        assert((resultadoEsperado.get(0).equals(resultado.get(0))) && (resultadoEsperado.size() == resultado.size()));
       
    } 
    
    @Test
    public void return_player_case7(){
        
        List<Card> betPlayer1 = new ArrayList<>();
        betPlayer1.add(new Ace());
        betPlayer1.add(new CardWithValueTen());
        
        List<Card> betPlayer2 = new ArrayList<>();
        betPlayer2.add(new Ace());
        betPlayer2.add(new CardWithValueTen());
        
        List<Card> betPlayer3 = new ArrayList<>();
        betPlayer3.add(new Ace());
        betPlayer3.add(new CardWithValueTen());
        
        
        List<Card> betcroupier = new ArrayList<>();
        betcroupier.add(new PipCard(5));
        betcroupier.add(new CardWithValueTen());
        
        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(4));
        deck.add(new PipCard(3));
        deck.add(new CardWithValueTen());
        deck.add(new PipCard(2));
        
        Player player1 = new Player(betPlayer1);
        Player player2 = new Player(betPlayer2);
        Player player3 = new Player(betPlayer3);
        Player croupier = new Player(betcroupier);
        
        BlackJack blackjack = new BlackJack();
        
        List<Player> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(player1);
        resultadoEsperado.add(player2);
        resultadoEsperado.add(player3);
        
        List<Player> resultado = blackjack.getWinners(player1, player2, player3, croupier, deck);
        
        assert((resultadoEsperado.get(0).equals(resultado.get(0))) && (resultadoEsperado.size() == resultado.size()));
       
    }
    
    
     @Test
    public void return_player_case8(){
        
        List<Card> betPlayer1 = new ArrayList<>();
        betPlayer1.add(new Ace());
        betPlayer1.add(new CardWithValueTen());
        
        List<Card> betPlayer2 = new ArrayList<>();
        betPlayer2.add(new Ace());
        betPlayer2.add(new CardWithValueTen());
        
        List<Card> betPlayer3 = new ArrayList<>();
        betPlayer3.add(new Ace());
        betPlayer3.add(new CardWithValueTen());
        
        
        List<Card> betcroupier = new ArrayList<>();
        betcroupier.add(new Ace());
        betcroupier.add(new CardWithValueTen());
        
        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(4));
        deck.add(new PipCard(3));
        deck.add(new CardWithValueTen());
        deck.add(new PipCard(2));
        
        Player player1 = new Player(betPlayer1);
        Player player2 = new Player(betPlayer2);
        Player player3 = new Player(betPlayer3);
        Player croupier = new Player(betcroupier);
        
        BlackJack blackjack = new BlackJack();
        
        List<Player> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(croupier);
        
        List<Player> resultado = blackjack.getWinners(player1, player2, player3, croupier, deck);
               
        assert((resultadoEsperado.get(0).equals(resultado.get(0))) && (resultadoEsperado.size() == resultado.size()));
    }
}
