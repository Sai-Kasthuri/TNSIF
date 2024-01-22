package com.studentfee;

abstract class Student 
{
	protected int studentId;
	protected String studentName;
	protected String department;
	protected String gender;
	protected String category;
	protected double collegeFee;
	
	Student(int studentId,String studentName,String department,String gender,String category,double collegeFee)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
		this.gender = gender;
		this.category = category;
		this.collegeFee = collegeFee;
	}

	public abstract double calculateTotalFee();
	
	public int getstudentId()
	{
		return studentId;
	}

	public void setstudentId(int studentId)
	{
		this.studentId = studentId;
	}

	public String getstudentName()
	{
		return studentName;
	}

	public void setstudentName(String studentName)
	{
		this.studentName = studentName;
	}

	public String getdepartment()
	{
		return department;
	}

	public void setdepartment(String department)
	{
		this.department = department;
	}

	public String getgender()
	{
		return gender;
	}

	public void setgender(String gender)
	{
		this.gender = gender;
	}

	public String getcategory()
	{
		return category;
	}

	public void setcategory(String category)
	{
		this.category = category;
	}

	public double getcollegeFee()
	{
		return collegeFee;
	}

	public void setcollegeFee(double collegeFee)
	{
		this.collegeFee = collegeFee;
	}
}