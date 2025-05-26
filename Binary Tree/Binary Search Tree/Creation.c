#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

#define MAX 100

typedef struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
}Node;

typedef struct Queue
{
    Node* a[MAX];
    int front;
    int rear;
}Queue;



void constructorQueue(Queue *q)
{
    q = (Queue*)malloc(sizeof(Node));
    q->front = -1;
    q->rear = -1;
}

bool QisFull(Queue* q)
{
    return ((q->rear + 1)% MAX == q->front) ;
}

void enqueue(Queue* q , int ele)
{
    if(QisFull(q)) return;

    q->rear = ele;
    q->rear += 1;
}

Node* createBT_BFS()
{
    Node* root = (Node*)malloc(sizeof(Node));

    Queue q;
    constructorQueue(&q);

    printf("Enter the value of root node : ");
    int ele;    scanf("%d", &ele);
    enqueue(&q, ele);

}

void inOrderTraversal(Node* root)
{
    if(root == NULL)    return;

    inOrderTraversal(root->left);
    printf("%d ", root->data);
    inOrderTraversal(root->right);
}

void main()
{
    Node* root = createBT_BFS();
    inOrderTraversal(root);
}

