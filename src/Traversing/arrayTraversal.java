package Traversing;

public class arrayTraversal 
{
	public static void printArray(int[]arr)
	{
		int N = arr.length;
		for (int j : arr) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
	
	public static void main(String[]args)
	{
		int[] arr= {1,2,3,4,5,6,7,8};
		printArray(arr);
	}
}
