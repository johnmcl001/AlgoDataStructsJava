public interface Deque<E> {
  /** Returns size of deque as int */
  int size();

  /** Return true if empty, else false */
  boolean isEmpty();

  /** Returns first element in deque without removing it, null if empty */
  E first();

  /** Returns last element in deque without removing it, null if empty */
  E last();

  /** Adds to front of deque */
  void addFirst(E e);

  /** Adds to rear of deque */
  void addLast(E e);

  /** Removes and returns first element of deque, null if empty */
  E removeFirst();

  /** Removes and returns last element of deque, null if empty */
  E removeLast();
}
