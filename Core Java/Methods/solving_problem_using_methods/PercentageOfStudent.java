import java.util.Scanner;
public class PercentageOfStudent
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the mark1: ");
		double mark1 = sc.nextInt();
		System.out.print("Enter the mark2: ");
		double mark2 = sc.nextInt();
		System.out.print("Enter the mark3: ");
		double mark3 = sc.nextInt();
		System.out.print("Enter the mark4: ");
		double mark4 = sc.nextInt();
		totalPercentage(mark1,mark2,mark3,mark4);
		
		
	}
	public static void totalPercentage(double mark1, double mark2, double mark3, double mark4)
	{
		
		double percentage = ((mark1 + mark2 + mark3 +mark4)/400) * 100;
		System.out.println("The percentage of a student marks given is : "+ percentage);
	}
}