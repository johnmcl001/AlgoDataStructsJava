import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedCircularQueueTest {

  @Test
  void rotate(){
    LinkedCircularQueue<Integer> t = new LinkedCircularQueue<Integer>();
    for(int i = 0; i < 5; i++){
      t.enqueue(i);
    }
    t.rotate();
    assertEquals(1, t.front());
  }

  @Test
  void rotateTestTwo(){
    LinkedCircularQueue<Integer> t = new LinkedCircularQueue<Integer>();
    for(int i = 0; i < 5; i++){
      t.enqueue(i);
    }
    t.rotate();
    while(t.size() > 1){
      t.dequeue();
    }
    assertEquals(0, t.front());
  }

  @Test
  void size() {
    LinkedCircularQueue<Integer> t = new LinkedCircularQueue<Integer>();
    assertEquals(0, t.size());
  }

  @Test
  void isEmpty() {
    LinkedCircularQueue<Integer> t = new LinkedCircularQueue<Integer>();
    assertTrue(t.isEmpty());
  }

  @Test
  void front() {
    LinkedCircularQueue<Integer> t = new LinkedCircularQueue<Integer>();
    t.enqueue(1);
    assertEquals(1, t.front());
  }

  @Test
  void dequeue() {
    LinkedCircularQueue<Integer> t = new LinkedCircularQueue<Integer>();
    t.enqueue(1);
    assertEquals(1, t.dequeue());
  }

  @Test
  void enqueue() {
    LinkedCircularQueue<Integer> t = new LinkedCircularQueue<Integer>();
    t.enqueue(1);
    t.enqueue(2);
    assertEquals(2, t.size());
  }

  @Test
  void dequeueEmpty() {
    LinkedCircularQueue<Integer> t = new LinkedCircularQueue<Integer>();
    assertEquals(null, t.dequeue());
  }

  @Test
  void frontEmpty() {
    LinkedCircularQueue<Integer> t = new LinkedCircularQueue<Integer>();
    assertEquals(null, t.front());
  }
}