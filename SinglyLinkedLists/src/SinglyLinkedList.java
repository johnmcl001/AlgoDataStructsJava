public class SinglyLinkedList<E> {

  // Nested Node class
  private static class Node<E>{
    private E element;
    private Node<E> next;

    public Node(E e, Node<E> n){
      element = e;
      next = n;
    }

    public E getElement(){
      return element;
    }

    public Node<E> getNext() {
      return next;
    }

    public void setElement(E e){
      element = e;
    }

    public void setNext(Node<E> n){
      next = n;
    }
  }

  // Singly Linked List instance variables
  private Node<E> head;
  private Node<E> tail;
  private int size = 0;

  public SinglyLinkedList(){};

  // Access Methods

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
    return head.getElement();
  }

  public E last(){
    if (isEmpty()){
      return null;
    }
    return tail.getElement();
  }

  // Modification Methods

  public void addFirst(E e){
    head = new Node<>(e, head);
    if (size == 0){
      tail = head;
    }
    size++;
  }

  public void addLast(E e){
    Node<E> newNode = new Node<>(e, null);
    if (isEmpty()){
      head = newNode;
    } else {
      tail.setNext(newNode);
    }
    tail = newNode;
    size++;
  }

  public E removeFirst(){
    if (isEmpty()){
      return null;
    }
    E answer = head.getElement();
    head = head.getNext();
    size--;
    if(size == 0){
      tail = null;
    }
    return answer;
  }

}
