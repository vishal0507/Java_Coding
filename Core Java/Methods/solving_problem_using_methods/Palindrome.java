import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		checkPalindrome(number);
		
		
	}
	public static void checkPalindrome(int num)
	{
		int temp = num;
		int rem;
		int rev=0;
		while(num>0)
		{
			rem = num%10;
			rev=(10*rev)+rem;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("The given number is not palindrome");
		}
	}
}