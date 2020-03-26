package com.myproject.datastructures.design;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {


    Node head;
    Node tail;
    int capacity;
    int size;
    Map<Integer,Integer> map;

    LRUCache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
    }




    public void put(int key) {

         if(map.containsKey(key)){
       //      remove(key);
             add(key);
         } else {
             add(key);
         }

    }

    private void add(int key) {
        Node newNode = new Node(key);

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
