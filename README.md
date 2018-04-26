# BUBA  
## Rubin Peci, Max Millar, Bo Lu  


### Current implementention of Deque  
Doubly-linked list


#### To-Do list
1. [x] Finalize which collection-type we will use 
	- We will use a LList that we have made in HW25
2. [x] Work through the Deque interface method by method. We chose these methods, because they're all thats necessary for a Deque to run properly.
	- addFirst() - use the add at index 0  
	- addLast() - use the add() method  
	- removeFirst() - remove() at index 0  
	- removeLast() - remove() at index size - 1    
	- getFirst() - get() index 0  
	- getLast() - get() index size - 1  
	- isEmpty() - return size == 0  
3.(tentative) Once basic methods confirmed to work, begin work on "special value methods" as indicated in Java API  
4. $$$$$

#### Development Plan  

~~Our current state is a working Deque with the very basic Deque methods implemented, using an ArrayList to contain it.~~  

~~We are still not sure if this is the most effective way to go about implementing Deque, and as a result we will consider other options, specificially the doubly-linked list.~~  

~~We did notice that the doubly-linked list has built-in methods for addFirst() and whatnot, which may be a point of interest in looking at and confirming that they work as we expect them to.~~  

~~Currently, with our setup, add and removing at the beginning results in a runtime that isn't constant, which is why we are looking into other options.~~  

##### Haha late April Fools, ArrayList is not good for our Deque
We ended up using a doubly-linked list, but the implementation was the same. We find that the runtime is constant for this case as the shifting of the entire collection is not necessary when removing or adding at the beginning - the only time a doubly-linked list won't have a constant runtime is when one must add in the middle of the collection, but that is never the case in the Deque. Because of this, the runtime when using a doubly linked list, will be much quicker than using an ArrayList, hence our choice. 

We only have to worry about the beginning and the end of the collection for Deque, which is about as easy as simply setting the next node or the previous node to null. Both of these can be done easily with the methods that we wrote in LList, AND has efficient runtimes.

However, one con to using a doubly linked node would appear if we were to implement the specialized methods in Deque(those that needed size constraints to run, ie. offerFirst(), offerLast() ). Doubly linked nodes aren't that good at visualizing an actual "storage restraint", because there are no limits to the size of a doubly linked node(other than memory costs), without adding it. An ArrayList on the other hand, is instantiated with a size "limit" already, so that implementation would be more accurate to the Deque that has the specialized methods.
