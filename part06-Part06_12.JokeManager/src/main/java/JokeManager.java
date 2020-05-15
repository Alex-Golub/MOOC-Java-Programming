
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 */
public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        if (this.jokes.isEmpty()) 
            return "Jokes are in short supply.";
        
        System.out.println("Drawing a joke.");
        int random = (int) (Math.random() * this.jokes.size());
        return this.jokes.get(random);
    }
    
    public void printJokes() {
        for (String joke : this.jokes) 
            System.out.println(joke);
    }
    
}
