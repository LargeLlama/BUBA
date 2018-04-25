/*  Team SAW - Shayan Chowdhury, Addison Huang, William Lu
    APCS2 pd2
    L02 -- All Hands on Deque!
    2018-4-20 F */

public class DequeTester2 {
    
    public static void main(String[] args) {
	
	Deque josh= new QQKachoo<Integer>();
	
	System.out.println("adding ints [0,9) to josh at the front.....");
	for (int i = 0; i < 10; i++) { 
	    josh.addFirst(i);
	    System.out.println(josh.getFirst());
	    //should print 0, 1, 2 ... 9
	}

	System.out.println( "josh: " + josh );
	
	System.out.println("adding ints [10,19) to josh at the back.....");
	for (int i = 10; i < 20; i++) {
	    josh.addLast(i);
	    System.out.println(josh.getLast());
	    //should print 10, 11, 12 ... 19
	}

	System.out.println( "josh: " + josh );
	
	System.out.println("removing the first five elements of josh.....");
	for (int i = 0; i < 5; i++) {
	    System.out.println(josh.removeFirst());
	    //should print 9, 8, 7, 6, 5
	}

	System.out.println( "josh: " + josh );

	System.out.println("removing the first five elements of josh.....");
	for (int i = 0; i < 5; i++) {
	    System.out.println(josh.removeLast());
	    //should print 19, 18, 17, 16, 15
	}

	System.out.println( "josh: " + josh );
    }
}
