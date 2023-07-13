import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, triangleArea, circleArea, trapezeArea, squareArea, retangleArea;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangleArea = a * c / 2;
		circleArea = 3.14159 * Math.pow(c, 2);
		trapezeArea = (a + b) * c / 2;
		squareArea = Math.pow(b, 2);
		retangleArea = a * b;
		
		System.out.printf("Triangle: %.3f%n", triangleArea);
		System.out.printf("Circle: %.3f%n", circleArea);
		System.out.printf("Trapeze: %.3f%n", trapezeArea);
		System.out.printf("Square: %.3f%n", squareArea);
		System.out.printf("Retangle: %.3f%n", retangleArea);
		
	}

}
