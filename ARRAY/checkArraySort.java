package ARRAY;

import java.util.Scanner;

public class checkArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 1; i < n-2; i++){
            if(arr[i] >= arr[i-1]){
            } else{
                System.out.println("not sorted");
                break;
            }
        }


//second method
        // int sort = 1;
        // for(int i = 0; i < n-2; i++){
        //     if(arr[i] > arr[i+1]){
        //         sort = 0;
        //         break;
        //     } 
        // }
        // if(sort == 1){
        //     System.out.println("Sorted");
        // } else {
        //     System.out.println("Not sorted");
        // }
    }
    
}
