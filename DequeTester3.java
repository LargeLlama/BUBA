public class DequeTester3{
  public static void main(String[] args) {
    QQKachoo<String> iscream = new QQKachoo<String>();

    System.out.println("-----Adding to front------");
    iscream.addFirst("Chocolate");
    System.out.println(iscream.getFirst()); //Chocolate
    iscream.addFirst("Vanilla");
    System.out.println(iscream.getFirst()); //Vanilla
    iscream.addFirst("Strawberry");
    System.out.println(iscream.getFirst()); //Strawberry
    iscream.addFirst("Mint");
    System.out.println(iscream.getFirst()); //Mint

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(iscream); //Mint Strawberry Vanilla Chocolate

    System.out.println("");

    System.out.println("-----Adding to end------");
    iscream.addLast("Pistachio");
    System.out.println(iscream.getLast()); //Pistachio
    iscream.addLast("Coffee");
    System.out.println(iscream.getLast()); //Coffee
    iscream.addLast("S'mores");
    System.out.println(iscream.getLast()); //S'mores
System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(iscream); //Mint Strawberry Vanilla Chocolate Pistachio Coffee S'mores

    System.out.println("");

    System.out.println("-----Removing from front-----");
    iscream.removeFirst(); //Mint  dies
    System.out.println(iscream.getFirst()); //Strawberry

    System.out.println("");

    System.out.println("-----Removing from end-----");
    iscream.removeLast(); //S'mores dies
    System.out.println(iscream.getLast()); //Coffee

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(iscream); //Mint Strawberry Vanilla Chocolate Pistachio Coffee S'mores

    System.out.println("");

    System.out.println("------REMOVING EVERYTHING------");
    iscream.removeFirst();
    System.out.println(iscream);
    iscream.removeLast();
    System.out.println(iscream);
    iscream.removeFirst();
    System.out.println(iscream);
    iscream.removeLast();
    System.out.println(iscream);
    iscream.removeFirst();
    System.out.println(iscream);
    System.out.println("Empty now?: "+iscream.isEmpty()); //true
  }





}
