import java.util.Scanner;

class StringSearch{
	public static void main(String arg[]){
		Scanner sc  = new Scanner(System.in);
		System.out.println("ENter your word");
		String word = sc.nextLine();
		System.out.println("ENter letter to search");
		char letter = sc.next().charAt(0);
		int count = 0;
		for(char w1: word.toCharArray()){
			if (w1 == letter){count++;}
		}
		System.out.println("The leter " + letter + "occured " + count + " times"); 
	}





}
