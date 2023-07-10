//WRITE A PROGRAM TO FIND THE GIVEN NUMBER IS ARMSTRONG NUMBER OR NOT

public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		int number=153;
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