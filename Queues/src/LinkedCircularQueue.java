public class LinkedCircularQueue<E> implements CircularQueue<E>{
  private SinglyLinkedList<E> list = new SinglyLinkedList<>();

  @Override
  public void rotate() {
    list.addLast(list.removeFirst());
  }

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

  @Override
  public String toString(){
    return list.toString();
  }
}
