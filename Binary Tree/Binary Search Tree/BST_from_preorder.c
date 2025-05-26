#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

typedef struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
}Node;

Node* TreeConstructor()
{
    Node* root = (Node*)malloc(sizeof(Node));

}

Node* treeCreation(int* arr, int n)
{

}



void main()
{
    printf("Enter the value of n : ");
    int n;
    scanf("%d", &n);
    int *arr = (int*)malloc(n*sizeof(int));
    printf("\nEnter the preorder : ");
    for(int i=0; i<n; i++)
    {
        scanf("%d", &arr[i]);
    }
    Node* root = NULL;
    root = treeCreation(arr, n);
}