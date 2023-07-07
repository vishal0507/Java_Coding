public class ResizeArray{
	public static void main(String[] args)
	{
		int[] arr = {2,33,45,76,2,9,88,73};
		arr= resize(arr,arr.length*2);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] resize(int[] arr,int capacity)
	{
		int[] temp = new int[capacity];
		for(int i=0;i<arr.length;i++)
		{
			temp[i] = arr[i];
		}
		return temp;
	}
}