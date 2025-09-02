package ARRAY_Practice;

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int element = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > max){
                max = count;
                element = arr[i];
            }
        }
        System.out.println("element "+element+", max "+max);
    }
    
}
