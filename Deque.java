//BUBA - Wubin Peco, Max Millar, Bo Lu
//APCS-2 pd02
//LAB xx

public interface Deque<Card> {
	
	public void addFirst(Card value);
	
	public void addLast(Card value);

	public Card removeFirst();

	public Card removeLast();

	public Card getFirst();

	public Card getLast();

	public boolean isEmpty();

	//adding special value methods later
}
