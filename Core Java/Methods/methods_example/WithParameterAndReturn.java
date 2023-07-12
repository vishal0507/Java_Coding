public class WithParameterAndReturn
{
	public static void main(String[] args)
	{
		boolean answer = sub(10,30);
		System.out.println("The answer is: "+ answer);
	}
	public static boolean sub(int a,int b)
	{
		int c =a-b;
		if(c > 0)
		{
			return true;
		}
		return false;
	}
}