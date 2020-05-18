
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course course = new Course();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                break;
            }

            course.addGrade(input);
        }

        // Part 1: Point averages
        System.out.println("Point average (all): " + course.averageGradeAll());
        
        // Part 2: Point average for points giving a passing grade
        final double averageGradePassing = course.averageGradePassing();
        System.out.print("Point average (passing): ");
        if (Double.compare(averageGradePassing, Double.MIN_VALUE) <= 0) {
            System.out.println("-");
        } else {
            System.out.println(averageGradePassing);
        }
        
        // Part 3: Pass percentage
        System.out.println("Pass percentage: " + course.passPrecebtage());
         
        
        // Part 4: Grade distribution
        course.gradeDistribution();
    }
}
