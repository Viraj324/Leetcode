/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

class Main {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node temp = new Node(data); // Fixed the parameter passed to Node constructor
        if (head == null) {
            head = tail = temp; // Fixed the assignment
        }
        temp.next = head;
        head = temp;
    }
    
public void addLast(int data) {
    Node temp = new Node(data);
    if (head == null) {
        head = tail = temp;
    } else {
        tail.next = temp;
        tail = temp;
    }
}

public void removeLast(){
    Node current =  head;
    Node prev = current;
    if(head == null){
        System.out.println("The linkedList is empty....");
    }
    else if(head == tail){
            System.out.println("The Node Deleted at First Position : "+head.data);
            head = tail = null;
    }
    
    while(current.next!= null){
        prev = current;
        current = current.next;
    }
    
    System.out.println("The Node Deleted at Last Position : "+current.data);
    tail = prev;
    prev.next = null;
}

public  void printll(){
    if(head == null){
        System.out.println("The linkedList is empty....");
    }
    Node temp = head;
    while(temp != null){
        System.out.println(temp.data);
        temp = temp.next;
    }
}

    
    
    public void addAtMiddle(int data,int index){
        Node newNode  = new Node(data);
        Node temp = head;
        for(int i =0;i<index;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void removeFirst(){
        if(head == null){
            System.out.println("The LinkedList is empty...");
            return;
        }
        else if(head == tail){
            System.out.println("The Node Deleted at First Position : "+head.data);
            head = tail = null;
        }
        else{
            System.out.println("The Node Deleted at First Position : "+head.data);
            head = head.next;
        }
        
    }



    public static void main(String[] args) {
        Main ll = new Main();
        ll.addFirst(2);
        ll.addFirst(1);
        //System.out.println(head.data);
        ll.addLast(4);
        ll.addLast(5);
        //System.out.println(tail.data);
        ll.printll();
        System.out.println("LinkedList After Insertion In middle");
        ll.addAtMiddle(3,2);
        ll.printll();
        System.out.println("LinkedList After Deleteion In First Place..");
        ll.removeFirst();
        ll.printll();
        System.out.println("LinkedList After Deleteion In Last Place..");
        ll.removeLast();
        ll.printll();
        
    }
}

