
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
public class BirdsDB {

    private List<Bird> birds;

    public BirdsDB() {
        birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        Bird bird = new Bird(name, latinName);

        // Don't allow duplicate birds
        if (!birds.contains(bird)) {
            birds.add(bird);
        }
    }

    private Bird isBird(String birdType) {
        for (Bird b : birds) {
            if (b.getName().equals(birdType) || b.getLatinName().equals(birdType)) {
                return b;
            }
        }
        // Bird birdType hasn't been found
        return null;
    }

    public boolean observed(String birdType) {
        Bird b = isBird(birdType);
        if (b == null) {
            return false;
        }
        b.observed();
        return true;
    }

    public void listAll() {
        for (Bird b : birds) {
            System.out.println(b);
        }
    }

    void listOne(String birdType) {
        Bird bird = isBird(birdType);
        if (bird != null) {
            System.out.println(bird);
        }
    }

}
