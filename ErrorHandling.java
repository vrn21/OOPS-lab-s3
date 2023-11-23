import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ErrorHandling
 */
public class ErrorHandling {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Division");
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();
        InnerErrorHandling in = new InnerErrorHandling();
        try {
            System.out.println("Quotient is " + in.divide(x, y));
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("DIvision by zero is not defined yet");
        }
        finally{
            System.out.println("Hope you got your answer");
        }
    }
}


class InnerErrorHandling  {
    int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
}