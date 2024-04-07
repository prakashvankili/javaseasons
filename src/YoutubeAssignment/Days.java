package YoutubeAssignment;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		System.out.println("enter any day");
		Scanner S = new Scanner(System.in);
	    String Day = S.next();
	    
	    if(Day.equals("mon")|| Day.equals("tue")|| Day.equals("wed")|| Day.equals("thursday")|| Day.equals("fri") ){
	    	System.out.println("Ufff, it's weekday");
	    	
	    }
	    else if(Day.equals("sat")|| Day.equals("sun")){
	    	System.out.println("Wow , it's weekend");
	    }

	}

}
