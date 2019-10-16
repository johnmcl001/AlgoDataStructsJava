public class DoublyLinkedList<E> {
  private class Node<E>{
    private E element;
    private Node<E> prev;
    private Node<E> next;

    public Node(E e, Node<E> p, Node<E> n){
      element = e;
      prev = p;
      next = n;
    }

    public E getElement() {
      return element;
    }

    public Node<E> getPrev() {
      return prev;
    }

    public void setPrev(Node<E> p) {
      prev = p;
    }

    public Node<E> getNext() {
      return next;
    }

    public void setNext(Node<E> n) {
      next = n;
    }
  }

  private Node<E> header;
  private Node<E> trailer;
  private int size = 0;

  public DoublyLinkedList() {
    header = new Node<>(null, null, null);
    trailer = new Node<>(null, null, null);;
    header.setNext(trailer);
  }

  // Accesseor Methods

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
    return header.getNext().getElement();
  }

  public E last(){
    if (isEmpty()){
      return null;
    }
    return trailer.getPrev().getElement();
  }

  // Update Methods

  public void addFirst(E e){
    addBetween(e, header, header.getNext());
  }

  public void addLast(E e){
    addBetween(e, trailer.getPrev(), trailer);
  }

  public E removeFirst(){
    if (isEmpty()){
      return null;
    }
    return remove(header.getNext());
  }

  public E removeLast(){
    if (isEmpty()){
      return null;
    }
    return remove(trailer.getPrev());
  }

  // Utility Methods
  private void addBetween(E e, Node<E> pred, Node<E> succ){
    Node<E> newNode = new Node<>(e, pred, succ);
    pred.setNext(newNode);
    succ.setPrev(newNode);
    size++;
  }

  private E remove(Node<E> node){
    Node<E> pred = node.getPrev();
    Node<E> succ = node.getNext();
    pred.setNext(succ);
    succ.setPrev(pred);
    size--;
    return node.getElement();
  }
}
