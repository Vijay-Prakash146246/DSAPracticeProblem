package Array.ArraysInJava;

public class Q4PassingArraysToMethods
{
    public  static  long sum(int[]arr)
    {
        long sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return  sum;
    }
    public  static  void  main(String[]args)
    {
        int[]arr={1,2,3,4,5,6,7,8};
        System.out.println("Sum of array Element : "+ sum(arr));
    }
}
