package BinarySearch;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];

        int[] arr = {3, 5,  6, 8, 12, 15, 16, 19, 21};
        int key = 13;

        int l = 0, h = arr.length-1, mid = 0;
        while(l <= h){
            mid = (l+h)/2;
            if(key == arr[mid]){
                System.out.println(mid);
            } else if(key < arr[mid]) {
                h = mid-1;
                //l = l;
            } else {
                l = mid+1;
                //h = h;
            }
        }
        System.out.println("not found");
    }
}

//time complexity = O(log n)
