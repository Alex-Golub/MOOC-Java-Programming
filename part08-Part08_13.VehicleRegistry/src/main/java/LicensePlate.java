
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    // Part 1: Equals and hashCode for the LicensePlate class
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        
        LicensePlate other = (LicensePlate) o;
        return this.liNumber.equals(other.liNumber) &&
                this.country.equals(other.country);
    }
    
    @Override
    public int hashCode() {
        return Integer.sum(country.hashCode(), liNumber.hashCode());
    }

}
