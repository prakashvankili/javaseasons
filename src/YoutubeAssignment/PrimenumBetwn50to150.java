package YoutubeAssignment;

public class PrimenumBetwn50to150 {

	public static void main(String[] args) {
		int	p ;
		
		for(int i=50 ; i<=300 ; i++) {
			p=0;
			for(int j=1 ; j<=i; j++) {
			
				if(i%j==0) 
					p++ ;
			}
				
			 if(p==2) {
					System.out.println(i);	
		
			 }	
			
				
		}
			
		}
	}
			
		

	


