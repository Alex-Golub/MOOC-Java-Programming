
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
public class Recipes {

    private List<Recipe> recipes;

    public Recipes() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe r) {
        recipes.add(r);
    }

    public void list() {
        System.out.println("\nRecipes: ");
        for (Recipe r : recipes) {
            System.out.println(r);
        }
        System.out.println();
    }

    public Recipes findByName(String name) {
        Recipes found = new Recipes();
        for (Recipe r : recipes) {
            if (r.getName().contains(name)) {
                found.addRecipe(r);
            }
        }
        return found;
    }

    public Recipes findByCookingTime(int time) {
        Recipes found = new Recipes();
        for (Recipe r : recipes) {
            if (r.getCookingTime() <= time) {
                found.addRecipe(r);
            }
        }
        return found;
    }

    public Recipes findByIngredient(String ingredient) {
        Recipes found = new Recipes();
        for (Recipe r : recipes) {
            if (r.getIngredients().contains(ingredient)) {
                found.addRecipe(r);
            }
        }
        return found;
    }

}
