/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author thisPc Jun 29, 2020 10:58:11 PM
 */
public class SaveableDictionary {

  /** Finnish -> English */
  private Map<String, String> dictionary;
  private String filePath;

  public SaveableDictionary() {
    this.dictionary = new HashMap<>();
  }

  public void add(String word, String translation) {
    this.dictionary.putIfAbsent(word, translation);
  }

  /** Reading from file. */
  public SaveableDictionary(String file) {
    this();
    this.filePath = file;
  }

  /** loads the dictionary from the file given to the constructor as a parameter. */
  public boolean load() {
    try ( Scanner reader = new Scanner(Paths.get(this.filePath)) ) {
      while (reader.hasNextLine()) {
        String[] parts = reader.nextLine().split(":");
        this.add(parts[0], parts[1]);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return false;
    }

    return true;
  }

  public String translate(String word) {
    String translation = this.dictionary.getOrDefault(word, null);
    return translation != null ? translation : findKeyByValue(word);
  }

  public void delete(String word) {
    if (this.dictionary.containsKey(word)) {
      this.dictionary.remove(word);
    } else if (this.dictionary.containsValue(word)) {
      this.dictionary.remove(findKeyByValue(word));
    }
  }

  private String findKeyByValue(String v) {
    for (Map.Entry<String, String> entry : this.dictionary.entrySet()) {
      if (entry.getValue().equals(v)) {
        return entry.getKey();
      }
    }

    return null;
  }

  /**
   * saves the dictionary to the file given to the dictionary as a parameter to
   * the constructor. dictionary is written on top of the previously saved
   * version.
   */
  public boolean save() {
    try ( PrintWriter writer = new PrintWriter(this.filePath) ) {
      this.dictionary.forEach((k, v) -> writer.printf("%s:%s%n", k, v));
    } catch (FileNotFoundException fnf) {
      System.out.println(fnf.getMessage());
      return false;
    }

    return true;
  }

}
