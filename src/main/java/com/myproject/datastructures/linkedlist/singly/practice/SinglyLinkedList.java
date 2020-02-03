package com.myproject.datastructures.linkedlist.singly.practice;

public class SinglyLinkedList {

    Node head;

    public static void main(String args[]) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

      //  list.insertAtFirst(70);
       // list.insertAtFirst(50);


        list.insertAtIndex(1,150);
        list.insertAtIndex(0,50);

        list.display();

        int value = list.get(5);
        System.out.println("for 5 index value is "+value);
       /* list.delete(3);
        System.out.println("after deleteion of 3");
        list.display();*/



        // search
        /*boolean b = list.search(1200);
        if(b) {
            System.out.println("Element is Found");
        }else {
            System.out.println("Element is Not Found");
        }*/
    }

    private int get(int index) {
        if(head == null){
            System.out.println("list is empty");
            return -1;
        }

        Node n = head;
        int value = 0;
        for(int i=0;i<=index;i++){
            if(i == index){
                value = n.value;
                return value;
            }
            n= n.next;
        }
        return -1;
    }

    public void add(int value){

        Node node = new Node(value);
        if(head == null){
            head = node;
        } else {
            Node n = head;
            while(n.next!=null){
                n= n.next;
            }
            n.next = node;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        Node n = head;
        while(n.next!=null) {
            System.out.println(n.value);
            n = n.next;
        }
        System.out.println(n.value);
    }

    private boolean search(int search) {

        if(head == null){
            System.out.println("list is empty");
        }

        Node n = head;
        while(n.next!=null){
            if(search == n.value){
                return true;
            }
            n = n.next;
        }
        return false;
    }

    public void deleteList(){
        head = null;
    }

    public void delete(int index) {

        if(head == null){
            System.out.println("List is empty");
        }

        if(index == 0){
            head = head.next;
            return;
        }

        Node n = head;
        for(int i = 0;i<index-1;i++){
            n = n.next;
        }

        if(n.next !=null) {
            Node deleteNode = n.next;
            n.next = deleteNode.next;
        }
    }

    public void insertAtFirst(int value){

        Node node = new Node(value);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void insertAtIndex(int index, int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            return;
        }

        if(index == 0){
            node.next = head;
            head = node;
            return;
        }

        Node n = head;
        for(int i=0;i<index-1;i++){
            n = n.next;
        }
        node.next=n.next;
        n.next = node;

    }
}
