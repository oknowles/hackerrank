import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int searchNum = scanner.nextInt();
        int size = scanner.nextInt();
        
        for (int i = 0; i < size; i++) {
            if (scanner.nextInt() == searchNum) {
                System.out.println(i);
                return;
            }
        }
    }
}