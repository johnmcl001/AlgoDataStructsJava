import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueTest {

  @org.junit.jupiter.api.Test
  void size() {
    ArrayQueue<Integer> t = new ArrayQueue<>();
    assertEquals(0, t.size());
  }

  @org.junit.jupiter.api.Test
  void isEmpty() {
    ArrayQueue<Integer> t = new ArrayQueue<>();
    assertTrue(t.isEmpty());
  }

  @org.junit.jupiter.api.Test
  void front() {
    ArrayQueue<Integer> t = new ArrayQueue<>();
    t.enqueue(1);
    assertEquals(1, t.front());
  }

  @org.junit.jupiter.api.Test
  void dequeue() {
    ArrayQueue<Integer> t = new ArrayQueue<>();
    t.enqueue(1);
    t.enqueue(2);
    assertEquals(1, t.dequeue());
  }

  @org.junit.jupiter.api.Test
  void enqueue() {
    ArrayQueue<Integer> t = new ArrayQueue<>();
    t.enqueue(1);
    assertEquals(1, t.front());
  }

  @org.junit.jupiter.api.Test
  void frontEmptyQueue() {
    ArrayQueue<Integer> t = new ArrayQueue<>();
    try{
      t.front();
    } catch (IllegalStateException e){
      assertEquals(null, e.getMessage());
    }
  }

  @org.junit.jupiter.api.Test
  void dequeueEmptyQueue() {
    ArrayQueue<Integer> t = new ArrayQueue<>();
    try{
      t.dequeue();
    } catch (IllegalStateException e){
      assertEquals(null, e.getMessage());
    }
  }

  @org.junit.jupiter.api.Test
  void enqueueFullQueue() {
    ArrayQueue<Integer> t = new ArrayQueue<>(1);
    try{
      t.enqueue(1);
      t.enqueue(2);
    } catch (IllegalStateException e){
      assertEquals("Queue is full", e.getMessage());
    }
  }
}