package ARRAY;

import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tsum = ((n+1)*(n+2))/2;

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }

        int missingN = tsum - sum;
        System.out.println(missingN);

    }
    
}
