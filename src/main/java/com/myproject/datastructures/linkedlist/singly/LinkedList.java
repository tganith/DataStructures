package com.myproject.datastructures.linkedlist.singly;

public class LinkedList {

    Node head;

    public static void main(String args[]) throws Exception{

        LinkedList list = new LinkedList();
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.insertAtFirst(10);

        list.insert(50);
        list.insert(60);

        list.insertAt(3,35);

      //  list.deleteAt(5);

        list.display();

         //  list.deleteList();
        //  list.display();

        int value = list.get(2);
        System.out.println("index value of 2 is "+value);
    }

    private int get(int index) throws Exception {

        if(index < 0){
            throw new Exception("index value is not valid");
        }

        if(index == 0){
            return head.value;
        }

        Node n = head;

        for(int i =0;i<index;i++){
            n= n.next;
        }
        return n.value;

    }

    private void deleteList() {
        head = null;
    }

    private void deleteAt(int index) {

        if(index ==0){
            head = head.next;
            return;
        }

        Node n = head;
        for(int i =0;i<index-1;i++){
            n = n.next;
        }
        Node deleteNode = n.next;
        n.next = deleteNode.next;

        // for cleaning up for garbage collection
        deleteNode = null;

    }

    private void insertAt(int index, int value) {
        Node node  = new Node(value);

        if(index == 0){
            insertAtFirst(value);
            return;
        }

        Node n = head;

        for(int i =0;i<index-1;i++){
            n = n.next;
        }
        node.next =n.next;
        n.next = node;
    }

    private void insertAtFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    private void display(){

        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }

        Node n = head;
        while(n.next!=null){
            System.out.println(n.value);
            n = n.next;
        }
        System.out.println(n.value);
    }

    private void insert(int value) {

        Node node = new Node(value);
        if(head == null){
            head = node;
        } else {
            Node n =  head;
            while(n.next!=null) {
                n = n.next;
            }
            n.next = new Node(value);
        }
    }


}
