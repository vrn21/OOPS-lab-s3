import java.io.*;
import java.util.Scanner;

class Students{
    public static void main(String arg[]){
        System.out.println("Enter details of student and marks in 5 subjects: ");
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter your roll number: ");
        int roll = sc.nextInt();
        System.out.println("Enter your marks1: ");
        int marks1 = sc.nextInt();
        System.out.println("Enter your marks2: ");
        int marks2 = sc.nextInt();
        System.out.println("Enter your marks3: ");
        int marks3 = sc.nextInt();
        System.out.println("Enter your marks4: ");
        int marks4 = sc.nextInt(); 
        System.out.println("Enter your marks5: ");
        int marks5 = sc.nextInt();
        System.out.println("\n Name: " + name +" Roll Number: " + roll + " Marks1: " + marks1 + " Marks2: " + marks2 + " Marks3: " + marks3 + " Marks4: " + marks4 + " Marks5: " + marks5);
}

}