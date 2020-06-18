/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * Jun 18, 2020 9:13:53 PM
 */
public class Book {
  
  private String title;
  private Integer age;

  public Book(String title, Integer age) {
    this.title = title;
    this.age = age;
  }

  public String getTitle() {
    return title;
  }

  public Integer getAge() {
    return age;
  }

  @Override
  public String toString() {
    return String.format("%s (recommended for %d year-olds or older)", getTitle(), getAge());
  }
  
  
  
}
