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
        queue = []

        # Base step
        if root is None:
            return

        # The node exists, process it
        queue.append(root)
        while len(queue) > 0:
            ''' 
                For each of the nodes in the tree, print their value and add 
                their children to the queue to be processed later
            '''
            for i in range(0, len(queue)):
                current_node = queue.pop()
                print(current_node.data, end=" ")
                if(current_node.left is not None):
                    queue.insert(0, current_node.left)
                if(current_node.right is not None):
                    queue.insert(0, current_node.right)  
            



T=int(input())