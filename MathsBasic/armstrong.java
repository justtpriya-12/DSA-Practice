package MathsBasic;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int count = 0;
        int temp = n;
        while(temp > 0){
            temp = temp/10;
            count++;
        }
        int sum = 0;
        while(n > 0){
            int r = n%10;
            sum = sum + (int)Math.pow(r,count);
            n = n/10;
        }
        if(original == sum) System.out.println("Palindrome");
        else System.out.println("not palindrome");
    }
    
}
