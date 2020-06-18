
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {

  public static void main(String[] args) {
    List<Literacy> data = new ArrayList<>();
    
    try {
      data = Files.lines(Paths.get("literacy.csv"))
              .map(line -> line.split(","))
              .map(part -> new Literacy(
                            part[2].trim().split("\\s+")[0], // gender ignore (%)
                            part[3], //country
                            Integer.parseInt(part[4]), // year
                            Double.parseDouble(part[5]))) // percent
              .collect(Collectors.toCollection(ArrayList::new));
    } catch (IOException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
    
    data.stream()
            .sorted((l1, l2) -> Double.compare(l1.getPercent(), l2.getPercent())) // sort by percent
            .forEach(System.out::println); // print 
  }
}
