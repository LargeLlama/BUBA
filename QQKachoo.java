//BUBA - Wubin Peco, Max Millar, Bo Lu
//APCS-2 pd02
//LAB xx

import java.util.ArrayList;

public class QQKachoo<D> implements Deque<D> {
	
	private ArrayList<D> _buba;
	
	public QQKachoo() {
		_buba = new ArrayList<D>();
	}

	//constructor for constrained Deque
	//to be completed later
	public QQKachoo(int size) {
		_buba = new ArrayList<D>(size);
	}
	
	public void addFirst(D value) {
		if (_buba.size() > 0)
			_buba.add(0, value);
		else
			_buba.add(value);
	} 
	
	public void addLast(D value) {
		_buba.add(value);
	}

	public D removeFirst() {
		return _buba.remove(0);
	}

	public D removeLast() {
		return _buba.remove(_buba.size() - 1);
	}

	public D getFirst() {
		return _buba.get(0);
	}

	public D getLast() {
		return _buba.get(_buba.size() - 1);
	}

	@Override
	public String toString() {
		return _buba.toString();
	}
	public static void main (String[] args) {
		Deque<String> gummo = new QQKachoo<String>();
		gummo.addFirst("Yeet");
		gummo.addFirst("Yote");
		gummo.addLast("Yate");
		System.out.println(gummo);
	}
}

