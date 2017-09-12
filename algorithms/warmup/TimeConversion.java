import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String time = s.substring(0, 8);
        String timePeriod = s.substring(8);
        String minuteSecond = time.substring(2);
        int hour = Integer.valueOf(time.substring(0,2));
        hour = timePeriod.equals("AM") ? hour % 12 : (hour % 12) + 12;
        
        return String.format("%02d", hour) + minuteSecond;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
