package YoutubeAssignment;

public class Mergingarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"prakash","Ashok","Praveen"} ;
		String[] b =  {"Penchal","prasad"};
		
		
		String[] c = new String[a.length+ b.length];
		
		for(int i=0 ;i<a.length;i++) {
			c[i] = a[i];
		}
		
		for(int j=0 ; j<b.length;j++) {
				c[j+a.length] = b[j];
		}
		
		for(int k =0; k<c.length;k++) {
			System.out.print(c[k]+"   ");
		}
		}
		
	}

