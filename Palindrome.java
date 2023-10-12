import java.io.*;
import java.util.*;


class Palindrome{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter word");
		String word = sc.nextLine();
		int i =0,count = 0;
		int n = word.length();
		int j = n-1;
		while(i<n){
			if (word.charAt(i) == word.charAt(j) ){
					count++;
					i++;j--;
				}else{
					break;

				}
			

		

	}
	System.out.println(n +" " + count) ;
	if (n == count){
		System.out.println("Yes it is a pallindrome");

	}else{
		System.out.println("No it is not a pallindorme");
	}
	


	}

}
