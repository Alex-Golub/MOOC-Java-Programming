
public class Main {

  public static void main(String[] args) {
    part1and2();
    System.out.println("---");
    part3();
    System.out.println("---");
    part4();
  }

  private static void part1and2() {
    Dog dog = new Dog();
    dog.bark();
    dog.eat();

    Dog fido = new Dog("Fido");
    fido.bark();
  }

  private static void part3() {
    Cat cat = new Cat();
    cat.purr();
    cat.eat();

    Cat garfield = new Cat("Garfield");
    garfield.purr();
  }

  private static void part4() {
    NoiseCapable dog = new Dog(); // polymorphism in action
    dog.makeNoise();

    NoiseCapable cat = new Cat("Garfield");
    cat.makeNoise();
    Cat c = (Cat) cat;
    c.purr();
  }

}
