package RECURSION;

import java.util.Scanner;

public class BacktrackNToOne {

    public static void backTrackCount(int i, int m){
        if(i>m){
            return;
        }
        backTrackCount(i+1, m);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        backTrackCount(1,n);
    }
}
