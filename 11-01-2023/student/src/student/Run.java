package student;

public class Run {

	public static void main(String[] args) {
		
		Student b1=new Student(1, "AAA", 21);
		b1.accountCreation();
		
		Student b2=new Student(2, "BBB");
		b2.accountCreation();
		
		Student b3=new Student(3);
		b3.accountCreation();
	}
}
