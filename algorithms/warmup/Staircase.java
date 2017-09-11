import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stairSize = scanner.nextInt();
        
        StringBuilder level = new StringBuilder();
        
        for (int i = 0; i < stairSize - 1; i++) level.append(" ");
        level.append("#");
        System.out.println(level);
        
        for (int j = 0; j < stairSize - 1; j++) {
            level.deleteCharAt(0);
            level.append("#");
            System.out.println(level);
        }
        
        scanner.close();
    }
}