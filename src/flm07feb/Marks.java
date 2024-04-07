package flm07feb;

public class Marks extends Student {

	public int maths ,physics,science ;
	
		public void setMarks(int maths , int physics ,int science) {
			this.maths = maths;
			this.physics = physics ;
			this.science = science;
			
		}
		
		public void  getMarks() {
			
			System.out.println(maths+ " "+physics+ " "+science+" ");
			}

	}


