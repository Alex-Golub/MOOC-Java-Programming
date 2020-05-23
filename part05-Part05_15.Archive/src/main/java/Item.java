
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 */
public class Item {
    
    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        final Item other = (Item) obj;
        return Objects.equals(this.id, other.id);
    }
    
    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
    
}
