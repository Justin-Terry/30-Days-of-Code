import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method
        if(head == null) {
            head = new Node(data);
            return head;
        }

        Node tempNode = head;
        while(tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = new Node(data);
        return head;

    }

	public static void display(Node head) {