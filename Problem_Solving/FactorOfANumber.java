//WRITE A PROGRAM TO FIND THE FACTORS OF A GIVEN NUMBER

public class FactorOfANumber
{
	public static void main(String[] args)
	{
		int i=1;
		int number = 6;
		while(i<=number)
		{
			if(number%i ==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}