import java.util.Scanner;

class ConvertCelsiusToFahrenheit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Temprature in Celsius:");
		
		double temp = sc.nextDouble();
		double fah = (9.0d/5)*temp+32;
		
		System.out.print("The Temprature in Fahrenheit is:"+ fah);
		
		
	}
}
