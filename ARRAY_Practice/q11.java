package ARRAY_Practice;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Input of element :");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Elemnet to search :");
        int search = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(search == arr[i]){
                System.out.println("Element found at index :"+i);
            }
        }
    }
    
}
