package com.myproject.datastructures.linkedlist.doubly;

public class DoublyLinkedList {

    Node head;


    public void insert(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        } else {

            Node temp = head;

            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.prev = temp;

        }

    }

    public void insertAtFirst(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void deleteAtIndex(int index){


        if(head == null){
            System.out.println("list is empty");
            return;
        }

        if(index == 0){
            head = head.next;
        } else {
             Node temp = head;
             for(int i = index-1;i>0;i--){
                 temp = temp.next;
             }

             if(temp.next.next != null){
                 temp.next = temp.next.next;
                 temp.next.prev = temp;
             } else {
                 temp.next = null;
             }

        }


    }



    public void display(){

        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node temp =  head;

        while(temp.next !=null){
           System.out.println(temp.data);
           temp = temp.next;
        }
        System.out.println(temp.data);
    }



    static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

    }


}
