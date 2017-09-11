import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        
        int positiveCount = 0;
        int zeroCount = 0;
        int negativeCount = 0;
        
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            if (num > 0) {
                positiveCount++;
            } else if (num == 0) {
                zeroCount++;
            } else {
                negativeCount++;
            }
        }
        
        System.out.println(positiveCount / (double) count);
        System.out.println(negativeCount / (double) count);
        System.out.println(zeroCount / (double) count);
    }
}