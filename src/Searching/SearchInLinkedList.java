package Searching;

import java.util.LinkedList;

public class SearchInLinkedList {
    public  static  void searchInLinkedList(LinkedList<Integer>li,int target)
    {
        for (Integer integer : li) {
            if (integer.equals(target)) {
                System.out.println("Element Found ");
                return;
            }
        }
        System.out.println("Element Not Found");
    }
    public  static  void main(String[]args)
    {
        LinkedList<Integer>li = new LinkedList<>();
        li.add(12);
        li.add(13);
        li.add(14);
        li.add(15);
        li.add(16);
        searchInLinkedList(li,14);
    }
}
