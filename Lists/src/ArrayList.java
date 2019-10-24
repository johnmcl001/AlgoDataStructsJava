public class ArrayList<E> implements List<E> {
  private final static int N = 20;
  private E[] arr;
  private int size = 0;

  // Constructors
  public ArrayList(){
    this(N);
  }

  public ArrayList(int n){
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
  public E get(int i) throws IndexOutOfBoundsException {
    checkIndex(i, size);
    return arr[i];
  }

  // Updaters
  @Override
  public E set(int i, E e) throws IndexOutOfBoundsException {
    checkIndex(i, size);
    E temp = arr[i];
    arr[i] = e;
    return temp;
  }

  @Override
  public void add(int i, E e) throws IndexOutOfBoundsException,
          IllegalStateException {
    checkIndex(i, size+1);
    if (size == arr.length){
      resize(2*arr.length);
    }
    for(int j = size; j > i; j--){
      arr[j] = arr[j-1];
    }
    arr[i] = e;
    size++;
  }

  @Override
  public E remove(int i) throws IndexOutOfBoundsException {
    checkIndex(i, size);
    E temp = arr[i];
    for(int j = i; j < size; j++){
      arr[j] = arr[j+1];
    }
    arr[size-1] = null;
    size--;
    return temp;
  }

  // Utilities
  protected void checkIndex(int i, int n){
    if (i < 0 || i >= n){
      throw new IndexOutOfBoundsException("Illegal index: " + i);
    }
  }

  protected void resize(int n){
    E[] temp = (E[]) new Object[n];
    for(int i = 0; i < size; i++){
      temp[i] = arr[i];
    }
    arr = temp;
  }

  public String toString(){
    String s = "";
    for(E i: arr){
      s += i + " ";
    }
    return s;
  }
}
