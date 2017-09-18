import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int wordCount = 1;
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if ('A' <= curChar && curChar <= 'Z') {
                wordCount++;
            }
        }
        
        System.out.println(wordCount);
    }
}
