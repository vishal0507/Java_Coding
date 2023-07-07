public class Palindrome{
	public static void main(String[] args)
	{
		String word = "madam";
		boolean value = isPalindrome(word);
		if(value == true)
		{	
			System.out.println("It is palindrome");	
		}
		else
		{
			
			System.out.println("It is not a palindrome");	
		}
		
	}
	public static boolean isPalindrome(String word)
	{
		char[] charArray = word.toCharArray();
		int start=0;
		int end=word.length()-1;
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[start] != charArray[end])
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}