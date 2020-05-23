
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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
public class UI {

    private Scanner scanner;
    private Recipes recipes;

    public UI() {
        scanner = new Scanner(System.in);
        recipes = new Recipes();
    }

    public void loadRecipesFromFile() {
        System.out.print("File to read: ");
        String path = scanner.nextLine();
        try ( Scanner sc = new Scanner(Paths.get(path))) {
            while (sc.hasNext()) {
                String recipeName = sc.nextLine();
                int cookingTime = Integer.parseInt(sc.nextLine());
                List<String> ingrediants = new ArrayList<>();
                while (sc.hasNext()) {
                    String line = sc.nextLine();
                    if (line.isEmpty()) { // white line
                        break;
                    }
                    ingrediants.add(line);
                }
                recipes.addRecipe(new Recipe(recipeName, cookingTime, ingrediants));
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        System.out.println("");
    }

    public void menu() {
        System.out.printf("Commands:%n"
                + "list - lists the recipes%n"
                + "stop - stops the program%n"
                + "find name - searches recipes by name%n"
                + "find cooking time - searches recipes by cooking time%n"
                + "find ingredient - searches recipes by ingredient%n"
                + "%n");
        
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }

            switch (command) {
                case "list":
                    recipes.list();
                    break;
                case "find name":
                    System.out.print("Searched word: ");
                    String name = scanner.nextLine();
                    recipes.findByName(name).list();
                    break;
                case "find cooking time":
                    System.out.print("Max cooking time:");
                    int time = Integer.parseInt(scanner.nextLine());
                    recipes.findByCookingTime(time).list();
                    break;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    recipes.findByIngredient(ingredient).list();
                    break;
            }
            
        }
    }

}
