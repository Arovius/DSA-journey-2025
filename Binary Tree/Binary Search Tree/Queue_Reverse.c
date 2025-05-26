#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

#define MAX 100

typedef struct Queue
{
    int a[MAX];
    int front;
    int rear;
}Queue;

typedef struct stack
{
    int a[MAX];
    int top;
}Stack;

void constructorStack(Stack* s)
{
    s->top = -1;
}

void constructorQueue(Queue* q)
{
    q->front = -1;
    q->rear = -1;
}

bool Q_isEmpty(Queue* q)
{
    return (q->front == -1);
}

bool Q_isFull(Queue* q)
{
    return ((q->rear + 1)%MAX == q->front);
}

void Enqueue(Queue* q, int ele)
{
    if(Q_isFull(q))
    {
        printf("Queue is full! \n");
        return;
    }
    if(Q_isEmpty(q))
    {
        q->front = 0;
    }
    q->rear = (q->rear + 1) % MAX;
    q->a[q->rear] = ele;
}
int Dequeue(Queue* q)
{
    if(Q_isEmpty(q))
    {
        printf("\nQueue is empty.");
        return -1;
    }
    if(q->front == q->rear) {
        int temp = q->a[q->front];
        q->front = -1;
        q->rear = -1;
        return temp;
    }
    int temp = q->a[q->front];
    q->front = (q->front + 1)%MAX;
    return temp;
}


void push(Stack* s , int ele)
{
    if(s->top == MAX-1)
        printf("\nOverflow.");
    
     s->top += 1;
     s->a[s->top] = ele;
}
int pop(Stack* s)
{
    if(s->top == -1) {
        printf("\nUnderflow.");
        return -1;}
    

    return s->a[(s->top)--];
}

Queue* createQueue()
{
    Queue* q = (Queue*)malloc(sizeof(Queue));
    constructorQueue(q);
    printf("Enter the value of n : ");
    int n; scanf("%d", &n);

    for(int i=0; i<n; i++)
    {
        printf("Enter the value of element %d : ", i+1);
        int ele;    scanf("%d", &ele);

        Enqueue(q, ele);
    }
    return q;
}

void reverseQueue(Queue* q)
{
    Stack* s = (Stack*)malloc(sizeof(Stack));
    constructorStack(s);
    while(!Q_isEmpty(q))
    {
        push(s, Dequeue(q));
    }
    while(s->top != -1)
    {
        Enqueue(q, pop(s));
    }
}

void printQueue(Queue* q)
{
    
    for(int i=0; i<=q->rear; i++)
    {
        printf("%d ", q->a[i]);
    }
    printf("\n");
}

int main()
{
    Queue* q = createQueue();
    printf("\nThe queue before reverse is : ");
    printQueue(q);
    printf("\nThe queue after reverse is : ");
    reverseQueue(q);
    printQueue(q);
}