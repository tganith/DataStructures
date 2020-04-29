package com.myproject.datastructures.linkedlist.circular.singly;

public class SinglyLinkedListDemo {

    public static void main(String args[]){

        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);


        list.display();

      /*  list.insertAtFirst(5);
        list.display();

        list.insertAt(0,1);
        list.insertAt(1,2);

        System.out.println();
        list.display();
        System.out.println("\n-----------------------------------");

        list.search(100);*/


   /*     System.out.println("\n-----------------------------------");

        list.insertAt(0,100);
        list.display();
        System.out.println("\n-----------------------------------");

        int value = list.get(6);
        System.out.println("element value is "+value);

        System.out.println("\n-----------------------------------");*/

        System.out.println("\n-----------------------------------");

     //   list.delete();
      //  list.display();

       // list.deleteAt(0);
        list.deleteAt(4);

        list.display();

    }
}
