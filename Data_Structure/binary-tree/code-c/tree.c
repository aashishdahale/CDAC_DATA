#include <stdio.h>
#include <stdlib.h>


typedef struct _Node
{
	struct _Node *left;
	int data;
	struct _Node *right;
}Node;


Node* insert(Node* ptr, int data)
{
	if(ptr == NULL)
	{
		Node * tmp = (Node*) malloc(sizeof(Node));
		tmp->data = data;
		tmp->left=NULL;
		tmp->right=NULL;
		return tmp;
	}
	else{
		if(data < ptr->data)
		{
			ptr->left = insert(ptr->left, data);
		}
		else if(data > ptr->data)
		{
			ptr->right = insert(ptr->right, data);
		}

	}
	return ptr;
}

void inOrder(Node* ptr)
{
	//LPR
	if(ptr != NULL)
	{
		inOrder(ptr->left);
		printf("%d, ", ptr->data);
		inOrder(ptr->right);
	}
}

Node* search(Node* root, int data)
{
	if(root == NULL || root->data == data)
		return root;

	if(data < root->data)
		search(root->left, data);
	else
		search(root->right, data);
}


int getMinValue(Node* root)
{
	while(root->left)
		root=root->left;

	return root->data;
}

int getMaxValue(Node* root)
{
	while(root->right)
		root=root->right;

	return root->data;
}

void preOrder(Node* ptr)
{
	//PLR
	if(ptr != NULL)
	{
		printf("%d, ", ptr->data);	
		preOrder(ptr->left);
		preOrder(ptr->right);
	}
}

void postOrder(Node* ptr)
{
	//LRP
	if(ptr != NULL)
	{
		postOrder(ptr->left);
		postOrder(ptr->right);
		printf("%d, ", ptr->data);
	}
}


Node* deleteNode(Node* root, int data)
{
	if(root == NULL)
	{
		return NULL;				
	}
	else if (data < root->data)
	{
		root->left = deleteNode(root->left, data);
	}
	else if (data > root->data)
	{
		root->right = deleteNode(root->right, data);	
	}
	else
	{
		//we reached at the node to delete...
		// Now check the scenarios..
		if(root->left == NULL )
		{
			Node *ret = root->right;
			free(root);
			return ret;
		}
		else if(root->right == NULL)
		{	
			Node *ret = root->left;
			free(root);
			return ret;
						
		}
		else
		{
			root->data = getMinValue(root->right);
			root->right=deleteNode(root->right, root->data);
			
		}
		
	}
	return root;
}

int main()
{
	Node *root = NULL;
	Node *root1 = NULL;

	root=insert(root, 22);
	insert(root, 7);
	insert(root, -1);
	insert(root, 12);
	insert(root, 2);
	insert(root, 5);
	insert(root, 4);
	insert(root, 6);
	insert(root, 11);

	preOrder(root);
	printf("\n");

	inOrder(root);
	printf("\n");

	postOrder(root);
	printf("\n");

	printf("MinValue: %d\n", getMinValue(root));
	printf("MaxValue: %d\n", getMaxValue(root));
	
	inOrder(root);
	printf("\n");

	Node* t = search(root, 12);
	if(t)
		printf("t->data: %d\n", t->data);
	else
		printf("Search Number is not present in Tree..\n");

	root = deleteNode(root, 5);

	inOrder(root);
	printf("\n");

}





