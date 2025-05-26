#include<stdio.h>
#include<stdlib.h>

typedef struct bst
{
    int data;
    struct bst *left;
    struct bst *right;
}Tree;

Tree* constructorNode(Tree* node, int ele)
{
    node->data = ele;
    node->left = NULL;
    node->right = NULL;
    return node;
}

//METHODE 1:: Poonam Geera mam

// Tree* createBST()
// {
//     Tree* root = (Tree*)malloc(sizeof(Tree));

//     printf("Enter the number of elements that you want in your tree : ");
//     int n;     scanf("%d", &n);
//     // int* arr = (int*)malloc(sizeof(n));
//     // for(int i=0; i<n; i++)
//     // {
//     //     scanf("%d", &arr[i]);
//     // }
//     for(int i=0; i<n; i++)
//     {
//         int ele;
//         Tree* node = (Tree*)malloc(sizeof(Tree));
//         printf("Enter the value of node %d: ", i+1);
//         scanf("%d", &ele);

//         constructorNode(node, ele);

//         if(root = NULL)
//             root = node;
//         else
//         {
//             Tree* child = node;
//             Tree* parent = node;
//             while(child != NULL)
//             {
//                 parent = child;
//                 if(ele < parent->data)
//                     child = child->left;
//                 else
//                     child = child->right;
//             }
//             if(ele < parent->data)
//                 parent->left = node;
//             else
//                 parent->right = node;
//         }
//     }
//     return;
// }

//METHODE 2:: RECURSSION

Tree* createBSTRecursion(Tree* root,int n, int i)
{
    if(i>n)    return NULL; 
    root = (Tree*)malloc(sizeof(Tree));
    printf("Enter the element number : %d", i+1);
    int ele;    scanf("%d", &ele);
    root->data = ele;
    if(ele< (root->data))   return createBSTRecursion(root->left, n, i+1);
    else   return createBSTRecursion(root->right, n, i+1);
}

void printBST(Tree* root)
{
    if(root == NULL)    return;
    printf("%d ", root->data);
    printBST(root->left);
    printBST(root->right);
}

void main()
{
    Tree* root = NULL;
    // Tree *root =  createBST();
    printf("Enter the value of n : ");
    int n;  scanf("%d", &n);
    root = createBSTRecursion(root, n, 0);
    printBST(root);
}