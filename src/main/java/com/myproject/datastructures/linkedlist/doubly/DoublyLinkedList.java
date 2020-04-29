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

  // delete last element
    public void  delete() {
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty");
            return;
        }

        while(temp.next!=null && temp.next.next!=null){
            temp = temp.next;
        }

        if(temp.next!=null) {
            temp.next.prev =null;
            temp.next = null;
        } else {
            head = null;
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

    public void backwardDisplay() {

        Node temp = head;
        if(temp == null){
            System.out.println("List is empty");
            return;
        }

        while(temp.next!=null){
            temp = temp.next;
        }

        Node backward = temp;

        while(backward.prev!=null){
            System.out.print(backward.data+" ");
            backward = backward.prev;
        }

        System.out.print(backward.data+" ");
    }

    public void display(){

        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node temp =  head;

        while(temp.next !=null){
           System.out.print(temp.data+" ");
           temp = temp.next;
        }
        System.out.print(temp.data+" ");
    }


    public void search(int data){
        boolean b = searchElement(data);
        if(b){
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }

    public boolean searchElement(int data) {
        boolean b = false;

        Node temp = head;
        if(temp == null){
            System.out.println("List is empty");
            return b;
        }

        while (temp.next != null) {
            if (data == temp.data) {
                b = true;
                break;
            }
            temp = temp.next;
        }

        if(data == temp.data){
            b = true;
        }



        return  b;
    }

    public int get(int index) {

        Node temp = head;
        if(temp == null){
            System.out.println("List is empty");
            return -1;
        }

        for(int i = 0;i<index;i++){
            if(temp!=null){
                temp = temp.next;
            }
        }

        if(temp!=null){
            return temp.data;
        } else {
            System.out.println("data not found for this index");
            return -1;
        }

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
