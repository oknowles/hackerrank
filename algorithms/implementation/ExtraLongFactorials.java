import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        printFactorial(input);
    }
    
    private static void printFactorial(int number) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}