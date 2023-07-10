// WRITE A PROGRAM TO FIND WHETHER THE NUMBER IS SPECIAL NUMBER OR NOT
// SPECIAL NUMBER IS SUM OF THE FACTORIAL OF EACH NUMBER WHICH IS EQUAL TO THE NUMBER (145)

public class SpecialNumber
{
	public static void main(String[] args)
	{
		int number = 145;
		int temp = number;
		int sum=0;
		int rem;
		while(number>0)
		{
			rem=number%10;
			int factorial=1;
			int i=1;
			while(i<=rem)
			{
				factorial=factorial*i;
				i++;
			}
			sum=sum+factorial;
			number=number/10;
		}
		if(sum==temp)
		{
			System.out.println("The given number is special number");
		}
		else{
			System.out.println("The given number is not special number");
		}
	}
}