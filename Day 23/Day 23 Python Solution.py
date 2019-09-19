import sys

class Node:
    def __init__(self,data):
        self.right=self.left=None
        self.data = data
class Solution:
    def insert(self,root,data):
        if root==None:
            return Node(data)
        else:
            if data<=root.data:
                cur=self.insert(root.left,data)
                root.left=cur
            else:
                cur=self.insert(root.right,data)
                root.right=cur
        return root

    def levelOrder(self,root):
        #Write your code here
        height = self.getHeight(root)
        for i in range(0, height+1):
            self.printLevel(root, i)
    
    def printLevel(self, root, level):
        if root is None:
            return
        if level == 0:
            print(root.data, end=" ")
        elif level > 0:
            
            self.printLevel(root.left, level-1)
            self.printLevel(root.right, level-1)


    # Reused from previous challenge
    def getHeight(self,root):
        left = 0;
        right = 0;

        if(root == None):
            return 0;
        if root.left is not None:
            left = self.getHeight(root.left) + 1
        if root.right is not None:
            right = self.getHeight(root.right) + 1

        return max(left, right)



T=int(input())