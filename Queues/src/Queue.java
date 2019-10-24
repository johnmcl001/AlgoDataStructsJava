public interface Queue<E> {
  /**
   *
   * @return size of queue
   */
  int size();

  /**
   * Checks whether or not queue is empty
   * @return true if queue is empty, else false
   */
  boolean isEmpty();

  /**
   * Returns front element without removing it
   * @return front element of queue
   */

  E front();

  /**
   * Removes and returns front element of queue
   * @return Front element of queue
   */
  E dequeue();

  /**
   * Add new element to rear of queue
   * @param e
   */
  void enqueue(E e);
}
