public class MoveZerosEndOfArray{
	public static void main(String[] args)
	{
		int[] arr = {0,33,0,76,0,9,0,73};
		findSecondMax(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");	
		}
		

	}
	public static void findSecondMax(int[] arr)
	{
		int n= arr.length;
		int j = 0;
		for(int i =0;i<n;i++)
		{
			if(arr[i]!=0 && arr[j]==0)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j] != 0)
			{
				j++;
			}
		}
	}
}