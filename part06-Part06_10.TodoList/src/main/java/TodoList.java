
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
public class TodoList {
    private ArrayList<String> todos;

    public TodoList() {
        todos = new ArrayList<>();
    }
    
    public void add(String task) {
        todos.add(task);
    }
    
    public void print() {
        for (int i = 0; i < todos.size(); i++)
            System.out.printf("%d: %s%n", i + 1, todos.get(i));
    }
    
    public void remove(int number) {
        if (number < 1 || number > todos.size())
            return;
        todos.remove(number - 1);
    }
    
}
