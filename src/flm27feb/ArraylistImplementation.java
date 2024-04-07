package flm27feb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistImplementation {

	public static void main(String[] args) {
		
		
	List arr=new ArrayList();
	arr.add("prakash Yadav");
	arr.add(23);
	arr.add(5.7);
	arr.add("TechMahindra");
	arr.add("TechMahindra");
	
	
	System.out.println(arr);
	
	System.out.println(arr.get(0));
	System.out.println(arr.contains("prakash Yadav"));
	
	
	System.out.print("[");
	for(Object pr : arr) {
		System.out.print(pr+" ");
		
	}
	System.out.println("]");
	
	System.out.print("[");
	 Iterator pv =arr.iterator();
	 while(pv.hasNext()) {
		 System.out.print(pv.next()+"  ");
	 }
	 System.out.print("]");
	}
		

	 
	 
	 
	 
}
	
	


