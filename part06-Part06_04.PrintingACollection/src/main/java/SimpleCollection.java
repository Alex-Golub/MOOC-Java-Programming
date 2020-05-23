
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
    
    @Override
    public String toString() {
        if (this.elements.isEmpty())
            return "The collection " + name + " is empty.";
        
        String out = "The collection " + name + " has " + this.elements.size() + (this.elements.size()> 1 ? " elements:\n" : " element:\n");
        for (String el : elements)
            out += el + "\n";
        return out.substring(0, out.length() - 1);
    }
    
}
