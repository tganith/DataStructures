package com.myproject.datastructures.linkedlist.singly;

import com.myproject.datastructures.linkedlist.singly.LinkedList;

public class LinkedListDemo {

    public static void main(String args[]) throws Exception {

        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

      //  list.insertAtFirst(5);

      //  list.insertAtIndex(3,100);



       int value =  list.get(3);
       System.out.println("get value:"+value);

     //  list.deleteList();

        list.deleteNodeAt(4);

      //  list.deleteNodeLast();

       list.search(50);

       list.display();

    }

}
