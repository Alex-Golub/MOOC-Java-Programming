
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

  }

  public static List<String> read(String file) {
    try {
      return Files.lines(Paths.get(file)).collect(Collectors.toCollection(ArrayList::new));
    } catch (IOException ex) {
      Logger.getLogger(ReadingFilesPerLine.class.getName()).log(Level.SEVERE, null, ex);
    }

    return Collections.emptyList();
  }

}
