
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thisPc
 */
public class UserInterface {

    private Scanner scanner;
    private TodoList todos;

    public UserInterface(TodoList todos, Scanner scanner) {
        this.scanner = scanner;
        this.todos = todos;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if ("stop".equals(command)) {
                break;
            }
            processCommand(command);
        }
        
    }

    private void processCommand(String command) {
        if ("add".equals(command)) {
            addTodo();
        } else if ("list".equals(command)) {
            printTodos();
        } else if ("remove".equals(command)) {
            removeTodo();
        }
    }

    private void addTodo() {
        System.out.print("To add: ");
        String todo = scanner.nextLine();
        todos.add(todo);
    }

    private void printTodos() {
        todos.print();
    }

    private void removeTodo() {
        System.out.print("Which one is removed? ");
        int remove = Integer.parseInt(scanner.nextLine());
        todos.remove(remove);
    }
}
