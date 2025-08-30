package ARRAY_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("arr = ");
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int i = 0; // Pointer to track unique elements
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // Print unique elements
        System.out.print("Unique elements: ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }


        
    }
    
}
