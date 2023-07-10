import java.util.Scanner;
public class CalculatorUsingSwitch
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int a = scan.nextInt();
		System.out.print("Enter your second number: ");
		int b = scan.nextInt();
		System.out.print("Enter \n 1:Addition \n 2:Subraction \n 3:Multiplication \n 4:Division");
		System.out.println();
		int value = scan.nextInt();
		int answer = 0;
		switch(value)
		{
			case 1:
			{
				answer= a+b;
				break;
			}
			case 2:
			{
				answer= a-b;
				break;
			}
			case 3:
			{
				answer= a*b;
				break;
			}
			case 4:
			{
				answer= a/b;
				break;
			}
			default:{
				System.out.println("Enter the valid number");
			}
		}
		System.out.println("Answer is "+answer);

	}
}