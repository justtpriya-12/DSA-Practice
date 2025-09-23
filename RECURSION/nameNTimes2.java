package RECURSION;

import java.util.Scanner;

public class nameNTimes2 {
    //method take 2 parameter int i and int m
    public static void printName(int i,int m){
        if(i > m){
            return;
        }
        System.out.println("Conrad");
        printName(i+1,m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //when i call printname
        //values are passed into method
        //passed by value -->
        //--> means copies of the values are passed into the method
        //not original
        printName(1,n);
    }
    
}
//TC = O(n) 
//SC = O(n)
