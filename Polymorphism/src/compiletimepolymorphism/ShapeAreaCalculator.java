package compiletimepolymorphism;

public class ShapeAreaCalculator {
	public void calculateArea(int sideLength)
	{
		System.out.println("Area of square is: "+sideLength*sideLength);
	}
	public void calculateArea(int length, int width)
	{
		System.out.println("Area of rectangle is: "+length*width);
	}
	public void calculateArea(double radius)
	{
		System.out.println("Area of circle is: "+3.14*radius*radius);
	}
}
