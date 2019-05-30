import java.util.Scanner;
/**
 * Program that changes degrees Fahrenheit to degrees Celsius.
 * @author wenjiawei
 * Homework 1 for Chapter 2.
 * Last Changed: May 30, 2019.
 */
public class temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the temperature in degrees Fahrenheit:");
		double fahrenheit,celsius;
		Scanner keyboard = new Scanner(System.in);
		fahrenheit = keyboard.nextDouble();
		celsius = 5*(fahrenheit-32)/9;
		System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celcius.");
	}

}
