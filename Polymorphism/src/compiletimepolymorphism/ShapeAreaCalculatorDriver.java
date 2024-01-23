package compiletimepolymorphism;

public class ShapeAreaCalculatorDriver {

	public static void main(String[] args) {
		
		ShapeAreaCalculator sac = new ShapeAreaCalculator();
		
		sac.calculateArea(4.5); //circle
		sac.calculateArea(3, 7); //rectangle
		sac.calculateArea(5); //square

	}

}
