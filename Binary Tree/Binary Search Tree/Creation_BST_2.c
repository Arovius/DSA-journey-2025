#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
} Node;

Node *constructorNode(int ele)
{
    Node *node = (Node *)malloc(sizeof(Node));
    node->data = ele;
    node->left = NULL;
    node->right = NULL;
    return node;
}

Node *insertNode(Node *root, int ele)
{
    if (root == NULL)
    {
        root = constructorNode(ele);
        return root;
    }
    Node *parent = NULL;
    Node *child = NULL;
    child = root;

    while (child != NULL)
    {
        parent = child;

        if (ele < child->data)
            child = child->left;
        else
            child = child->right;
    }
    if (ele < parent->data)
        parent->left = constructorNode(ele);

    else
        parent->right = constructorNode(ele);

    return root;
}

void inorder(Node *root)
{
    if (root == NULL)
        return;

    inorder(root->left);
    printf("%d ", root->data);
    inorder(root->right);
}
bool isPresent(Node *root, int ele)
{
    if (root == NULL)
        return false;
    if (root->data == ele)
        return true;
    if (ele < root->data)
        return isPresent(root->left, ele);
    else if (ele > root->data)
        return isPresent(root->right, ele);
}
Node *deleteNode(Node *root)
{
    printf("Enter the number that you want to delete : ");
    int ele;
    scanf("%d", &ele);
    if (!isPresent(root, ele))
    {
        printf("\nNumber not found in the tree.");
        return NULL;
    }
    Node *parent = root;
    Node *child = root;
    while (child != NULL)
    {
        if (ele < child->data)
        {
            parent = child;
            child = child->left;
        }
        else if (ele > child->data)
        {
            parent = child;
            child = child->right;
        }
        else
            break;
    }
    if (!child->left || !child->right)
    {
        if (parent->left == child)
        {
            parent->left = child->right ? child->right : child->left;
            child->left = NULL;
            child->right = NULL;
            free(child);
            return root;
        }
        else
        {
            parent->right = child->right ? child->right : child->left;
            child->left = NULL;
            child->right = NULL;
            free(child);
            return root;
        }
    }
    // Case 2: Two childs
    else
    {
        Node *succ = child->right;
        Node *succ_par = NULL;
        while (succ->left)
        {
            succ_par = succ;
            succ = succ->left;
        }
        child->data = succ->data;
        if (succ == child->right)
        {
            child->right = succ->right;
            succ->right = NULL;
            free(succ);
        }
        else
        {
            succ_par->left = succ->right;
            succ->right = NULL;
            free(succ);
        }
        return root;
    }
    return root;
}

void main()
{
    Node *root = NULL;
    printf("Enter the number of elements that you want to insert : ");
    int n;
    scanf("%d", &n);

    printf("Enter value of nodes :  ");
    for (int i = 0; i < n; i++)
    {
        int ele;
        scanf("%d", &ele);
        root = insertNode(root, ele);
    }
    printf("The inorder of Tree is : ");
    inorder(root);
    deleteNode(root);
}