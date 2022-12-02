package Array.ArraysInJava;

public class Q5ReturningArraysfromMethods
{
    public static int[] returnArray()
    {
        int[]arr={1,2,3,4,5,6,7,8,9};
        return arr;
    }
    public static  void  main(String[]args)
    {
        int [] arr1 = returnArray();
        for (int j : arr1) {
            System.out.print(j + "  ");
        }
        System.out.println();
    }
}
