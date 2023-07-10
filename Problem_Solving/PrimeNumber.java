//WRITE A PROGRAM TO PRINT PRIME NUMBERS BETWEEN 1-20

public class PrimeNumber
{
	public static void main(String[] args)
	{
		int start =1;
		int end = 20;
		while(start<=end)
		{
			int count=0;
			int i=2;
			while(i<=start/2)
			{
				if(start%i==0)
				{
					count++;
					break;
				}
				i++;
			}
			if(count == 0)
			{
				System.out.println(start+" is prime number");
			}
			start++;
			
		}
	}
}