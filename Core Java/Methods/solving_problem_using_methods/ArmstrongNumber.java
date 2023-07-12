import java.util.Scanner;
public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the  number: ");
		int num = scan.nextInt();
		checkArmstrongNumber(num);
		
	}
	public static void checkArmstrongNumber(int number)
	{
		int temp=number;
		int rem;
		int answer=0;
		while(number>0)
		{
			rem = number%10;
			answer =answer+(rem*rem*rem);
			number = number/10;
		}
		if(answer == temp)
		{
			System.out.println("The given number is Armstrong number");
		}
		else
		{
			System.out.println("The given number is not Armstrong number");
		}
	} 
}