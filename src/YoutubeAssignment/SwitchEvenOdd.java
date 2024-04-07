package YoutubeAssignment;

import java.util.Scanner;

public class SwitchEvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter the two numbers");
		Scanner S = new Scanner(System.in);
		    int Number = S.nextInt();
		    int Number2 = S.nextInt();
		   System.out.println("eneter + to perform addition - for substraction");
		  String  operation= S.next();
		// double res ;
		    switch(operation) {
		    case "+" :System.out.println(Number+Number2);;
		           break;
		    
		    }
	}
	}


