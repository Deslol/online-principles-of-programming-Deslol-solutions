
/*
 * Implement the DequeueInterface. It functionality is described in the
 * comments
 *
 * You should demonstrate the use of this data structure 
 * in the main method below
 */ 

public class Week7Lesson1 {
  public static void main(String[] args) {
    MyDeque deque = new MyDeque();
    deque.addFront("First");
    deque.addFront("Second");
    deque.addRear("Third");
      deque.addRear("Fourth");
      deque.addFront("Fifth");
    Object fifth = deque.removeFront();
    Object fourth = deque.removeRear();

    System.out.println(fifth);
    System.out.println(fourth);

    deque.displayList();

    /* Expected outcome
      Fifth
      Fourth
      Second
      First
      Third
     */
  }
}
