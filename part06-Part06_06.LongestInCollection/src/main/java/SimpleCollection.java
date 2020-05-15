
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        int maxLength = this.elements.get(0).length();
        int maxIndex = 0;
        for (int i = 1; i < this.elements.size(); i++) {
            if (this.elements.get(i).length() > maxLength) {
                maxLength = this.elements.get(i).length();
                maxIndex = i;
            }
        }
        
        return this.elements.get(maxIndex);
    }

}
