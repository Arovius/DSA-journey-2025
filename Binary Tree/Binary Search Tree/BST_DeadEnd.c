#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
typedef struct Node{
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
Node* createBSTHelper(Node* root, int ele)
{
    if(root == NULL){
        root = bstConstructor(ele);
        return root;
    }
    if(ele<root->data)  root->left = createBSTHelper(root->left, ele);
    else if(ele>root->data) root->right = createBSTHelper(root->right, ele);
    else return root;
}
Node* createBST()
{
    printf("Enter the number of nodes that you want to enter : ");
    int n;
    scanf("%d", &n);
    Node* root = NULL;
    for(int i=0; i<n; i++){
        printf("\nEnter the value of node %d : ", i+1);
        int ele;
        scanf("%d", &ele);
        root = createBSTHelper(root, ele);
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
bool findDeadEnd(Node* root)
{
    if(!root->left && !root->right) return true;
    
    else return (findDeadEnd(root->left) || findDeadEnd(root->right));
}
int main()
{
    Node* root = createBST();
    inorder(root);
    if(findDeadEnd(root))
        printf("true");
    else
        printf("false");
}