package MathsBasic;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int hcf = 1;
        for(int i = 1; i <= Math.min(n,m); i++){
            if(n % i == 0 && m % i == 0){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
    
}
