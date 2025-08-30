package ARRAY_Practice;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of element in an array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("arr :");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //creat new array
        int[] arr1 = new int[n];
        System.out.println("arr1 :");
        for(int i = 0; i < n; i++){
            arr1[i] = arr[i];
            System.out.print(arr1[i]+" ");
        }
        

    }
    
}
