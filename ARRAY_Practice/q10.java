package ARRAY_Practice;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int min1 = 0, min2 = 0;
        if(arr[0] < arr[1]){
            min1 = arr[0];
            min2 = arr[1];
        } else{
            min1 = arr[1];
            min2 = arr[0];
        }
        for(int i = 2; i < arr.length; i++){
            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            } else if(arr[i] < min2){
                min2 = arr[i];
            }
        }
        System.out.println("Second smallest number :"+min2);
     }
    
}
