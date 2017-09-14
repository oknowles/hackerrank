import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        int length = input.length();
        double lengthSqrt = Math.sqrt(length);
        
        int numRows = (int) Math.floor(lengthSqrt);
        int numCols = (int) Math.ceil(lengthSqrt);
        
        if (numRows * numCols < length) {
            numRows++;
        }
        
        int curRow = 0;
        int curCol = 0;
        StringBuilder result = new StringBuilder();
        
        for (int c = 0; c < length; c++) {
            if (curRow == numRows || (numCols * curRow + curCol) >= length) {
                result.append(" ");
                curRow = 0;
                curCol++;
            } 
            result.append(input.charAt(numCols * curRow + curCol));
            curRow++;
        }
        
        System.out.println(result);
    }
}