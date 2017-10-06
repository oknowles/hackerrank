import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int dashLimit = n / 2;
        StringBuilder[] words = intialiseArray(100);
        
        for (int i = 0; i < n; i++) {
            int curNum = scanner.nextInt();
            String curString = scanner.next();
            curString = (i < dashLimit) ? "-" : curString;
            words[curNum].append(curString).append(" ");
        }
        
        printArray(words);
    }

    private static StringBuilder[] intialiseArray(int count) {
        StringBuilder[] result = new StringBuilder[count];
        for (int i = 0; i < count; i++) {
            result[i] = new StringBuilder();
        }
        return result;
    }
    
    private static void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}