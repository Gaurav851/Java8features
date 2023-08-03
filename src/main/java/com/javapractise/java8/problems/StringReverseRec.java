package com.javapractise.java8.problems;



public class StringReverseRec {
    Node head; // head of list

    /* Linked list Node*/
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) { data = d; }
    }
    public StringReverseRec insert(StringReverseRec list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);


        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }
//    static void fun(char[] s, int n, int i){
//        if(n<i)return;
//        char temp=s[i];
//        s[i]=s[n];
//        s[n]=s[i];
//        fun(s,n-1, i+1);
//
//    }
//    static String fun1(String s, String s1, int n){
//        if(n<0) {
//            return s1;
//        }
//        s1=s1+s.charAt(n);
//        return fun1(s, s1,n-1);
//    }

    public static void main(String args []){

//        String s="abcdef";
//        int n=s.length();
//        String s1=fun1(s, "",n-1);
//        char[] strArray = s.toCharArray();
//
//        fun(strArray,n-1,0);
//       // for(int i=)
//        System.out.println(s1);

        StringReverseRec list = new StringReverseRec();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);
        list = list.insert(list, 4);
        list = list.insert(list, 5);
        list = list.insert(list, 6);
        list = list.insert(list, 7);
        list = list.insert(list, 8);

        Node node=list.head.next.next.next;
        deleteNode(node);
        Node temp=list.head;
        while(temp.next!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }


    }

    private static void deleteNode(Node node) {
//        node=node.next;
        node=null;
    }
}
