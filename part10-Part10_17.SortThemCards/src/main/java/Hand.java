
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thisPc Jun 20, 2020 6:03:17 PM
 */
public class Hand implements Comparable<Hand> {
  
  private List<Card> cards;
  
  public Hand() {
    this.cards = new ArrayList<>();
  }
  
  public void add(Card card) {
    if (card != null) {
      this.cards.add(card);
    }
  }
  
  public void print() {
    this.cards.forEach(System.out::println);
  }
  
  public void sort() {
    Collections.sort(this.cards);
  }
  
  @Override
  public int compareTo(Hand other) {
    return Integer.compare(this.handValue(), other.handValue());
  }
  
  private int handValue() {
    return this.cards.stream()
            .mapToInt(card -> card.getValue())
            .sum();
  }
  
  public void sortBySuit() {
    Collections.sort(this.cards, new BySuitInValueOrder());
  }
}
