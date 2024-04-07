package flm27feb;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashsetimplementation {

	public static void main(String[] args) {
	
		
	 Set hs =new HashSet();
	 hs.add("Prakash Yadav");
	 hs.add(23);
	 hs.add(5.8);
	 hs.add(30000);
	 hs.add(30000);
	 hs.add(30000);
	 hs.add(30000);

	 
	 //System.out.println(hs);
	 
	// System.out.println(hs.contains(23));
	 
	  Iterator ab=hs.iterator();
	 
	 while(ab.hasNext()){
		 System.out.println(ab.next());
		 
	 }
		 
	 
	 
	 
	 //for(Object os :hs ) {
		//System.out.println(os);
			 
		// }
	 }

	}


