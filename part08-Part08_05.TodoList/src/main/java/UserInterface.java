
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

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String choice = scanner.nextLine();
            if ("stop".equals(choice)) {
                break;
            }

            processChoice(choice);
        }
    }

    private void processChoice(String choice) {
        switch (choice) {
            case "add":
                System.out.print("To add: ");
                String todo = scanner.nextLine();
                todoList.add(todo);
                break;
            case "list":
                todoList.print();
                break;
            case "remove":
                System.out.print("Which one is removed? ");
                int index = Integer.parseInt(scanner.nextLine());
                todoList.remove(index);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

}
