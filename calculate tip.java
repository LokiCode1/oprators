import java.util.Scanner;
class CalculateTips 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	  	
		System.out.print("Enter Subtotal:");
	   float sub = sc.nextFloat();
	   System.out.print("Enter Rate:");
	   float rate = sc.nextFloat();
	   float tipAmount = (sub*rate)*100;
	   float totalBill = tipAmount + sub;
}
}
