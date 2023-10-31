import java.io.*;
import java.util.Scanner;

 class Area {
    float area(float r){
        float a = (float) 3.14*r*r;
        return a;
    }
    float area(float l, float b){
        return l*b;
    }
    float area(float a, float b, float c){
        float s = (a+b+c)/2;
        float arr = (float) s*(s-a)*(s-b)*(s-c);
        float areaa = (float) Math.sqrt(arr);System.out.println("Enter Breadth");
        return areaa;
    }
}

class AreaOverload{
    public static void  main(String argp[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("MENU \n 1.Circle \n 2.Rectangle \n 3.Triangle ");
            System.out.println("Enter your chcoice");
            Area are = new Area();
            int choice = sc.nextInt();
            switch(choice){
                case 1 :
                    System.out.println("Enter Radius");
                    float r = sc.nextFloat(); 
                    System.out.println("The area is "+ are.area(r));
                    break;
                case 2:
                    System.out.println("Enter Length");
                    float l = sc.nextFloat();
                    System.out.println("Enter Breadth");
                    float h = sc.nextFloat();
                    System.out.println("The area is "+ are.area(l,h));
                    break;
                case 3:
                    System.out.println("Enter Side A");
                    float a = sc.nextFloat();
                    System.out.println("Enter Side B");
                    float b = sc.nextFloat(); 
                    System.out.println("Enter Side C");
                    float c = sc.nextFloat();
                    System.out.println("The area is "+ are.area(a,b,c));
                    break;

        }
       
    }

}
 
