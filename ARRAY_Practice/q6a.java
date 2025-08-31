package ARRAY_Practice;

import java.util.Scanner;

public class q6a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int i = 0, j = arr.length-1;
        while(j>i){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }

        //after reverse
        for(int k = 0; k < n; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
