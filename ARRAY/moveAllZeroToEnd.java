package ARRAY;

import java.util.Scanner;

public class moveAllZeroToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        int j = 0;
        int[] temp = new int[count];
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }

        for(int i = 0; i < count; i++){
            arr[i] = temp[i];
        }

        for(int i = count; i < n; i++){
            arr[i] = 0;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
