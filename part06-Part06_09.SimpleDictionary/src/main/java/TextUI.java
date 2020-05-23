
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if ("end".equals(command))
                break;
            else if ("add".equals(command)) {
                addNewWord();
            } else if ("search".equals(command)){
                search();
            } else {
                System.out.println("Unknown command");
            }
        }
        
        System.out.println("Bye bye!");
    }

    private void addNewWord() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        dictionary.add(word, translation);
    }

    private void search() {
        System.out.print("To be translated: ");
        String word = scanner.nextLine();
        String translation = dictionary.translate(word);
        if (translation == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }
    
}
