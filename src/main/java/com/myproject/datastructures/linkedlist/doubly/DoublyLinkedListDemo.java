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

        System.out.println("\n----------------------------");

     /*   list.insertAtFirst(50);

        list.display();*/
  /*      list.deleteAtIndex(4);
        list.deleteAtIndex(3);
        list.deleteAtIndex(2);
        list.deleteAtIndex(1);
     //   list.deleteAtIndex(0);*/
   //     list.deleteAtIndex(4);

     //   list.delete();
        list.display();

        System.out.println("\n----------------------------");


        list.backwardDisplay();

        System.out.println("\n----------------------------");

        list.search(100);

        System.out.println("\n----------------------------");

        System.out.println("\n get elment:"+list.get(4));
    }


}
