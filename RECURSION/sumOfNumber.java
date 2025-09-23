package RECURSION;

import java.util.Scanner;

public class sumOfNumber {

    public static int sumNNumber(int m){
        if(m == 0){
            return 0;
        }
        return m + sumNNumber(m-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumNNumber(n));
    }
}


//2. Functional --> when you want to function back expect printing something