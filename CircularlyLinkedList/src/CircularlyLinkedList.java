public class CircularlyLinkedList<E> {
  private class Node<E>{
    private E element;
    private Node<E> next;

    public Node(E e, Node<E> n){
      element = e;
      next = n;
    }

    public E getElement(){
      return element;
    }

    public Node<E> getNext(){
      return next;
    }

    public void setElement(E e){
      element = e;
    }

    public void setNext(Node<E> n){
      next = n;
    }
  }

  private Node<E> tail;
  private int size = 0;

  public CircularlyLinkedList(){};

  // Accessor Methods

  public int getSize(){
    return size;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public E first(){
    if (isEmpty()){
      return null;
    }
    return tail.getNext().getElement();
  }

  public E last(){
    if (isEmpty()){
      return null;
    }
    return tail.getElement();
  }

  // Modifier Methods

  public void rotate(){
    if (tail != null){
      tail = tail.getNext();
    }
  }

  public void addFirst(E e){
    if (isEmpty()){
      tail = new Node<>(e, null);
      tail.setNext(tail);
    } else {
      Node<E> newNode = new Node(e, tail.getNext());
      tail.setNext(newNode);
    }
    size++;
  }

  public void addLast(E e){
    addFirst(e);
    tail = tail.getNext();
  }

  public E removeFirst(){
    if (isEmpty()){
      return null;
    }
    Node<E> head = tail.getNext();
    if (head == tail){
      tail = null;
    } else {
      tail.setNext(head.getNext());
    }
    size--;
    return head.getElement();

  }
}
