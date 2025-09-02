package ARRAY_Practice;

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Find and print unique elements
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j] && i != j){
                    count++;
                    
                    break;
                }
            }
            if(count == 0){
                System.out.println(arr[i]);
            }
        }
    }
    
}
