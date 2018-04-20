//BUBA - Wubin Peco, Max Millar, Bo Lu
//APCS-2 pd02
//LAB xx

public interface Deque<Card> {

    //add given argument to the front of the Deque
    public void addFirst(Card value);

    //add given argument to the back of the Deque 
    public void addLast(Card value);

    //remove the value at the front of the Deque
    public Card removeFirst();

    //removes the value at the end of the Deque   
    public Card removeLast();

    //returns the value at the front of the Deque
    public Card getFirst();

    //returns the value at the end of the Deque
    public Card getLast();

    //returns whether or not the Dequeue is empty
    public boolean isEmpty();

    //adding special value methods later
}
