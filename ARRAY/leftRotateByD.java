package ARRAY;

import java.util.Scanner;

public class leftRotateByD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array : ");
        int n = sc.nextInt();
        System.out.print("Rotate by D: ");
        int d = sc.nextInt();
        
        int[] arr = new int[n];
        //input of array
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //store the rotating value in new array
        int[] temp = new int[d];
        for(int i = 0; i < d; i++){
            temp[i] = arr[i]; 
        }


        for(int i = d; i < n; i++){
            arr[i-d] = arr[i];
        }

        for(int i = n-d; i < n; i++){
            arr[i] = temp[i-(n-d)];
        }

        //print
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
