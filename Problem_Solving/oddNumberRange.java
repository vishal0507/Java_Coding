//Program to print a odd number from 1-100 

public class OddNumberRange
{
	public static void main(String[] args)
	{
		int start=1;
		int end=100;
		for(int i=start;start<=end;i++)
		{
			if(i%2 !=0)
			{
				System.out.println(i+" odd number");
			}
			start++;
		}
	}
}