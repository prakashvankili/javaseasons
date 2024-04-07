package flm31jan;

import java.util.Scanner;

public class FindInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the values of P,T,R to find simpleInterest" );
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt() ;
		int T = sc.nextInt() ;
		int R = sc.nextInt() ;
		
		FindInterest ph = new FindInterest() ;
		
    ph.simpleInterest(P , T , R) ;
    
	}

	public void simpleInterest(int P , double T ,double R) {
		
		double finalResult = P*T*R/100 ;
		System.out.println("Simple interest is " +finalResult);
	}
}
