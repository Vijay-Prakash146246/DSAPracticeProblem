package Searching;

import java.util.PriorityQueue;

public class SearchInQueue
{
    public static  void searchInQueue(PriorityQueue<Integer>queue,int target)
    {
        while (!queue.isEmpty())
        {
            if(queue.poll().equals(target)) {
                System.out.println("Element Found");
                return;
            }
        }
        System.out.println("Element Not Found");
    }
    public  static void main(String[]args)
    {
        PriorityQueue<Integer>queue=new PriorityQueue<>();
        queue.add(12);
        queue.add(14);
        queue.add(16);
        queue.add(32);
        queue.add(19);
        queue.add(15);
        queue.add(18);
        searchInQueue(queue,32);
    }
}
