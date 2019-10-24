public class ArrayStack<E> implements Stack<E> {
  // Class attributes
  private static final int N = 1000;
  private E[] arr;
  private int top = -1;

  // Constructors
  public ArrayStack(){
    this(N);
  }

  @SuppressWarnings("unchecked")
  public ArrayStack(int n){
    arr = (E[]) new Object[n];

  }

  @Override
  public int size() {
    return top+1;
  }

  @Override
  public boolean isEmpty() {
    return top == -1;
  }

  @Override
  public E top() {
    if (isEmpty()){
      return null;
    }
    return arr[top];
  }

  // Updater Methods

  @Override
  public void push(E e) throws IllegalStateException{
    if (size() == arr.length){
      throw new IllegalStateException("Stack is full");
    }
    arr[++top] = e;
  }

  @Override
  public E pop() {
    if (isEmpty()){
      return null;
    }
    E answer = arr[top];
    arr[top] = null;
    top--;
    return answer;
  }
}

