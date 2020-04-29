package com.myproject.datastructures.practice.linkedlist.singly;

public class SinglyLinkedList {

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

        temp.next = newNode;
    }

    public void insertAtFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void display(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.print(temp.data +" ");
    }

    public void insertAt(int index, int data) {
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        if(index == 0){
            newNode.next =head;
            head = newNode;
            return;
        }

        Node temp = head;

        for(int i = 0;i< index-1;i++){
            if(temp!=null){
                temp = temp.next;
            }
        }

        if(temp !=null){
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            temp.next = newNode;
        }
    }

    public int  get(int index) {

        if(head == null){
            return -1;
        }

        Node temp = head;
        for(int i = 0;i<=index-1;i++){
            temp = temp.next;
        }

        if(temp!=null)
            return temp.data;
        else {
            return -1;
        }
    }

    public void search(int data) {

        boolean b = searchElement(data);
        if(b){
            System.out.println("found element");
        } else {
            System.out.println("not found");
        }

    }

    public boolean searchElement(int data){

        boolean b = false;
        if(head == null){
            return b;
        }

        Node temp = head;
        while(temp.next!=null){
            if(temp.data == data){
                b = true;
                break;
            }
            temp = temp.next;
        }

        if(temp.data == data){
            b = true;
        }

        return b;
    }

    public void deleteFirst() {

        if(head == null){
            System.out.println("list is empty");
            return;
        }

        head = head.next;
    }



    public void delete() {

        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node temp = head;

        if(temp.next == null){
            head = null;
            return;
        }

        while(temp.next!=null && temp.next.next !=null){
            temp = temp.next;
        }

        temp.next = null;


    }

    public void deleteAt(int index) {

        if(head == null){
            System.out.println("list is empty");
            return;
        }

        if(index == 0){
            head = head.next;
            return;
        }

        Node temp = head;

        for(int i = 0;i<index-1;i++){
            if(temp!=null){
                temp = temp.next;

            }
        }

        if(temp!=null && temp.next!=null){
            temp.next = temp.next.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
}
