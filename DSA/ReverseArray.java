public class ReverseArray
{
	public static void main(String[] args)
	{
		int[] arr = {5,4,6,8,1,29,10};
		reverseArray(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void reverseArray(int numbers[],int start,int end)
	{
		while(start<end)
		{
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;
			start++;
			end--;
		}
	}
}