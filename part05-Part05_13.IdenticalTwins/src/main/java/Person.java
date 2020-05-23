
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;
        final Person otherPerson = (Person) other;
        if (!Objects.equals(this.name, otherPerson.name)) return false;
        if (!Objects.equals(this.birthday, otherPerson.birthday)) return false;
        if (this.height != otherPerson.height) return false;
        if (this.weight != otherPerson.weight) return false;
        return true;
    }
}
