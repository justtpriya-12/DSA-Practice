package RECURSION;

public class wholeNumber {
    static int count = 0;
    public static void print(){
        if(count == 4){
            return ;
        }
        System.out.println(count);
        count++;
        print();
    }
    public static void main(String[] args) {
        print();
    }
}

//recursion
//base condition
//stack space/stack overflow --> where non-executing functions are stored 
//recursion tree