public class LinkedQueue<E> implements Queue<E> {
  private SinglyLinkedList<E> list = new SinglyLinkedList<>();

  public LinkedQueue(){};

  @Override
  public int size() {
    return list.getSize();
  }

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public E front() {
    return list.first();
  }

  @Override
  public E dequeue() {
    return list.removeFirst();
  }

  @Override
  public void enqueue(E e) {
    list.addLast(e);
  }
}
