import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter weight in pounds");
		double weightPD = sc.nextDouble();
		System.out.println("enter height in inches");
		double heightInch = sc.nextDouble();
		double weightKG = weightPD*0.45359237;
		double heightMeter = heightInch*0.0254 ;
		double bmi = weightKG/(heightMeter * heightMeter);
		System.out.println("BMI is"+ bmi);
		
	}
}