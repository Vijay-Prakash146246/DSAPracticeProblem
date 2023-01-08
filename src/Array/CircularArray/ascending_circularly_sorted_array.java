package Array.CircularArray;
/*
Circularly sorted arrays are arrays that are sorted in ascending or descending order and then rotated by
a number of steps.

Let us take an example to know more about circularly sorted arrays:
Consider an array: arr[] = {23, 34, 45, 12, 17, 19}
The elements here, {12, 17, 19, 23, 34, 45} are sorted ‘In-order’ but they are rotated to the left by 3 times.

Given an array arr[] of length N, the task is to check whether the given array is circularly sorted or not,
we need to check whether the given array is the rotated form of the sorted array.
In ascending circularly sorted array, there will be at most one case where the element
just before the current element will be greater than the current element i.e., arr[ i – 1 ] > arr[ i ].
So we need to count the total existence of such cases and if the count is greater than 1 then the result will
be false else the result will be true meaning that the array is circularly sorted.
* */
public class ascending_circularly_sorted_array
{
    public  static boolean ascending_circularly_sorted_arrayCheck(int[]arr)
    {
        int n = arr.length;
        int count = 0;
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]>arr[i])
                count++;
        }
        if(count<=1)
            return true;
        return false;
    }
    public  static  void main(String[]args)
    {
        int[]arr = { 23, 34, 45, 12, 17, 19 };
        boolean result = ascending_circularly_sorted_arrayCheck(arr);
        if(result)
            System.out.println("The given Array is ascending_circularly_sorted_array");
        else
            System.out.println("The given Array is not ascending_circularly_sorted_array");
    }
}
