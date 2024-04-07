package flm07feb;

public class Student {
	
	String name ;
	int age;
	int rollNo ;
	
	public void set(String k,int f , int i) {
		this .name=k;
		this.age=f;
		this.rollNo=i;
		
	}
	public void  get() {
		
	System.out.println(name+ " "+rollNo+ " "+age+" ");
	}

}
