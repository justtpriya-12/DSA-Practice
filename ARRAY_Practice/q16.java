package ARRAY_Practice;

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //frequency
        for(int i = 0; i < n; i++){
            int x = arr[i];
            int count = 0;
            if(x == -1){
                continue;
            }
            for(int j = 0; j < n; j++){
                if(arr[j] == x){
                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println("frequency of "+i+" = "+count);
        }
    }
    
}
