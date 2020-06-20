
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thisPc Jun 20, 2020 6:27:08 PM
 */
public class BySuitInValueOrder implements Comparator<Card> {

  @Override
  public int compare(Card c1, Card c2) { // sorted by value inside their suit
    int compareSuit = c1.getSuit().compareTo(c2.getSuit());
    return compareSuit == 0
            ? Integer.compare(c1.getValue(), c2.getValue()) : compareSuit;
  }
}
