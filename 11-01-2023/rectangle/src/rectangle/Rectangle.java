package rectangle;

public class Rectangle {
	private double length;
	private double width;
	
	Rectangle(double length, double width)
	{
		this.length=length;
		this.width=width;
	}
	
	Rectangle(double side)
	{
		length=side;
		width=side;
	}
	
	public void calculateArea()
	{
		double area=length*width;
		System.out.println("Area of the rectangle is: "+area);
	}

}
