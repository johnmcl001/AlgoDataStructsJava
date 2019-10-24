public class ArrayDeque<E> implements Deque<E> {
  private E[] arr;
  private int front = 0;
  private int size = 0;

  // Constructors

  public ArrayDeque(){
    this(20);
  }

  public ArrayDeque(int n){
    arr = (E[]) new Object[n];
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
    return arr[front];
  }

  @Override
  public E last() {
    if (isEmpty()){
      return null;
    }
    int rear = (front+size-1) % arr.length;
    return arr[rear];
  }

  // Updaters

  @Override
  public void addFirst(E e) throws IllegalStateException{
    if (size == arr.length){
      throw new IllegalStateException("Deque is full");
    }
    front = (front+arr.length-1) % arr.length;
    arr[front] = e;
    size++;
  }

  @Override
  public void addLast(E e) throws IllegalStateException{
    if (size == arr.length){
      throw new IllegalStateException("Deque is full");
    }
    int avail = (front+size) % arr.length;
    arr[avail] = e;
    size++;
  }

  @Override
  public E removeFirst() {
    if(isEmpty()){
      return null;
    }
    E ans = arr[front];
    front = (front+1) % arr.length;
    size--;
    return ans;
  }

  @Override
  public E removeLast() {
    if(isEmpty()){
      return null;
    }
    int rear = (front+size-1) % arr.length;
    E ans = arr[rear];
    size--;
    return ans;
  }
}
