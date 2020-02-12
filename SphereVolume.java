import java.util.Scanner;
public class SphereVolume {
	public static Scanner User_Input;

	public static void main(String[] args) {
		
		double Volume,Radius,Diameter;
		User_Input = new Scanner(System.in);
		//Introduction
		System.out.println("Hello, I am a program that calculates the volume of a sphere. ");
		System.out.println("Please enter the diameter of the sphere.");
		//User input for radius
		Diameter = User_Input.nextDouble();
		// Formulas
		Radius = Diameter / 2.0;
		Volume = (4.0 / 3.0) * (Math.PI) * (Math.pow(Radius, 3));

		System.out.println("The Volume of a sphere with a radius of " + Radius + " equals: " + Volume);
	}
}
