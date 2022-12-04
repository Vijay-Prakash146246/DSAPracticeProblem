package Array.SortingNext;
/*
Sort an array according to absolute difference with given value
Given an array of N distinct elements and a number x, arrange array elements according to the
absolute difference with x, i. e., an element having minimum difference comes first, and so on.
Note: If two or more elements are at equal distances arrange them in the same sequence as in the given array.
Input: x = 7, arr[] = {10, 5, 3, 9, 2}
Output: arr[] = {5, 9, 10, 3, 2}
Explanation:
7 – 10 = 3(abs)
7 – 5 = 2
7 – 3 = 4
7 – 9 = 2(abs)
7 – 2 = 5
So according to the difference with X,
elements are arranged as 5, 9, 10, 3, 2.

Input: x = 6, arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 4, 3, 2, 1}
* */
public class Q3SortArrayOnAbsoluteDifference
{
    public static  void SortArray(int[]arr,int target)
    {
        int n=arr.length;
        int[]newArr=new int[n];
        //calculating the absolute difference
        for(int i=0;i<n;i++)
        {
            newArr[i]=Math.abs(arr[i]-target);
        }

        //sorting functionality
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(newArr[j]>newArr[j+1])
                {
                    swap(newArr,j,j+1);
                    swap(arr,j,j+1);
                }
            }
        }
        print(arr);
    }

    public  static  void swap(int[]arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[]arr)
    {
        System.out.println("Sorted Element are :- ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
        int[]arr = {10, 5, 3, 9, 2};
        int target = 7;
        SortArray(arr,target);
        int [] arr1 = {1, 2, 3, 4, 5};
        int target1 = 6;
        SortArray(arr1,target1);
    }
}
