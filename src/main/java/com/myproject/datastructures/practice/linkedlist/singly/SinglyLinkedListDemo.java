package com.myproject.datastructures.practice.linkedlist.singly;

public class SinglyLinkedListDemo {

    public static void main(String args[]) {


        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.display();
        System.out.println();


      /*  list.insertAtFirst(5);

        list.insertAt(5,100);

        System.out.println();

        list.display();
*/
      //  System.out.println("\nget element: "+list.get(5));

      //  list.search(100);

     //   list.delete();

    //    list.deleteAt(0);

    //    list.deleteFirst();
        /*list.delete();
        list.delete();
        list.delete();
        list.delete();

        list.delete();*/


        list.deleteAt(1);

        list.display();
    }
}
