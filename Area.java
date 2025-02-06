import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Radius");
			Scanner sc = new Scanner(System.in);
		final float pi = 22/7;
		float r = sc.nextFloat();
		float area = pi * r * r ;
		System.out.println("Area on Circle is :"+ area + "cm^2");
		
		
	}
}
