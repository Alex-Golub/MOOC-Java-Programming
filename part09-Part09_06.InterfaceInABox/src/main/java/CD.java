/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * Jun 8, 2020 7:06:56 PM
 */
public class CD implements Packable {

  private String artist;
  private String name;
  private int publicationYear;
  private final double weight = 0.1;

  public CD(String artist, String name, int publicationYear) {
    this.artist = artist;
    this.name = name;
    this.publicationYear = publicationYear;
  }

  public String getArtist() {
    return artist;
  }

  public String getName() {
    return name;
  }

  public int getPublicationYear() {
    return publicationYear;
  }

  @Override
  public double weight() {
    return weight;
  }

  @Override
  public String toString() {
    return String.format("%s: %s (%d)", getArtist(), getName(), getPublicationYear());
  }

}
