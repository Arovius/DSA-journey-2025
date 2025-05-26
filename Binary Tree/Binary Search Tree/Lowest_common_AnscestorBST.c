#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
typedef struct Node
{   
    int data;
    struct Node* left;
    struct Node* right;
}Node;
Node* bstConstructor(int ele)
{
    Node* node = (Node*)malloc(sizeof(Node));
    node->data = ele;
    node->left = NULL;
    node->right = NULL;
    return node;
}
Node* insertNode(Node* root, int ele) 
{
    if (root == NULL) 
        return bstConstructor(ele);
    if (ele < root->data) 
        root->left = insertNode(root->left, ele);
     else if (ele > root->data)
        root->right = insertNode(root->right, ele);
    
        return root;
}


// Function to create the BST by getting n elements from the user
Node* createBST()
{
    int n;
    printf("Enter the number of nodes (n): ");
    scanf("%d",&n);
    if(n<=0) 
    {
        printf("Number of nodes must be positive.\n");
        return NULL;
    }
    Node* root = NULL; 
    printf("Enter the %d node values:\n", n);
    for (int i = 0; i < n; i++) 
    {
        int ele;
        printf("Value for node %d: ", i + 1);
        scanf("%d", &ele);
        root = insertNode(root, ele); 
    }
    return root; 
}
void inorder(Node* root)
{
    if(root == NULL)    return;
    inorder(root->left);
    printf("%d ", root->data);
    inorder(root->right);
}
int findLCAHelper(Node* root, int n1, int n2)
{
    if(root == NULL)    return -1;
    if(n1<root->data && n2<root->data)
        return findLCAHelper(root->left, n1, n2);
    else if(n1>root->data && n2>root->data)
        return findLCAHelper(root->right, n1, n2);
    else  
        return root->data;
}
int findLCA()
{
    Node* root = createBST();
    inorder(root);
    printf("Enter the value of n1 : ");
    int n1;     scanf("%d", &n1);
    printf("Enter the value of n2 : ");
    int n2;     scanf("%d", &n2);
    return findLCAHelper(root, n1, n2);
}
int main()
{
    int ans = findLCA();
    printf("%d",ans);
    return 0;
}