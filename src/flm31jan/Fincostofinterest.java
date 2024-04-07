package flm31jan;

import java.util.Scanner;

public class Fincostofinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter PTR values");
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int T = sc.nextInt();
		int R = sc.nextInt();
		
		System.out.println(Fincostofinterest .simpleInterest(P,T,R));
		

	}

	
	public static int simpleInterest(int P ,int T , int R ) {
		int result = P*T*R/100 ;
		return result ;
	}
}
