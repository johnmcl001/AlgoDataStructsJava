import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueTest {

  @Test
  void size() {
    LinkedQueue<Integer> t = new LinkedQueue<Integer>();
    assertEquals(0, t.size());
  }

  @Test
  void isEmpty() {
    LinkedQueue<Integer> t = new LinkedQueue<Integer>();
    assertTrue(t.isEmpty());
  }

  @Test
  void front() {
    LinkedQueue<Integer> t = new LinkedQueue<Integer>();
    t.enqueue(1);
    assertEquals(1, t.front());
  }

  @Test
  void dequeue() {
    LinkedQueue<Integer> t = new LinkedQueue<Integer>();
    t.enqueue(1);
    assertEquals(1, t.dequeue());
  }

  @Test
  void enqueue() {
    LinkedQueue<Integer> t = new LinkedQueue<Integer>();
    t.enqueue(1);
    t.enqueue(2);
    assertEquals(2, t.size());
  }

  @Test
  void dequeueEmpty() {
    LinkedQueue<Integer> t = new LinkedQueue<Integer>();
    assertEquals(null, t.dequeue());
  }

  @Test
  void frontEmpty() {
    LinkedQueue<Integer> t = new LinkedQueue<Integer>();
    assertEquals(null, t.front());
  }
}