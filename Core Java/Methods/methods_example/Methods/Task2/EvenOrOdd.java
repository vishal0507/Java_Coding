import java.util.Scanner;
public class EvenOrOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		checkEvenOdd(number);
		
		
	}
	public static void checkEvenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println("The given number is even");
		}
		else
		{
			System.out.println("The given number is odd");
		}
	}
}