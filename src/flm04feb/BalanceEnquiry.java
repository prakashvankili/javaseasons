package flm04feb;

public class BalanceEnquiry {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankBalance B = new BankBalance();
		System.out.println("Iam going to print default values bcoz no variable is intialized ");
	  System.out.println(B.name);	 ;
	  System.out.println(B.balance);
	  System.out.println(B.phno);
	  
	 B.name = "prakash" ;
	 B.balance = 1000 ;
	 B.phno = 9951242905L ;
	 
	 System.out.println("Iam going to print inttialized values here");
	  System.out.println(B.name);	 ;
	  System.out.println(B.balance);
	  System.out.println(B.phno);
	  B.grettings();
	  BankBalance.bye(B.name);
	 
	 
		
		

	}

}
