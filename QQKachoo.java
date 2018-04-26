//BUBA - Wubin Peco, Max Millar, Bo Lu
//APCS-2 pd02
//LAB 02

import dll.LList;
public class QQKachoo<D> implements Deque<D> {
	
    private LList<D> _buba;

    //constructor for our Deque implementation -- utilizes a doubly linked list
    public QQKachoo() {
	_buba = new LList<D>();
    }

    //constructor for constrained Deque
    //to be completed later

    //add given argument to the front of the Deque
    public void addFirst(D value) {
	if (_buba.size() > 0)
	    _buba.add(0, value);
	else
	    _buba.add(value);
    }
    
    //add given argument to the back of the Deque
    public void addLast(D value) {
	_buba.add(value);
    }
    
    //remove the value at the front of the Deque
    public D removeFirst() {
	return _buba.remove(0);
    }

    //removes the value at the end of the Deque
    public D removeLast() {
	return _buba.remove(_buba.size() - 1);
    }

    //returns the value at the front of the Deque
    public D getFirst() {
	return _buba.get(0);
    }

    //returns the value at the end of the Deque
    public D getLast() {
	return _buba.get(_buba.size() - 1);
    }

    //returns whether or not the Deque is empty   
    public boolean isEmpty() {
	return _buba.size() == 0;
    }
    
    @Override
    public String toString() {
	return _buba.toString();
    }

    
    public static void main (String[] args) {
	Deque<String> gummo = new QQKachoo<String>();
	//testing addFirst and addLast
	gummo.addFirst("Yeet");
	gummo.addFirst("Yote");
	gummo.addLast("Yate");
	gummo.addLast("Yute");
	gummo.addFirst("Yite");

	System.out.println("gummo: " + gummo + "\n");//expecting Yite, Yote, Yeet, Yate, Yute
	
	System.out.println("TESTING removeFirst()");
	//testing removeFirst()
	while(!gummo.isEmpty()){
	    System.out.println(gummo.removeFirst());
	}

	gummo.addFirst("Yeet");
	gummo.addFirst("Yote");
	gummo.addLast("Yate");
	gummo.addLast("Yute");
	gummo.addFirst("Yite");

	System.out.println("gummo: " + gummo + "\n");

	System.out.println("TESTING removeLast()");
	//testing removeLast()
	while(!gummo.isEmpty()){
	    System.out.println(gummo.removeLast());
	}

		
    }
}

