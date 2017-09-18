import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long getWays(int n, int[] c){
        long[] ways = new long[n + 1]; 
        ways[0] = 1;
        
        for (Integer coin : c) {
            for (int amount = coin; amount <= n; amount++) {
                ways[amount] += ways[amount - coin];
            }
        }
        return ways[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            int coin = in.nextInt();
            c[c_i] = coin;
        }
        Arrays.sort(c);
        
        long ways = getWays(n, c);
        System.out.println(ways);
    }
}