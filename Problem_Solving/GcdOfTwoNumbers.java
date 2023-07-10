//WRITE A PROGRAM TO FIND THE GCD OF TWO NUMBERS

public class GcdOfTwoNumbers
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
		System.out.println("The GCD of Two number is "+ g);
	}
}