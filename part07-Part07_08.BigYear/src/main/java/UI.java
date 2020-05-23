
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
class UI {

    private Scanner scan;
    private BirdsDB birdsDB;

    public UI() {
        scan = new Scanner(System.in);
        birdsDB = new BirdsDB();
    }

    public void menu() {
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            if (command.equalsIgnoreCase("Quit")) {
                break;
            }

            proccessCommand(command);
        }
    }

    private void proccessCommand(String command) {
        switch (command) {
            case "Add":
                add();
                break;
            case "Observation":
                observation();
                break;
            case "All":
                listAll();
                break;
            case "One":
                listOne();
                break;
            default:
                System.out.println("Unsuporrted command");
        }
    }

    private void add() {
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scan.nextLine();
        
        birdsDB.addBird(name, latinName);
    }

    private void observation() {
        System.out.print("Bird: ");
        String birdType = scan.nextLine();
       
        if (!birdsDB.observed(birdType)) {
            System.out.println("Not a bird!");
        }
    }

    private void listAll() {
        birdsDB.listAll();
    }

    private void listOne() {
        System.out.print("Bird? ");
        String birdType = scan.nextLine();
        birdsDB.listOne(birdType);
    }

}
