import java.util.Scanner;
class AreaAndPerimeterOfARectangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of width:");
		float width = sc.nextFloat();
		System.out.print("Enter the value of height:");
		float height = sc.nextFloat();
		float area = width * height;
		float peri = 2 * (width + height);
		
		System.out.println("Area of rectangle is:"+ area);
		System.out.print("Perimeter of rectangle is:"+ peri);
	}
}
