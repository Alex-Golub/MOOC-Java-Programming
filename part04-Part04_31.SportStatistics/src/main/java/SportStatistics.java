
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        List<String> games = readFile(scan);
        
        System.out.println("Team:");
        String team = scan.nextLine();
        gamesPlayed(team, games);
        winsAndLosses(team, games);
        
        
    }

    private static List<String> readFile(Scanner scan) {
        List<String> list = new ArrayList<>();
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (!line.isEmpty()) {
                    list.add(line);                    
                }
            }
        } catch (IOException ioe) {
            System.out.println("Error: " + ioe.getMessage());
        }
        
        return list;
    }

    private static void gamesPlayed(String team, List<String> games) {
        int gamesPlayed = 0;
        for (String game : games) {
            if (game.contains(team)) {
                gamesPlayed++;
            }
        }
        System.out.println("Games: " + gamesPlayed);
    }

    private static void winsAndLosses(String team, List<String> games) {
        int wins = 0;
        int losses = 0;
        for (String game : games) {
            if (game.contains(team)) {
                String[] statistics = game.split(",");
                int homeScore = Integer.parseInt(statistics[2]);
                int visitScore = Integer.parseInt(statistics[3]);
                
                if (statistics[0].equals(team) ) {
                    // home team
                    if (homeScore > visitScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else {
                    // visiting team
                    if (homeScore < visitScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        }
        
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
