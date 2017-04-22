package chapter3.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rene on 22/04/17.
 */
public class Exercise1 {

    public static void main(String[] args) {
        Map<String, Double> scoresMap = new HashMap<>();
        scoresMap.put("A+", 4.33);
        scoresMap.put("A", 4.00);
        scoresMap.put("A-", 3.67);
        scoresMap.put("B+", 3.33);
        scoresMap.put("B", 3.00);
        scoresMap.put("B-", 2.67);
        scoresMap.put("C+", 2.33);
        scoresMap.put("C", 2.00);
        scoresMap.put("C-", 1.67);
        scoresMap.put("D", 1.00);
        scoresMap.put("F", 0.00);

        String[] grades = StdIn.readAllLines();
        double gpa = new Exercise1().computeGPA(scoresMap, grades);
        StdOut.printf("GPA: %.2f", gpa);
    }

    private double computeGPA(Map<String, Double> scoresMap, String[] grades) {

        double totalGrades = 0;

        for(String grade : grades) {
            totalGrades += scoresMap.get(grade);
        }

        return totalGrades / grades.length;
    }

}
