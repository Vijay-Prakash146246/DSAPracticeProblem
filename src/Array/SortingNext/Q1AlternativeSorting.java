package Array.SortingNext;

import java.util.Arrays;

/*
Given an array of integers, print the array in such a way that the first element is first maximum
and second element is first minimum and so on.
* Input : arr[] = {7, 1, 2, 3, 4, 5, 6}
Output : 7 1 6 2 5 3 4

Input : arr[] = {1, 6, 9, 4, 3, 7, 8, 2}
Output : 9 1 8 2 7 3 6 4
* Algorithm
* 1. Sort input array using a O(n Log n) algorithm.
  2. We maintain two pointers, one from beginning and one from end in sorted array.
*    We alternatively print elements pointed by two pointers and move them toward each other.
* */
public class Q1AlternativeSorting
{
    public  static  void  alternativeSorting(int []arr)
    {
        int n = arr.length;
        int i=0,j=n-1;
        Arrays.sort(arr);
        while (i<j)
        {
            System.out.print(arr[j]+" "+arr[i]+" ");
            i++;
            j--;
        }
        if(n%2!=0)
            System.out.print(arr[i]);
        System.out.println();
    }
    public  static  void  main(String[]args)
    {
        int[]arr = {1, 6, 9, 4, 3, 7, 8, 2};
        alternativeSorting(arr);
        int[]arr1 = {7, 1, 2, 3, 4, 5, 6};
        alternativeSorting(arr1);
    }
}
