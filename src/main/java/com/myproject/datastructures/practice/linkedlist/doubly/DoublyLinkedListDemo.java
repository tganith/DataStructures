package com.myproject.datastructures.practice.linkedlist.doubly;

public class DoublyLinkedListDemo {

    public static void main(String args[]){

        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.display();

       /* list.insertAtHead(5);

        System.out.println("\n");
        list.display();
        System.out.println("\n");


        list.insertAt(6,100);

        System.out.println("\n");
        System.out.println("\n");

        list.display();

        System.out.println("\nBackward display");

        list.backwardDisplay();

        System.out.println("\n");
        list.search(100);


        System.out.println("\n get elment:"+list.get(6));*/



     //  list.deleteAt();

     //   list.deleteStart();

   //     System.out.println("\n");

      //  list.deleteAt(5);


        System.out.println("\n");

        list.delete();
        list.delete();
        list.delete();
        list.delete();
      //  list.delete();

        list.display();

    }

}
