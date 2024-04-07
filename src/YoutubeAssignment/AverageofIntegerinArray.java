package YoutubeAssignment;

public class AverageofIntegerinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int[] box = {2,5,3,9,6};
		
		int[] a = new int [5] ;
		a[0]= 2;
		a[1]=5;
		a[2]=3;
		a[3]=9;
		a[4]=6;
		
		int sum =0;
		
//		for(int i=0;i<a.length;i++) {
//			  sum = a[i]+sum;
//			 
//			
//		}
//		int avg = sum/a.length;
//		System.out.println(avg);
//	}
		
		
		for(int p : a) {
			
			sum+=p;
		}
		System.out.println(sum/a.length);

}
}











