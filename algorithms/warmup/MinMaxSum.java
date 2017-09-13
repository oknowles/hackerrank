import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int arr_i=0; arr_i < 5; arr_i++){
            int n_i = in.nextInt();
            sum += n_i;
            min = Math.min(min, n_i);
            max = Math.max(max, n_i);
        }
        
        System.out.println((sum - max) + " " + (sum - min));
        
        in.close();
    }
}
