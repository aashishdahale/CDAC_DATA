
#include <stdio.h>

#define SIZE 10

int hashArray[SIZE]; 

int hashCode(int key) {
   return key % SIZE;
}

int search(int data) {
   //get the hash 
   int hashIndex = hashCode(data);
	
   //move in array until an empty cell reach
   while(hashArray[hashIndex] != 0 ) 
   {
      if(hashArray[hashIndex] == data)
         return hashIndex;
	 
      //go to next cell
      ++hashIndex;
		
      //wrap around the table
      hashIndex %= SIZE;
   }
   return -1;        
}

void insert(int data) {

   //get the hash 
   int hashIndex = hashCode(data);

   //move in array until an empty or deleted cell
   while(hashArray[hashIndex] != 0 ) 
   {
      //go to next cell
      ++hashIndex;
		
      //wrap around the table
      hashIndex %= SIZE;
   }
   hashArray[hashIndex] = data;
}

void delete(int data) 
{
   //get the hash 
   int hashIndex = hashCode(data);

   //move in array until an empty
   while(hashArray[hashIndex] != 0) {
	
      if(hashArray[hashIndex] == data)
         hashArray[hashIndex] = 0;
	 
      //go to next cell
      ++hashIndex;
		
      //wrap around the table
      hashIndex %= SIZE;
   }
}

void display() {
   int i = 0;
	
   for(i = 0; i<SIZE; i++) {
	
      if(hashArray[i] != 0)
         printf(" (%d,%d)",i,hashArray[i]);
      else
         printf(" (%d,%d)", i,0);
   }
   printf("\n");
}

int main() {
   insert(20);
   insert(70);
   insert(25);
   insert(44);
   insert(32);
   

   display();
   printf("search(32) @ %d\n", search(32));
   delete(32);
   printf("search(32) @ %d\n", search(32));
}
