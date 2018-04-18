# BUBA  
## Rubin Peci, Max Millar, Bo Lu  


### Current implementention of Deque  
ArrayList (SUBJECT TO CHANGE)  
Other possible consideration: doubly-linked list


#### To-Do list
1. Finalize which collection-type we will use  
2. Code the basic methods necessary  
3. Once basic methods confirmed to work, begin work on "special value methods" as indicated in Java API  
4. $$$$$

#### Development Plan  

Our current state is a working Deque with the very basic Deque methods implemented, using an ArrayList to contain it.  

We are still not sure if this is the most effective way to go about implementing Deque, and as a result we will consider other options, specificially the doubly-linked list.  

We did notice that the doubly-linked list has built-in methods for addFirst() and whatnot, which may be a point of interest in looking at and confirming that they work as we expect them to.  

Currently, with our setup, add and removing at the beginning results in a runtime that isn't constant, which is why we are looking into other options.
