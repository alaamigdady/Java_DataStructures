package com.company;

public class LinkedList {

    public Node head;
    public Node tail;

    public void addToTail(int data) {
        LinkedList.Node newTail = new LinkedList.Node();

        if (head==null){
            head=new Node();
            head.data=data;
            tail=new Node();
            tail.data=data;
        }
        else
        {
        newTail.data=data;
        tail.next=newTail;
        tail=newTail;
            if(head.next==null) head.next = newTail;
        }

    }

    public boolean contains(int value) {
        if(head.data==value) return true;
        LinkedList.Node x=head;
        while(x.next!=null){
            if(x.data==value) return true;
            x=x.next;
        }

        //your code is here
        return false;
    }

    public int removeHead() {
        //your code is here
        int y=head.data;
        head=head.next;
        return y;
    }
//
//    public void printList() {
//        //your code is here
//    }

//    public int getHead() {
//        //your code is here
//    }

    public class Node {
        //your code is here
        public Node next ;
        public int data;


    }

}
