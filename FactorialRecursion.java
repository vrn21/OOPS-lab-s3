import java.util.Scanner;

public class FactorialRecursion {
    int factorial(int n){
        if (n == 1){return 1;}
        else{return n * factorial(n-1);}
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find factorial");
        int n = sc.nextInt();
        FactorialRecursion f = new FactorialRecursion();
        int fact = f.factorial(n);
        System.out.println("The factorial is " + fact);
    }
}


