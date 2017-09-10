import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int matrixSize = scanner.nextInt();
        int primaryDiagSum = 0;
        int secondaryDiagSum = 0;
        
        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                int element = scanner.nextInt();
                if (row == col) { 
                    primaryDiagSum += element;
                } 
                if (col == (matrixSize - row - 1)) {
                    secondaryDiagSum += element;
                }
            }
        }
        
        System.out.println(Math.abs(primaryDiagSum - secondaryDiagSum));
        scanner.close();
    }
}