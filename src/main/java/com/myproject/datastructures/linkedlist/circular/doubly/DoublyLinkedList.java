package com.myproject.datastructures.linkedlist.circular.doubly;

public class DoublyLinkedList {

    Node head;

    public void insert(int index) {

        Node newNode = new Node(10);

        if(head == null){
            head = newNode;
            return;
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
