public class LinkedStack<E> implements Stack<E> {
  private SinglyLinkedList<E> list = new SinglyLinkedList<>();

  public LinkedStack(){};

  // Accessor Methods
  @Override
  public int size() {
    return list.getSize();
  }

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public E top() {
    return list.first();
  }

  @Override
  public void push(E e) {
    list.addFirst(e);
  }

  @Override
  public E pop() {
    return list.removeFirst();
  }
}
