package student;

public class Student {

	private int sid;
	private String sname;
	private int age;
	
	Student(int sid)
	{
		this.sid=sid;
	}
	
	Student(int sid, String sname)
	{
		this.sid=sid;
		this.sname=sname;
	}
	
	Student(int sid, String sname, int age)
	{
		this.sid=sid;
		this.sname=sname;
		this.age=age;
	}
	
	public void accountCreation()
	{
		System.out.println("Student ID: " + sid + " Student name: " + sname + " Age: " + age);
	}
}
