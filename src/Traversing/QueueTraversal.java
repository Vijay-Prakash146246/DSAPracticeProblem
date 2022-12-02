package Traversing;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTraversal {
	
	public static void queueTraversal(PriorityQueue<Integer> q)
	{
		Iterator it = q.iterator();	
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		PriorityQueue< Integer> q = new PriorityQueue<>();
		q.add(3);
		q.add(6);
		q.add(7);
		q.add(9);
		queueTraversal(q);
	}

}
