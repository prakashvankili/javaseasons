package flm06feb;

public class AadharGenerate {

	String pancard ,voterid ,passport ;
	
	


public void getAadhar(String pancard) {
	this.pancard = pancard;
	

}

public void getAadhar( String passport ,String pancard) {
	this.passport = passport;
	 this.pancard = pancard;
	
}

public void getAadhar( String passport ,String pancard, String voterid) {
	this.passport = passport;
	 this.pancard = pancard;
	 this.voterid = voterid ;
	
}

public void getAadhar12() {
	 
	 
	 int x= (int)(Math.random()*100000) ;
	
	System.out.println(x +" "+ x+" "+x);
}
}