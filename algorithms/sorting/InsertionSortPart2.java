import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            insertIntoSorted(ar, 0, i);
            printArray(ar);
        }
    }  
    
    /**
     *  inserts the element at pos end + 1 into the sorted array ar[start:end]
     */
    private static void insertIntoSorted(int[] ar, int start, int end) {
        int valToInsert = ar[end + 1];
        int insertPos = getInsertPos(ar, start, end, valToInsert);
        
        for (int i = end + 1; i > insertPos; i--) {
            ar[i] = ar[i - 1];
        }
        
        ar[insertPos] = valToInsert;
    }
    
    private static int getInsertPos(int[] ar, int start, int end, int n) {
        int midPos = start + (end - start) / 2;
        int mid = ar[midPos];
        
        while (mid != n && start <= end) {
            if (mid < n) {
                start = midPos + 1;
            } else {
                end = midPos - 1;
            }
            midPos = start + (end - start) / 2;
            mid = ar[midPos];
        }
        
        return midPos;
    }
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}