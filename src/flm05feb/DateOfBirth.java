package flm05feb;

public class DateOfBirth {
	
	int day ;
	String month ;
	int year ;
	
	public void setDob(int d , String m, int y) {
		day = d ;
		month = m;
		year = y ;
		
	}

	public void getDob() {
	
System.out.printf("%02d %s %d",day,month,year);
		
	}
}
