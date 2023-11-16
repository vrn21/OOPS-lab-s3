import java.lang.reflect.Array;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        list listt = new list();
        System.out.println("Binary Search");
        System.out.print("THe array is " );
        for (int element : listt.array){
            System.out.print(" "+ element);
        }
        System.out.println("WHat do you want to search for" );
        int target = sc.nextInt();
        int result = listt.binarySearch(target);
        System.out.println("The value is found at index "+ result);
    }
}


class list {
     int [] array = {2,9,63,69,100,106,108,200};
    // list(){
    //    int [] array = {2,9,63,69,100,106,108,200};
    // }   

    int binarySearch(int target){
        int l = array.length;
        int start = 0;
        int finish = l - 1;
        int mid = (start + finish)/2;
        while (start<=finish){
            System.out.println("Comparing " + array[mid] + " and "+ target);
            if (array[mid] == target){
                System.out.println("Found target!");
                return mid;
            }
                if (array[mid] > target){
                    System.out.println(array[mid] + " is bigger than and "+ target);
                    finish = mid;
                    mid = (start + finish)/2;
                    System.err.println("finish "+ finish + "mid "+ mid + "start " + start);
                } if (array[mid] < target){
                    System.out.println(array[mid] + " is smaller than and "+ target);
                    start = mid;
                    mid = (start + finish)/2;
                    System.err.println("finish "+ finish + "mid "+ mid + "start " + start);
                }
            }
        
        return -1;
    }
}

