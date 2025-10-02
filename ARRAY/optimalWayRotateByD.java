package ARRAY;

import java.util.Scanner;

public class optimalWayRotateByD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of Array : ");
        int n = sc.nextInt();

        System.out.print("rotating value index : ");
        int d = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int s = 0, e = d-1;
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        for(int i = 0; i < d; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int s1 = d, e1 = n-1;
        while(s1 < e1){
            int temp = arr[s1];
            arr[s1] = arr[e1];
            arr[e1] = temp;
            s1++;
            e1--;
        }

        for(int i = d; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int s2 = 0, e2 = n-1;
        while(s2 < e2){
            int temp = arr[s2];
            arr[s2] = arr[e2];
            arr[e2] = temp;
            s2++;
            e2--;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
