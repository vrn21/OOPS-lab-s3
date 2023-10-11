import java.util.Scanner;

public class SumOfFirstN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while ( i <= n){
            System.out.println(i);
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
