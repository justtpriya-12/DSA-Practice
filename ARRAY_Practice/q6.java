package ARRAY_Practice;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] temp = new int[n];
        //take input of array
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        //restore array into another
        for(int i = 0; i < n; i++){
            temp[i] = arr[arr.length-1-i];
        }

        System.out.println("Print reverse array :");
        for(int i = 0; i < n; i++){
            System.out.print(temp[i]+" ");
        }
    }
    
}
