//PROGRAM TO PRINT THE SUM OF THE RANGE 1 - 100

public class SumOfNumbers
{
	public static void main(String[] args)
	{
		int start=1;
		int end=100;
		int sum=0;
		for(int i=start;start<=end;i++)
		{
			sum = sum+i;
			start++;
		}
		System.out.println("Sum of range from 1 to 100 is "+sum);
	}
}