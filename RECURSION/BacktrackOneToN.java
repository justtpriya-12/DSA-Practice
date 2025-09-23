package RECURSION;

import java.util.Scanner;

public class BacktrackOneToN {

    public static void backTrackCount(int i, int m){
        if(i < 1){
            return;
        }
        backTrackCount(i-1, m);
        System.out.println(i);
    }
    
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        backTrackCount(n,n);
    }
}
