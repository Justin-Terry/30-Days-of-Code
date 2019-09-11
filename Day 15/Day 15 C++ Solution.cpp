#include <iostream>
#include <cstddef>
using namespace std;	
class Node
{
    public:
        int data;
        Node *next;
        Node(int d){
            data=d;
            next=NULL;
        }
};
class Solution{
    public:

      Node* insert(Node *head,int data)
      {
          //Complete this method
        if(head == NULL) {
            head = new Node(data);
            return head;
        }

        Node *tempNode = head;
        while(tempNode->next != NULL) {
            tempNode = tempNode->next;
        }
        tempNode->next = new Node(data);
        return head;
      }

      void display(Node *head)