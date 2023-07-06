public class MinimumValueInArray{
	public static void main(String[] args)
	{
		int[] arr = {4,2,7,6,9};
		int minimumValue = findMinimum(arr);
		System.out.println("Minimum Value in an array is"+ minimumValue);
	}
	public static int findMinimum(int[] arr)
	{
		int min = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		return min;
	}
}