import java.util.Scanner;
class ConvertPoundsIntoKilograms 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter wight in pounds");
		float pound = sc.nextFloat();
		float kilo = pound * 0.454f;
		System.out.println(pound+" pounds is " + kilo + " kilogram" );
	}
}
