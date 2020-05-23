
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
public class Course {
    private final static int PASSING_GRADE = 50;
    private final List<Integer> grades;
    private int numberOfPassed = 0;

    public Course() {
        grades = new ArrayList<>();
    }

    /**
     * Numbers that are not within the interval [0-100] 
     * should not be taken into account
     * @param grade to add
     */
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            if (grade >= Course.PASSING_GRADE) {
                numberOfPassed++;
            }
        }
    }

    /**
     * Course average grade user always provides at least one integer between
     * [0-100] i.e grades.size() >= 1
     * @return average score of this course
     */
    public double averageGradeAll() {
        return 1.0 * totalGrades() / grades.size();
    }

    /**
     * Return total grade score for this course
     */
    private int totalGrades() {
        int total = 0;
        for (Integer i : grades) {
            total += i;
        }
        return total;
    }

    /**
     * Calculate average score of students that passed the course
     * i.e only scores >= 50 
     * @return 
     */
    public double averageGradePassing() {
        final int totalPassedGrades = totalPassedGrades();

        if (numberOfPassed == 0) {
            // No one passed the course
            return Double.MIN_VALUE;
        }

        return 1.0 * totalPassedGrades / numberOfPassed;
    }

    private int totalPassedGrades() {
        int total = 0;
        for (Integer i : grades) {
            if (i >= Course.PASSING_GRADE) {
                total += i;
            }
        }
        return total; // 
    }
    
    public double passPrecebtage() {
        return 100.0 * numberOfPassed / grades.size();
    }
    
    public void gradeDistribution() {
        System.out.println("Grade distribution:");
        
        int[] distribution = getDistribution();
        for (int i = distribution.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            while (distribution[i]-- > 0) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private int[] getDistribution() {
        int[] result = new int[6];
        for (Integer grade : grades) {
            if (grade >= 90) result[5]++;
            else if (grade >= 80) result[4]++;
            else if (grade >= 70) result[3]++;
            else if (grade >= 60) result[2]++;
            else if (grade >= 50) result[1]++;
            else result[0]++;
        }
        return result;
    }

}
