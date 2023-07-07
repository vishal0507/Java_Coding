public class MissingNumberInArray{
	public static void main(String[] args)
	{
		int[] arr = {1,4,6,7,2,9,5,8};
		int missingNumber = findMissingNumber(arr);
		System.out.println("The Missing number in an array is "+missingNumber);	
	}
	public static int findMissingNumber(int[] arr)
	{
		int n=arr.length +1;
		int sum = n * (n+1)/2;
		for(int i : arr)
		{
			sum=sum-i;
		}
		return sum;
	}
}