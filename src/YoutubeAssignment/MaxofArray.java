package YoutubeAssignment;

public class MaxofArray {

	public static void main(String[] args) {
		
	
		
    int[] pa = {2,5,1,9,6};
    int max = pa[0];
    int index = 0;
    int actualindex =0;
    for(int a :pa)
    	
{        
    	 actualindex++;
    	  if(max<a) {
    	
    	    max= a;
          
    	   index = actualindex;
    	   }
    	  
    	     	   
	}
   System.out.println("index is  "+index   + "  max value is "+ max);
   
   
}
	
}