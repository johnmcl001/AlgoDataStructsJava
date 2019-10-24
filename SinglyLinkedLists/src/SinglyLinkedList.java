public class SinglyLinkedList<E> implements Cloneable{

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

  // Equivalence Testing

  /**
   * Checks if two linked lists are equal
   * @param o, another object
   * @return boolean, true if objects are equal, else false
   */
  public boolean equals(Object o){
    if (o == null){
      return false;
    }

    if (getClass() != o.getClass()){
      return false;
    }

    SinglyLinkedList<E> other = (SinglyLinkedList) o;

    Node<E> walkA = head;
    Node<E> walkB = other.head;

    while (walkA != null){
      if (walkA.getElement() != walkB.getElement()){
        return false;
      }
      walkA = walkA.getNext();
      walkB = walkB.getNext();
    }

    return true;
  }

  // Cloning

  public SinglyLinkedList<E> clone() throws CloneNotSupportedException{
    SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone();

    if (size > 0){
      other.head = new Node<>(head.getElement(), null);
      Node<E> walk = head.getNext();
      Node<E> otherTail = other.head;
      while(walk != null){
        Node<E> newNode = new Node<>(walk.getElement(), null);
        otherTail.setNext(newNode);
        otherTail = newNode;
        walk = walk.getNext();
      }
    }
    return other;
  }

  // String Representation

  /**
   *  Returns string representation of linked list
   * @return String showing elements
   */
  @Override
  public String toString(){
    Node<E> temp = head;
    String s = "";
    while (temp != null){
      s += temp.getElement() + " ";
      temp = temp.getNext();
    }
    return s;
  }
}
