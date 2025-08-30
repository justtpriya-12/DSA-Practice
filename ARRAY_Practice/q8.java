package ARRAY_Practice;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Element in an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("arr :");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array in alternate manner : ");
        for(int i = 0; i < n; i= i+2){
            System.out.print(arr[i]+" ");
        }

    }
}
