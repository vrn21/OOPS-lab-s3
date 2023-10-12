import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ncopy = n;
        int sum = 0;
        while (ncopy != 0 ){
            int digit = ncopy%10;
            sum += digit*digit*digit;
	    ncopy /= 10;
        }
        if (sum == n){System.out.println(n + " is an Armstrong number");}
    }
}
