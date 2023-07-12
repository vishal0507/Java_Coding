import java.util.Scanner;
public class SpecialNumber
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scan.nextInt();
		checkSpecialNumber(number);
		
	}
	public static void checkSpecialNumber(int number)
	{
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