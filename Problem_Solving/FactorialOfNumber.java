//To print factorial of a number

public class FactorialOfNumber
{
	public static void main(String[] args)
	{
		int n=6;
		int factorial=1;
		for(int i=1;i<=6;i++)
		{
			factorial = factorial*i;	
		}
		System.out.println("The factorial of a given number is "+ factorial);
	}
}