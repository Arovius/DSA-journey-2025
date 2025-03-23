class Node :
    def __init__(self , data) :
        self.data = data
        self.left = None
        self.right = None

def CreateBinaryTree() :
    root = Node(0)
    root.data = int(input("Please enter data of root : "))
    QueueNode = []
    QueueNode.append(root)
    while QueueNode :
        temp = QueueNode[0]
        QueueNode.pop(0)
        first = int(input(f"Please enter the left child of {temp.data} : "))
        if first != -1 :
            temp.left = Node(first)
        second = int(input(f"Please enter the right child of {temp.data} : "))
        if second != -1 :
            temp.right = Node(second)
        if temp.left :
            QueueNode.append(temp.left)
        if temp.right :
            QueueNode.append(temp.right)
    return root

def PreOrder(root) :
    if not root :
        return
    print(root.data , end = " ")
    PreOrder(root.left)
    PreOrder(root.right)

def InOrder(root) :
    if not root :
        return
    InOrder(root.left)
    print(root.data , end = " ")
    InOrder(root.right)

def PostOrder(root) :
    if not root :
        return
    PostOrder(root.left)
    PostOrder(root.right)
    print(root.data , end = " ")

root = CreateBinaryTree()
PreOrder(root)
print("")
InOrder(root)
print("")
PostOrder(root)
print("")
