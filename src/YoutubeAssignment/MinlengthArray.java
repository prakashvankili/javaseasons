package YoutubeAssignment;

public class MinlengthArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] snacks = {"coffee","water","chai","dietcoke"};
		String min = snacks[0];
		int index = 0;
		int curretindex=0;
		for(String food:snacks) {
			
			
			if(min.length() >food.length()) {
               min = food;	
               curretindex =index;
			}
			index++;
		}
System.out.println(min+"    index is .............."+ curretindex);
	}

}
