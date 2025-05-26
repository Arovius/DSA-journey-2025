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
    Node* root = (Node*)malloc(sizeof(Node));
    root->data = ele;
    root->left = NULL;
    root->right = NULL;
    return root;
}
Node* createBSTHelper(Node* root, int ele){
    if(root == NULL){
        Node* root = bstConstructor(ele);
        return root;
    }
    if(ele<root->data)  root->left = createBSTHelper(root->left, ele);

    else root->right = createBSTHelper(root->right, ele);
}
Node* createBST()
{
    printf("\nEnter the number of elements that you want to enter : ");
    int n;
    scanf("%d", &n);
    Node* root = NULL;
    for(int i=0; i<n; i++)
    {
        printf("\nEnter the value of node %d: ", i+1);
        int ele;
        scanf("%d", &ele);
        root = createBSTHelper(root, ele);
    }
    return root;
}
void inRange(Node* root, int l, int u)
{
    if(root == NULL)    return;
    inRange(root->left, l, u);
    if(root->data >= l && root->data <= u)      printf("%d ", root->data);
    inRange(root->right, l, u);
}
void inorder(Node* root)
{
    if(root == NULL)    return;
    inorder(root->left);
    printf("%d ", root->data);
    inorder(root->right);
}
int main()
{
    Node* root = createBST();
    inorder(root);
    printf("\nEnter the lower limit : ");
    int l;
    scanf("%d", &l);
    printf("\nEnter the upper limit : ");
    int u;
    scanf("%d", &u);
    inRange(root, l, u);
    return 0;
}