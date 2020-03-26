package com.myproject.datastructures.linkedlist.doubly;

public class DoublyLinkedListDemo {

    public static void main(String args[]) {

        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtFirst(50);
        list.insert(100);
        list.insert(200);
        list.insert(300);
        list.insert(400);

        list.display();

        System.out.println("----------------------------");

     /*   list.insertAtFirst(50);

        list.display();*/
        list.deleteAtIndex(4);
        list.deleteAtIndex(3);
        list.deleteAtIndex(2);
        list.deleteAtIndex(1);
     //   list.deleteAtIndex(0);
   //     list.deleteAtIndex(4);
        list.display();
    }


}
