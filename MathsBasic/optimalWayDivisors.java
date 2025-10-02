package MathsBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class optimalWayDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> divisors = new ArrayList();

        for(int i  = 1; i <= (int)Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.print(i+" ");
                divisors.add(i);
                if(n/i != i){
                    System.out.print(n/i+" ");
                    divisors.add(n / i);
                }
            }
        }
        System.out.println();
        Collections.sort(divisors);
        for(int d : divisors){
            System.out.print(d+" ");
        }
    }
    
}
