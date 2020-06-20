
public class Card implements Comparable<Card> {

  private int value;
  private Suit suit;

  public Card(int value, Suit suit) {
    if (value < 2 || value > 14) {
      throw new IllegalArgumentException("Card value must be in range 2...14.");
    }

    if (suit == null) {
      throw new IllegalArgumentException("Card suit can't be null.");
    }

    this.value = value;
    this.suit = suit;
  }

  @Override
  public String toString() {
    String cardValue = "" + value;
    if (value == 11) {
      cardValue = "J";
    } else if (value == 12) {
      cardValue = "Q";
    } else if (value == 13) {
      cardValue = "K";
    } else if (value == 14) {
      cardValue = "A";
    }

    return suit + " " + cardValue;
  }

  public int getValue() {
    return value;
  }

  public Suit getSuit() {
    return suit;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }

    if (other == null || this.getClass() != other.getClass()) {
      return false;
    }

    final Card otherCard = (Card) other;
    return Integer.compare(this.getValue(), otherCard.getValue()) == 0
            && this.getSuit().compareTo(otherCard.getSuit()) == 0;
  }

  @Override
  public int compareTo(Card other) {
    // Ascending order based on their value
    // If values are same compare base on their suit
    final int compareValue = Integer.compare(this.getValue(), other.getValue());
    return compareValue == 0 ? this.getSuit().compareTo(other.getSuit()) : compareValue;
  }

}
