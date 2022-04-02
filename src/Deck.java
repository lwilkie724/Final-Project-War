import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

  //Step 1b
  // Fields
  private List<Card> cards;

  // Constructor
  public Deck() {
    cards = new ArrayList<Card>();
    for (int i = 1; i < 5; i++) {
      for (int x = 1; x < 15; x++) {
        cards.add(new Card(i, x));
      }
    }
  }

  // Methods
  public void shuffle() {
    Collections.shuffle(cards);
  }

  public Card draw() {
    int topCard = 0;
    if (topCard < cards.size()) {
      cards.get(topCard);
      return cards.remove(topCard++);
    } else {
      return null;
    }
  }
}
