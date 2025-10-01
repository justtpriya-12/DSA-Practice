package ARRAY;

import java.util.Scanner;

public class secondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min, min2;
        if(arr[0] < arr[1]){
            min = arr[0];
            min2 = arr[1];
        } else {
            min = arr[1];
            min2 = arr[0];
        }

        for(int i = 2; i < n; i++){
            if(arr[i] < min){
                min2 = min;
                min = arr[i];
            } else if (arr[i] < min2){
                min2 = arr[i];
            }
        }
        System.out.print(min2);
    }
    
}
