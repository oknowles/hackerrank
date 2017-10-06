import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static int getInsertPos(int[] ar, int n, int low, int high) {
        int midPos = low + (high - low) / 2;
        int mid = ar[midPos];
        
        while (mid != n && low <= high) {
            if (mid < n) {
                low = midPos + 1;
            } else {
                high = midPos - 1;
            }
            midPos = low + (high - low) / 2;
            mid = ar[midPos];
        }
        
        return midPos;
    }
    
    public static void insertIntoSorted(int[] ar) {
        int valToInsert = ar[ar.length - 1];
        int insertPos = getInsertPos(ar, valToInsert, 0, ar.length - 2);
        
        for (int i = ar.length - 1; i > insertPos; i--) {
            ar[i] = ar[i - 1];
            printArray(ar);
        }
        
        ar[insertPos] = valToInsert;
        printArray(ar);
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }    
}
