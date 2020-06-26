package validating;

public class Person {

  private String name;
  private int age;

  public Person(String name, int age) {
    // not null, empty, or over 40 characters in length.
    if (name == null || name.isEmpty() || name.length() > 40) {
      throw new IllegalArgumentException("Invalid name argument");
    }

    if (age < 0 || age > 120) {
      throw new IllegalArgumentException("Invalid age");
    }

    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
