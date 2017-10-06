import java.io.*;
import java.util.*;

public class Solution {

    static void divide(int[] arr) {
        int pivot = arr[0];
        int pIndex = arr.length - 1;
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= pivot) {
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex--;
            }            
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        divide(arr);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
}