import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int setSize = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] setNumbers = new int[setSize];
        
        for (int i = 0; i < setSize; i++) {
            setNumbers[i] = scanner.nextInt();
        }
        
        System.out.println(getLargestNonDivisibleSubset(setNumbers, divisor));
        
        scanner.close();
    }
    
    private static int getLargestNonDivisibleSubset(int[] setNumbers, int divisor) {
        Map<Integer, Integer> remainderCounts = new HashMap<>();
        
        for (int i : setNumbers) {
            int divisorRemainder = i % divisor;
            Integer remainderCount = remainderCounts.getOrDefault(divisorRemainder, 0);
            remainderCounts.put(divisorRemainder, remainderCount + 1);
        }
                
        int count = (remainderCounts.containsKey(0)) ? 1 : 0;
        
        for (int j = 1; j < Math.ceil((divisor + 1) / 2.0); j++) {
            Integer jCount = remainderCounts.getOrDefault(j, 0);
            Integer kCount = remainderCounts.getOrDefault(divisor - j, 0);
            
            if (j != (divisor - j)) {
                count += Math.max(jCount, kCount);
            } else if (jCount > 0) {
                count++;
            }
        }
        return count;
    }
}