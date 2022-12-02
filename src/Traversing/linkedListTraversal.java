package Traversing;

import java.util.LinkedList;

public class linkedListTraversal {
	public static void linkedListTraversal(LinkedList<Integer> li)
	{
		for(int i=0;i<li.size();i++)
		{
			System.out.print(li.get(i)+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		LinkedList<Integer> li = new LinkedList<>();
		li.add(12);
		li.add(22);
		li.add(42);
		li.add(52);
		li.add(72);
		linkedListTraversal(li);

	}

}
