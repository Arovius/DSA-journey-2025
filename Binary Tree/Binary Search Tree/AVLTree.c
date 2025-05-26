// #include<stdio.h>
// #include<stdlib.h>
// #include<stdbool.h>
// typedef struct Node{
//     int data;
//     int balance_factor;
//     struct Node* left;
//     struct Node* right;
// }Node;
// Node* bstconstructor(int ele){
//     Node* root = (Node*)malloc(sizeof(Node));
//     root->data = ele;
//     root->left = NULL;
//     root->right = NULL;
//     root->balance_factor = 0;
// }
// int getHeight(Node* root){
//     if(root == NULL){
//         return 0;
//     }
//     return 1 + getHeight(root->left) + getHeight(root->right);
// }
// int maximum(int a, int b){
//     if(a>b) return a;
//     else return b;
// }
// Node* bstcreationHelper(int n, Node* root, int ele){
//     if(root == NULL){
//         root = bstconstructor(ele);
//         return root;
//     }
//     if(ele<root->data){
//         root->balance_factor = maximum(getHeight(root->left) + getHeight(root->right));
//         root->left = bstcreationHelper(n, root->left, ele);
//     }
//     else if(ele>root->data){
//         root->balance_factor = maximum(getHeight(root->left) + getHeight(root->right));
//     }
// }
// Node* bstCreation(){
//     printf("Enter the number of nodes that you want to enter  : ");
//     int n;
//     scanf("%d", &n);
//     Node* root = NULL;
//     for(int i=0; i<n; i++){
//         printf("Enter the node number %d : ", i+1);
//         int ele;
//         scanf("%d", &ele);
//         root = bstcreationHelper(n, root, ele);

//     }
// }
// void main(){
//     Node* root = bstCreation();

// }

// #include<stdio.h>
// #include<stdlib.h>
// #include<stdbool.h>

// typedef struct Tree{
//     int data;
//     int height;
//     struct Tree* left;
//     struct Tree* right;
// }Tree;

//     Tree* __initconstructorBST__(int ele){
//     Tree* root = (Tree*)malloc(sizeof(Tree));
//     root->data = ele;
//     root->left = NULL;
//     root->right = NULL;
//     return root;
// }
// int findMax(int a, int b){
//     if(a>b) return a;
//     else return b;
// }
// int getHeight(Tree* root){
//     if(!root)   return 0;
//     return 1 + findMax(getHeight(root->left) ,getHeight(root->right));
// }
// Tree* rotateRight(Tree* node){
//     Tree* child = node->left;
//     Tree* childRight = child->right;
//     child->right = node;
//     node->left = childRight;
//     node->height = 1 + findMax(getHeight(node->left),getHeight(node->right));
//     child->height = 1 + findMax(getHeight(node->left), getHeight(node->right));
//     return child;
// }

// Tree* rotateLeft(Tree* node){
//     Tree* child = node->right;
//     Tree* childLeft = child->left;
//     child->left = node;
//     node->right = childLeft;
//     node->height = 1 + findMax(getHeight(node->left),getHeight(node->right));
//     child->height = 1 + findMax(getHeight(node->left), getHeight(node->right));
//     return child;
// }
// Tree* createAVLTreeHelper(int ele, Tree* root){
//     if(!root){
//         root = __initconstructorBST__(ele);
//         return root;
//     }
//     if(ele<root->data) root->left = createAVLTreeHelper(ele, root->left);
//     else if(ele>root->data) root->right = createAVLTreeHelper(ele,root->right);
//     else return root;

//     root->height = 1 + findMax(getHeight(root->left),getHeight(root->right));
//     int balance = getHeight(root->left) - getHeight(root->right);

//     if(balance>1 && ele<root->left->data){
//         return rotateRight(root);
//     }
//     else if(balance<-1 && ele>root->right->data){
//         return rotateLeft(root);
//     }
//     else if(balance>1 && ele<root->left->data){
//         root = rotateLeft(root);
//         return rotateRight(root);
//     }
//     else if(balance<-1 && ele>root->right->data){
//         root = rotateRight(root);
//         return rotateLeft(root);
//     }
//     return root;
// }
// Tree* createAVLTree(){
//     printf("Enter the number of nodes that you want to enter : ");
//     int n;
//     scanf("%d", &n);
//     Tree* root = NULL;
//     for(int i=0; i<n; i++){
//         printf("Enter the value of element %d : ", i+1);
//         int ele;
//         scanf("%d", &ele);
//         root = createAVLTreeHelper(ele, root);
//     }
//     return root;
// }
// void inorder(Tree* root){
//     if(!root)   return;

//     inorder(root->left);
//     printf("%d ", root->data);
//     inorder(root->right);
// }
// void main(){
//     Tree* root = createAVLTree();
//     printf("\nThe inorder traversal is : ");
//     inorder(root);
// }
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct Tree {
    int data;
    int height;
    struct Tree* left;
    struct Tree* right;
} Tree;

Tree* __initconstructorBST__(int ele) {
    Tree* root = (Tree*)malloc(sizeof(Tree));
    if (!root) {
        perror("Memory allocation failed");
        exit(EXIT_FAILURE);
    }
    root->data = ele;
    root->left = NULL;
    root->right = NULL;
    root->height = 1;  // Initialize height to 1 for new nodes
    return root;
}

int findMax(int a, int b) {
    return (a > b) ? a : b;
}

// Corrected getHeight: Returns stored height
int getHeight(Tree* root) {
    if (!root) return 0;
    return root->height;
}

// Function to update the height of a node
void updateHeight(Tree* node) {
    if (!node) return;
    node->height = 1 + findMax(getHeight(node->left), getHeight(node->right));
}

Tree* rotateRight(Tree* node) {
    Tree* child = node->left;
    Tree* childRight = child->right;

    // Perform rotation
    child->right = node;
    node->left = childRight;

    // Update heights AFTER rotation
    updateHeight(node);
    updateHeight(child);

    return child;
}

Tree* rotateLeft(Tree* node) {
    Tree* child = node->right;
    Tree* childLeft = child->left;

    // Perform rotation
    child->left = node;
    node->right = childLeft;

    // Update heights AFTER rotation
    updateHeight(node);
    updateHeight(child);

    return child;
}

// Get balance factor
int getBalance(Tree* node) {
    if (!node) return 0;
    return getHeight(node->left) - getHeight(node->right);
}


Tree* createAVLTreeHelper(int ele, Tree* root) {
    if (!root) {
        return __initconstructorBST__(ele);
    }

    if (ele < root->data) {
        root->left = createAVLTreeHelper(ele, root->left);
    } else if (ele > root->data) {
        root->right = createAVLTreeHelper(ele, root->right);
    } else {
        // Duplicate keys not allowed
        return root;
    }

    // Update height of the current node
    updateHeight(root);

    int balance = getBalance(root);

    // Left Left Case
    if (balance > 1 && ele < root->left->data) { // Corrected Condition
        return rotateRight(root);
    }

    // Right Right Case
    if (balance < -1 && ele > root->right->data) { // Corrected Condition
        return rotateLeft(root);
    }

    // Left Right Case
    if (balance > 1 && ele > root->left->data) {
        root->left = rotateLeft(root->left);
        return rotateRight(root);
    }

    // Right Left Case
    if (balance < -1 && ele < root->right->data) {
        root->right = rotateRight(root->right);
        return rotateLeft(root);
    }

    return root;
}

Tree* createAVLTree() {
    printf("Enter the number of nodes that you want to enter: ");
    int n;
    scanf("%d", &n);
    Tree* root = NULL;
    for (int i = 0; i < n; i++) {
        printf("Enter the value of element %d: ", i + 1);
        int ele;
        scanf("%d", &ele);
        root = createAVLTreeHelper(ele, root);
    }
    return root;
}

void inorder(Tree* root) {
    if (root) {
        inorder(root->left);
        printf("%d ", root->data);
        inorder(root->right);
    }
}

int main() {
    Tree* root = createAVLTree();
    printf("\nThe inorder traversal is: ");
    inorder(root);
    printf("\n");
    return 0;
}