public class LinkedDeque<E> implements Deque<E> {
  // Inner node class
  private class Node<E>{
    private E element;
    private Node<E> prev;
    private Node<E> next;

    public Node(E e, Node<E> p, Node<E> n){
      element = e;
      prev = p;
      next = n;
    }

    // Accessors
    public E getElement(){
      return element;
    }

    public Node<E> getNext(){
      return next;
    }

    public Node<E> getPrev(){
      return prev;
    }

    // Updaters
    public void setElement(E e){
      element = e;
    }

    public void setPrev(Node<E> p){
      prev = p;
    }

    public void setNext(Node<E> n){
      next = n;
    }
  }

  // Doubly Linked List Attributes
  private Node<E> header;
  private Node<E> trailer;
  private int size = 0;

  // Constructor
  public LinkedDeque(){
    header = new Node<>(null, null, null);
    trailer = new Node<>(null, null, null);
    header.setNext(trailer);
  }

  // Accessors
  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public E first() {
    if(isEmpty()){
      return null;
    }
    return header.getNext().getElement();
  }

  @Override
  public E last() {
    if (isEmpty()){
      return null;
    }
    return trailer.getPrev().getElement();
  }

  // Updaters
  @Override
  public void addFirst(E e) {
    addBetween(e, header, header.getNext());
  }

  @Override
  public void addLast(E e) {
    if (isEmpty()){
      addFirst(e);
    } else {
     addBetween(e, trailer.getPrev(), trailer);
    }
  }

  private void addBetween(E e, Node<E> pred, Node<E> succ){
    Node<E> newNode = new Node<>(e, pred, succ);
    pred.setNext(newNode);
    succ.setPrev(newNode);
    size++;
  }

  @Override
  public E removeFirst() {
    if (isEmpty()){
      return null;
    }
    return remove(header.getNext());
  }

  @Override
  public E removeLast() {
    if (isEmpty()){
      return null;
    }
    return remove(trailer.getPrev());
  }

  private E remove(Node<E> node){
    Node<E> pred = node.getPrev();
    Node<E> succ = node.getNext();
    pred.setNext(succ);
    succ.setPrev(pred);
    node.setNext(null);
    node.setPrev(null);
    size--;
    return node.getElement();
  }
}
