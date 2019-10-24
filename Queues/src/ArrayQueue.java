import java.lang.reflect.Array;

public class ArrayQueue<E> implements Queue<E> {
  private E[] arr;
  private int size = 0;
  private int front = 0;

  public ArrayQueue(){
    this(20);
  }

  public ArrayQueue(int n){
    arr = (E[]) new Object[n];
  }

  // Access methods for queue
  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public E front() throws IllegalStateException {
    if (isEmpty()){
      return null;
    }
    return arr[front];
  }

  // Update methods for queue
  @Override
  public E dequeue() throws IllegalStateException {
    if (isEmpty()){
      return null;
    }
    E answer = arr[front];
    front = (front+1) % arr.length;
    size--;
    return answer;
  }

  @Override
  public void enqueue(E e) throws IllegalStateException{
    if (size == arr.length){
      throw new IllegalStateException("Queue is full");
    }
    int available = (size+front) % arr.length;
    arr[available] = e;
    size++;
  }
}
