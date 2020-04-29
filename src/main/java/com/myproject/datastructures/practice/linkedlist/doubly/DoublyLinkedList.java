package com.myproject.datastructures.practice.linkedlist.doubly;

public class DoublyLinkedList {

    Node head;

    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        newNode.prev = temp;
        temp.next = newNode;

    }

    public void display() {

        Node temp = head;
        if(temp == null){
            System.out.println("List is empty");
            return;
        }

        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
    }

    public void insertAtHead(int data) {

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }


        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAt(int index, int data) {
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        if(index == 0){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        for(int i = 0;i<index-1;i++){
            temp = temp.next;
        }


        if(temp!=null && temp.next!=null && temp.next.prev!=null){
            newNode.next = temp.next;
            temp.next.prev = newNode;

            temp.next = newNode;
            newNode.prev = temp;
        } else if(temp!=null){

            newNode.prev = temp;
            temp.next = newNode;
        } else {
            System.out.println("wrong index passed");
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


    public void deleteStart() {

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void deleteAt(int index) {

        Node temp = head;
        if(temp == null){
            System.out.println("List is empty");
            return;
        }

        if(index == 0){
            head = head.next;
            head.prev = null;
            return;
        }

        for(int i = 0;i<index-1;i++){
            temp = temp.next;
        }

        if(temp.next!=null && temp.next.next!=null){
            temp.next.next.prev = temp;
            temp.next = temp.next.next;
        } else if(temp.next!=null){
            temp.next.prev = null;
            temp.next = null;
        } else {
            System.out.println("index not found");
        }

    }

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
}
