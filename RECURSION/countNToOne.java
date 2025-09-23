package RECURSION;

import java.util.Scanner;

public class countNToOne {

    public static void printCount(int i , int m){
        if(m < i){
            return;
        }
        System.out.print(m+" ");
        printCount(i, m-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printCount(1,n);

    }
    
}
