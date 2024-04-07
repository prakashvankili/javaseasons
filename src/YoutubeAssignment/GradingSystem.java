package YoutubeAssignment;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner S = new Scanner(System.in);
		    int Marks = S.nextInt();
		    
		    
		    if (Marks >=35) {
		    	System.out.println("You have just passed exam enter th marks again to know the grade");
		    	Scanner S1 = new Scanner(System.in);
			    int mark = S1.nextInt();
			    	
		    	if(Marks >=35 &&mark <=70) {
		    		System.out.println("Student got 3rd class");		
		    	}
		    	
		    	else if(mark>70 && mark<=85) {
		    		System.out.println("Student got 2nd class");	
		    	}
		    	else if(mark>85) {
		    		System.out.println("Student got first class");
		    	}
		    	
		    }
		    else {
		    	System.out.println("Student failed in exam");
		    }
	}

}
