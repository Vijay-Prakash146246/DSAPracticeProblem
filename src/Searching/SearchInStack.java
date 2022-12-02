package Searching;

import java.util.Stack;

public class SearchInStack
{
    public  static  void searchInStack(Stack<Integer> st,int target)
    {
        while(!st.isEmpty())
        {
            if(st.peek().equals(target))
            {
                System.out.println("Element Found ");
                return;
            }
            st.pop();
        }
        System.out.println("Element Not Found");
    }
    public  static  void  main(String[]args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(14);
        stack.push(16);
        stack.push(18);
        stack.push(20);
        searchInStack(stack,14);
    }
}
