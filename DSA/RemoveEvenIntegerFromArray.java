public class RemoveEvenIntegerFromArray
{
	public static void main(String[] args)
	{
		int[] arr = {2,54,34,66,87,11,32,64};
		printArray(arr);
		int[] answer = removeEven(arr);
		printArray(answer);
		
	}
	public static void printArray(int answer[])
	{
		for(int i=0;i<answer.length;i++)
		{
			System.out.print(answer[i]+" ");
		}	
	}
	public static int[] removeEven(int[] arr)
	{
		int oddCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 != 0)
			{
				oddCount++;
			}
		}
		int[] result = new int[oddCount];
		int values = 0;
 		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 !=0)
			{
				arr[values]=arr[i];
				values++;
			}
		}
		return result;
	}
}