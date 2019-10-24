public interface List<E> {
  /** Returns size of the list */
  int size();

  /** Returns true if list empty else false */
  boolean isEmpty();

  /** Returns element at index i */
  E get(int i) throws IndexOutOfBoundsException;

  /** Replaces and returns element at i */
  E set(int i, E e) throws IndexOutOfBoundsException;

  /** Adds element e at index i */
  void add(int i, E e) throws IndexOutOfBoundsException;

  /** Removes and returns element at i */
  E remove(int i) throws IndexOutOfBoundsException;
}
