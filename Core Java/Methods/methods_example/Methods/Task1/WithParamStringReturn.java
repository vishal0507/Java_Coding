public class ThreeParamBooleanReturn
{
	public static void main(String[] args)
	{
		System.out.println(check(12,32.4,"vishal"));
	}
	public static boolean check(int a, double b, String c)
	{
		if(c == "vishal")
		{
			return true;
		}
		return false;
	}
}