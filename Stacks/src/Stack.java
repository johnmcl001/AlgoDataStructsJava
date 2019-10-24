public interface Stack<E> {
  /**
   * Returns number of elements in stack
   * @return size of stack as int
   */
  int size();

  /**
   * Tests if stack is empty
   * @return boolean, true if stack empty, else false
   */
  boolean isEmpty();

  /**
   * Returns but doesn't remove top element
   * @return top element of stack, null if empty
   */
  E top();

  /**
   * Adds to top of stack
   * @param e, element to be added to stack
   */
  void push(E e);

  /**
   * Removes and returns top element from stack
   * @return element removed, null if empty
   */
  E pop();
}
