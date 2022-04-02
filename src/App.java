import java.util.ArrayList;
import java.util.List;

//Step 2
public class App {

  public static void main(String[] args) {

//Step 3
    Deck newDeck = new Deck();
    List<Card> hand1 = new ArrayList<Card>();
    List<Card> hand2 = new ArrayList<Card>();

    Player player1 = new Player("Player One", hand1);
    Player player2 = new Player("Player Two", hand2);

    newDeck.shuffle();
//Step 4
    for (int i = 0; i < 52; i++) {
      if (i % 2 == 0) {
        player1.draw(newDeck);
      } else {
        player2.draw(newDeck);
      }
    }

    
    player1.describe();
    System.out.println("\n");
    player2.describe();


//Step 5
    for (int i = 0; i < 26; i++) {
      player1.flip();
      player2.flip();
      System.out.println("------------------------------------");
      System.out.println("Player One flipped " + player1.flip());
      System.out.println("Player Two flipped " + player2.flip());
      System.out.println("------------------------------------");
      
//Step 5a
      if (player1.flip().getValue() > player2.flip().getValue()) {
        player1.incrementScore();
      } else if (player2.flip().getValue() > player1.flip().getValue()) {
        player2.incrementScore();
      } else {
        System.out.println("The cards are tied. It's a draw");
        System.out.println("------------------------------------");
      }
      
//Step 6
      System.out.println(player1.getName() + " has " + player1.getScore() + " points");
      System.out.println(player2.getName() + " has " + player2.getScore() + " points");

      player1.removeTopCard();
      player2.removeTopCard();

    }
    
//Step 7
    if (player1.getScore() > player2.getScore()) {
      System.out.println("\nPlayer One wins with " + player1.getScore() + " points!");
    } else if (player1.getScore() < player2.getScore()) {
      System.out.println("\nPlayer Two wins with " + player2.getScore() + " points!");
    } else {
      System.out.println("\nThe players have tied. It's a Draw");
    }

  }

}
