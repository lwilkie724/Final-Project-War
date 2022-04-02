
public class Card {

  //Step 1a
  // Fields
  private int value;
  private String name;
  private int suit;


  // Constructor
  public Card(int suit, int value) {
    this.suit = suit;
    this.value = value;
  }

  // Getters and setters
  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Describe method
  public void describe() {
    System.out.println(toString());
  }

  // Combining the suit and the card value to get the full name of the card
  public String toString() {
    StringBuilder cardDescription = new StringBuilder();

    if (value == 11) {
      cardDescription.append("Jack");
    } else if (value == 12) {
      cardDescription.append("Queen");
    } else if (value == 13) {
      cardDescription.append("King");
    } else if (value == 14) {
      cardDescription.append("Ace");
    } else {
      cardDescription.append(value);
    }

    cardDescription.append(" of ");

    if (suit == 1) {
      cardDescription.append("Spades");
    } else if (suit == 2) {
      cardDescription.append("Diamonds");
    } else if (suit == 3) {
      cardDescription.append("Hearts");
    } else if (suit == 4) {
      cardDescription.append("Clubs");
    } else {
      return null;
    }

    name = cardDescription.toString();
    return name;

  }


}
