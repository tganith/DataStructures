package com.myproject.datastructures.linkedlist.circular.singly;

public class SinglyLinkedList {

    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next!= head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while(temp.next!=head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }

        newNode.next = head;
        head = newNode;
        temp.next = head;
    }

    public void insertAt(int index, int data) {
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        if(index == 0){
            while(temp.next!=head){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
            return;
        }

        for(int i =0;i<index-1;i++){
            if(temp.next == head){
                System.out.println("Failed to insert  element. its wrong index");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void search(int data) {
        boolean b = searchElement(data);
        if(b){
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }

    private boolean searchElement(int data) {
        boolean b = false;

        Node temp = head;
        if(temp == null){
            return false;
        }

        while(temp.next!= head){
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

    public int get(int index) {
        if(head == null){
            System.out.println("List is empty");
            return -1;
        }

        Node temp = head;
        for(int i = 0;i<index;i++){
            if(temp.next == head){
                System.out.println("its wrong index");
                return -1;
            }
            temp = temp.next;
        }



        return temp.data;
    }

    public void delete() {
        if(head == null){
            return;
        }

        Node temp = head;

        if(temp.next == head){
            head = null;
            return;
        }

        while(temp.next.next!=head){
            temp = temp.next;
        }
        temp.next = head;
    }

    public void deleteAt(int index) {

        if(head == null){
            return;
        }

        Node temp = head;
        if(index == 0){
            while(temp.next!=head ){
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        }

        for(int i =0;i<index-1;i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }


    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
}
