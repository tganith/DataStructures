package com.myproject.datastructures.linkedlist.singly;

public class LinkedList {

    Node head;


    public void insert(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        } else {
            Node tempHead = head;

            while(tempHead.next != null){
                tempHead = tempHead.next;
            }
            tempHead.next = newNode;

        }


    }

    public void display() {

         if(head == null){
             return;
         }

         Node temp = head;
         while(temp.next != null){
             System.out.println(temp.data);
             temp = temp.next;
         }
         System.out.println(temp.data);

    }

    public void insertAtFirst(int data) {

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void insertAtIndex(int index, int data) {

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        } else{
            if(index == 0){
                newNode.next = head;
                head = newNode;
            } else {

                Node  temp = head;

                int count = 1;

                while(temp.next !=null){
                    if(count == index) {
                        newNode.next = temp.next;
                        temp.next = newNode;
                        return;
                    } else {
                        count++;
                        temp = temp.next;
                    }

                }


            }
        }

    }

    public int get(int index) throws Exception {

        if(head == null){
            throw new Exception("LinkedList is empty");
        }

        Node temp = head;
        for(int i =0 ;i<index;i++){
               if(temp!=null) {
                   temp = temp.next;
               }

        }

        if(temp !=null ){
            return temp.data;
        } {
            throw new Exception("Not Found Element");
        }
    }

    public void deleteList() {
        head = null;
    }

    public void deleteNodeAt(int index) {
        if(head == null){
            return;
        }

        if(index == 0){
            head = head.next;
            return;
        }

        Node temp = head;
        for(int i = 0;i<index-1;i++){
            temp = temp.next;
        }

        if(temp.next!=null){
            temp.next = temp.next.next;
        } else {
            temp.next = null;
        }
    }

    public void deleteNodeLast() {

        if(head == null){
            return;
        } else {

            Node temp = head;

            if(temp.next==null){
                head = null;
                return;
            }

            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next = null;
        }

    }

    public void search(int data) {

        if(head == null){
            return;
        }

        Node temp = head;
        boolean  b = false;
        while(temp.next!=null){

            if(temp.data == data){
               b = true;
               break;
            }
            temp = temp.next;
        }


        if(temp.data == data || b){
            System.out.println("data is found in list");
        } else {
            System.out.println("data not found in list");
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
