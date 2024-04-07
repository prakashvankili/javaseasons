package YoutubeAssignment;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	
		System.out.println("Enter the number");
		Scanner S = new Scanner(System.in);
		    int Number = S.nextInt();
		    
		    if (Number%2==0) {
		    	System.out.println("It's Even number");
		    	
		    }
		    else {
		    	System.out.println("it's odd number");
		    }
	}

}
