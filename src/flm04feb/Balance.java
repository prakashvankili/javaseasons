package flm04feb;

public class Balance {

	
	
private double balance = 1000 ;



  public void getBalance(int pin) {
	
	if(pin==2335)
	{
		System.out.println("Balance is....."+balance);
	}
	else
	{
		System.out.println("invalid");	
	}
  }
	
	public void setBal(double depositbalance) {
	
		double totalBal = depositbalance+balance ;
		System.out.println(totalBal);
		
		
	}
	
}



