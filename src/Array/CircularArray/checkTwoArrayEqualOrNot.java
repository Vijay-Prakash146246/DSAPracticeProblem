package Array.CircularArray;

import java.util.Arrays;
import java.util.HashMap;

public class checkTwoArrayEqualOrNot
{
    //Using Sorting and linear comparing
    public static boolean checkTwoArrayEqualOrNotMethod1(int[]arr1,int[]arr2)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;
        if(n1!=n2)
            return false;
        //sort array
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<n1;i++)
        {
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }

    //using HashMap
    public  static  boolean checkTwoArrayEqualOrNotMethod2(int[]arr1,int[]arr2)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;
        if(n1!=n2)
            return false;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0;i<n1;i++)
        {
            if(hm.get(arr1[i])==null)
            {
                hm.put(arr1[i],1);
            }
            else
            {
                count = hm.get(arr1[i]);
                count++;
                hm.put(arr1[i],count);
            }
        }

        //comparing with 2nd array
        for(int i=0;i<n2;i++)
        {
            if(!hm.containsKey(arr2[i]))
                return false;
            if(hm.get(arr2[i])==0)
                return false;
            count = hm.get(arr2[i]);
            count--;
            hm.put(arr2[i],count);

        }
        return true;
    }
    public  static  void main(String[]args)
    {
        int arr1[] = { 3, 5, 2, 5, 2 };
        int arr2[] = { 2, 3, 5, 5, 2 };
        boolean result = checkTwoArrayEqualOrNotMethod1(arr1,arr2);
        boolean result2 = checkTwoArrayEqualOrNotMethod2(arr1,arr2);
        if(result2)
            System.out.println("Both Array Are Equals");
        else
            System.out.println("Both Array Are Not Equals");
    }
}
