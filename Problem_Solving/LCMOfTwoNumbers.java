//WRITE A PROGRAM TO FIND THE LCM OF TWO NUMBERS

public class LCMOfTwoNumbers
{
	public static void main(String[] args)
	{
		int num1 = 15;
		int num2 = 24;
		int i=1;
		int g=0;
		
		do{
			if(num1%i==0 && num2%i==0)
			{
				g=i;
			}
			i++;
	
		}while(i<=num1);
		int lcm = (num1 * num2) / g ;
		System.out.println("The LCM of Two number is "+ lcm);
	}
}