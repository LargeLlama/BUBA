# BUBA  
## Rubin Peci, Max Millar, Bo Lu  


### Current implementention of Deque  
ArrayList (SUBJECT TO CHANGE)  
Other possible consideration: doubly-linked list


#### To-Do list
1. [x] Finalize which collection-type we will use 
	- We will use a LList that we have made in HW25
2. [x] work through the Deque interface method by method
	- addFirst() - use the add at index 0  
	- addLast() - use the add() method  
	- removeFirst() - remove() at index 0  
	-  removeLast() - remove() at index size - 1    
	-  getFirst() - get() index 0  
	-  getLast() - get() index size - 1  
	-  isEmpty() - return size == 0  
3. Once basic methods confirmed to work, begin work on "special value methods" as indicated in Java API  
4. $$$$$

#### Development Plan  

~~Our current state is a working Deque with the very basic Deque methods implemented, using an ArrayList to contain it.~~  

~~We are still not sure if this is the most effective way to go about implementing Deque, and as a result we will consider other options, specificially the doubly-linked list.~~  

~~We did notice that the doubly-linked list has built-in methods for addFirst() and whatnot, which may be a point of interest in looking at and confirming that they work as we expect them to.~~  

~~Currently, with our setup, add and removing at the beginning results in a runtime that isn't constant, which is why we are looking into other options.~~  
