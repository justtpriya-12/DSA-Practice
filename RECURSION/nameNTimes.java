package RECURSION;

public class nameNTimes {

    static int i = 1;    
    public static void printName(){
        if(i == 5){
            return;
        }
        System.out.println("Raj");
        i++;
        printName();
        
    }
    public static void main(String[] args) {
        printName();
    }
}

//here we are not taking n length
//no calling of function with reference

