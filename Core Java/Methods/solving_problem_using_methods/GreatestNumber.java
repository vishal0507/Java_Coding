import java.util.Scanner;
public class GreatestNumber
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = scan.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = scan.nextInt();
		System.out.print("Enter the third number: ");
		int num3 = scan.nextInt();
		checkGreatestNumber(num1,num2,num3);
		
	}
	public static void checkGreatestNumber(int num1, int num2 , int num3)
	{
		if(num1>num2 && num1>num3)
		{
			System.out.println("The greatest of three number is "+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("The greatest of three number is "+num2);
		}
		else
		{
			System.out.println("The greatest of three number is "+num3);
		}
	} 
}