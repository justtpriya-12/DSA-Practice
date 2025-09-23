package RECURSION;

import java.util.Scanner;

public class factOfNumber {
    public static int factOfN(int m){
        if(m == 0){
            return 1;
        }
        return m * factOfN(m-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factOfN(n));
    }
}

//TC = O(n)
//SC = O(n)
