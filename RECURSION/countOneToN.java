package RECURSION;

import java.util.Scanner;

public class countOneToN {

    public static void printCount(int i , int m){
        if(i > m){
            return;
        }
        System.out.print(i+" ");
        printCount(i+1,m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printCount(1,n);
    }
    
}
