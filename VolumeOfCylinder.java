import java.util.Scanner;
class VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
	    final float pi = 22.0f/7.0f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius Of Cylinder:");
		
		float radius = sc.nextFloat();
		System.out.println("Radius is:"+ radius);
		
		float area = pi * radius *radius;
		System.out.println("The Area Of Cylinder is:"+ area);
		System.out.print("Enter Hight of Cylinder:");
		float hight = sc.nextFloat();
		System.out.println("Hight is:"+ hight);
		float vol = area * hight;
		System.out.println("The Volume Of Cylinder is:"+ vol);
		
	}
}
