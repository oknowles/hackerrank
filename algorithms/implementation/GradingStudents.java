import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            int grade = in.nextInt();
            int roundedGrade = grade;
            if (grade > 37 && grade % 5 > 2) {
                roundedGrade = grade + 5 - (grade % 5);
            }
            grades[grades_i] = roundedGrade;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(grades[i]);
        }
    }
}
