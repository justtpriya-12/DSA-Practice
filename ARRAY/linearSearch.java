package ARRAY;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the element : ");
        int find = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(arr[i] == find){
                System.out.println(i);
            }
        }
    }
    
}
