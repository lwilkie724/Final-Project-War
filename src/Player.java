import java.util.List;

public class Player {


  //Step 1c
  // Fields
  private List<Card> hand;
  private int score;
  private String name;
  private int topCard;

  // Constructor
  public Player(String name, List<Card> hand) {
    this.name = name;
    this.hand = hand;
    getHand();
  }

  // Methods
  public void describe() {
    if (hand.isEmpty()) {
      System.out.println(name + " has no more cards");
    } else {
      System.out.println(name + "'s cards: ");
      for (Card card : hand) {
        card.describe();
      }
    }
  }

  public Card flip() {
    int topCard = 0;
    if (topCard < hand.size()) {
      return hand.get(topCard++);
    } else {
      return null;
    }
  }

  public Card removeTopCard() {
    return hand.remove(topCard);
  }

  public void draw(Deck deck) {
    hand.add(deck.draw());
  }

  public int incrementScore() {
    return score++;
  }

  // Getters and setters
  public List<Card> getHand() {
    return hand;
  }

  public void setHand(List<Card> hand) {
    this.hand = hand;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
