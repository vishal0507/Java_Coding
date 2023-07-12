public class WithParamCharReturn
{
	public static void main(String[] args)
	{
		char value = answer(23.1,20);
		System.out.println(value);
	}
	public static char answer(double a, int b)
	{
		if(a>b)
		{
			return 'd';
		}
		return 'i';
	}
}