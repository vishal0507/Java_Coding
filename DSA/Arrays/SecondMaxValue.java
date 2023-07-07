public class SecondMaxValue{
	public static void main(String[] args)
	{
		int[] arr = {2,33,45,76,2,9,88,73};
		int secondMaximum = findSecondMax(arr);
		System.out.println("The second maximum value in an array is "+secondMaximum);	
	}
	public static int findSecondMax(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secondMax = max;
				max = arr[i];
			}
			else if(arr[i]>secondMax && arr[i] != max)
			{
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
}