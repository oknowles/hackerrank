import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] rowSums = new int[n];
            int[] colSums = new int[n];
            for(int r=0; r < n; r++){
                for(int c=0; c < n; c++){
                    int val = in.nextInt();
                    rowSums[r] += val;
                    colSums[c] += val;
                }
            }
            System.out.println(isPossible(rowSums, colSums, n) ? "Possible" : "Impossible");
        }
    }
    
    private static boolean isPossible(int[] rowSums, int[] colSums, int n) {
        Arrays.sort(rowSums);
        Arrays.sort(colSums);
        
        for (int i=0; i < n; i++) {
            if (rowSums[i] != colSums[i]) {
                return false;
            }
        }
        return true;
    }
}