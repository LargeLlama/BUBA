public class DequeTester {
    public static void main(String[] args) {
	QQKachoo<String> bob = new QQKachoo<String>();
	System.out.println(bob.isEmpty()); //true
	bob.addFirst("yaw");
	System.out.println(bob);
	bob.addFirst("ok");
	System.out.println(bob);
	bob.addLast("what");
	System.out.println(bob);
	bob.addFirst("but");
	System.out.println(bob); //but, ok, yaw, what
	System.out.println(bob.getFirst()); //but
	System.out.println(bob.getLast()); //what
	System.out.println(bob.isEmpty()); //false
	while (!bob.isEmpty()) {
	    System.out.println(bob.removeFirst());
	    System.out.println(bob.removeLast()); } // but what ok yaw
    }
}
