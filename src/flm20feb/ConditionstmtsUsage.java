package flm20feb;

import java.util.Scanner;

public class ConditionstmtsUsage {

	public static void main(String[] args) {
		
		System.out.println("Enter Your AnnaualSalary");
		Scanner  s = new Scanner(System.in);
	double Annaualsal =	s.nextInt();
		
if (Annaualsal<350000)
{
	Annaualsal = Annaualsal+(0.1*Annaualsal);
	System.out.println(Annaualsal);
}

else if(Annaualsal >=500000)
{
	Annaualsal = Annaualsal+(15*Annaualsal/100);
	System.out.println(Annaualsal);

}
	}

}
