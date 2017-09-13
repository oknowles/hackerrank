import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int appleHitCount = 0;
        for(int i=0; i < m; i++){
            int applePos = a + in.nextInt();
            if (applePos >= s && applePos <= t) {
                appleHitCount++;
            }
        }
        
        int orangeHitCount = 0;
        for(int i=0; i < n; i++){
            int orangePos = b + in.nextInt();
            if (orangePos >= s && orangePos <= t) {
                orangeHitCount++;
            }
        }
        
        System.out.println(appleHitCount);
        System.out.println(orangeHitCount);

        in.close();
    }
}
