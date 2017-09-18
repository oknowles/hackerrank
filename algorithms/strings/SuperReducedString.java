import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        
        int prevLength, newLength;
        
        do {
            prevLength = stringBuilder.length();
            stringBuilder = reduceString(stringBuilder);
            newLength = stringBuilder.length();
        } while (newLength < prevLength);
        
        return stringBuilder.length() == 0 ? "Empty String" : stringBuilder.toString();
    }
    
    static StringBuilder reduceString(StringBuilder str) {
        if (str.length() == 0) {
            return str;
        }
        
        char prevChar = str.charAt(0);
        int curPos = 1;
        
        while (curPos < str.length()) {
            char curChar = str.charAt(curPos);
            if (curChar == prevChar) {
                str.deleteCharAt(curPos);
                str.deleteCharAt(curPos - 1);
                prevChar = ' ';
                curPos--;
            } else {
                prevChar = curChar;
                curPos++;
            }
        }
       
        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
