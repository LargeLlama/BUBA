//BUBA - Wubin Peco, Max Millar, Bo Lu
//APCS-2 pd02
//LAB 02

public class QQKachoo<D> implements Deque<D> {
	
	private LList<D> _buba;
	
	public QQKachoo() {
		_buba = new LList<D>();
	}

	//constructor for constrained Deque
	//to be completed later
	
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

		System.out.println("gummo: " + gummo + "\n");
		
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

