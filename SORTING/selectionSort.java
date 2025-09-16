package SORTING;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }   
        // selection Sort Algorithm
        for(int  i = 0; i <= n-2;i++){
            int minIndex = i;
            for(int j = i+1;  j <= n-1; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // Swap arr[i] with arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        //print
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
