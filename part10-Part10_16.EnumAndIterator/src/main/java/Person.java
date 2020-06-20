
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thisPc Jun 20, 2020 5:30:12 PM
 */
public class Person {

  private final String name;
  private Education education;

  public Person(String name, Education education) {
    this.name = name;
    this.education = education;
  }

  public Education getEducation() {
    return education;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    }
    
    final Person other = (Person) obj;
    return Objects.equals(this.name, other.name);
  }

  @Override
  public String toString() {
    return this.name + ", " + this.education;
  }

}
