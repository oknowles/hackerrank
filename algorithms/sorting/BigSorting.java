import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        
        Arrays.sort(unsorted, new StringComparator());
        
        for (String s : unsorted) {
            System.out.println(s);
        }
    }
    
    static class StringComparator implements Comparator<String> {
        
        public int compare(String s1, String s2) {
                int s1Length = s1.length();
                int s2Length = s2.length();
                if (s1Length > s2Length) {
                    return 1;
                } else if (s2Length > s1Length) {
                    return -1;
                } 
                return s1.compareTo(s2);
            }
    }
}
