package Array.ArraysInJava;

public class Q6CloningOfArrays
{
    public  static  void  main(String[]args)
    {
        int[]arr={1,2,3,4,5,6,7,8,9};
        int[]cloneArr=arr.clone();
        System.out.println(arr==cloneArr);
        System.out.println(arr.equals(cloneArr));
        for (int j : cloneArr) {
            System.out.print(j + " ");
        }
        System.out.println();


        int[][]arr1={{1,2,3,4},{5,6,7,8,9}};
        int [][]cloneArr1=arr1.clone();
        System.out.println("\nMultidimensional Array Clone Ans \n");
        System.out.println(arr1==cloneArr1);
        System.out.println(arr1.equals(cloneArr1));
        System.out.println(arr1[0]==cloneArr1[0]);
        System.out.println(arr1[1]==cloneArr1[1]);
    }
}
