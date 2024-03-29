import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

static void levelOrder(Node root){
      //Write your code here
      Queue<Node> mQueue = new LinkedList();

      if(root == null){
          return;
      }

      mQueue.add(root);
      while(mQueue.size() > 0){
          for(int i = 0; i < mQueue.size(); i++ ){
            Node currentNode = mQueue.remove();
            System.out.print(currentNode.data + " ");
            if(currentNode.left != null){
                mQueue.add(currentNode.left);
            }
            if(currentNode.right != null){
                mQueue.add(currentNode.right);
            }
          }
      }      
    }

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}