package Array.SortingNext;
/*
Q) Sort a nearly sorted (or K sorted) array
Given an array of N elements, where each element is at most K away from its target position,
devise an algorithm that sorts in O(N log K) time.

Input: arr[] = {6, 5, 3, 2, 8, 10, 9}, K = 3
Output: arr[] = {2, 3, 5, 6, 8, 9, 10}

Input: arr[] = {10, 9, 8, 7, 4, 70, 60, 50}, k = 4
Output: arr[] = {4, 7, 8, 9, 10, 50, 60, 70}
* */
public class Q2Sort_a_nearly_sortedArray
{
    public  static  void nearlySort(int[]arr)
    {
        int i,j,key;
        for(i=1;i<arr.length;i++)
        {
            key = arr[i];
            j = i-1;
            while (j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        printArray(arr);
    }
    public static void printArray(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public  static  void  main(String[]args)
    {
        int[]arr = {10, 9, 8, 7, 4, 70, 60, 50};
        nearlySort(arr);
    }
}
