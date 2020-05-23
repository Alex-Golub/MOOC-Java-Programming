
import java.util.ArrayList;
import java.util.List;

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

    private List<String> todos;

    public TodoList() {
        todos = new ArrayList<>();
    }

    public void add(String task) {
        todos.add(task);
    }
    
    public void print() {
        for (int i = 0; i < todos.size(); i++) {
            System.out.println((i + 1) + ": " + todos.get(i));
        }
    }
    
    public void remove(int number) {
        todos.remove(number - 1);
    }
}
