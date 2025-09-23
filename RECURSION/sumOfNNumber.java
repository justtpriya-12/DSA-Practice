package RECURSION;

import java.util.Scanner;

//sum of First N number in two way :

//1. Parameterised

public class sumOfNNumber {

    public static void sumNNumber(int m, int sum){
        if(m < 1){
            System.out.println(sum);
            return;
        }
        sumNNumber(m-1, sum+m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumNNumber(n,0);
    }
    
}
