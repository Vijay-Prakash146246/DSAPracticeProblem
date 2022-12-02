package Traversing;

import java.util.Stack;

public class stackTraversal 
{
	public static void stackTraversal(Stack<Integer> s)
	{
		int N = s.size();
		for(int i=0;i<N;i++)
		{
			if(!s.isEmpty()) {
				System.out.print(s.peek() + "  ");
				s.pop();
			}
		}
		System.out.println();
	}
	public static void main(String[]args)
	{
		Stack<Integer> st = new Stack<>();
		st.add(4);
		st.add(5);
		st.add(46);
		st.add(8);
		st.add(9);
		stackTraversal(st);
	}
}
