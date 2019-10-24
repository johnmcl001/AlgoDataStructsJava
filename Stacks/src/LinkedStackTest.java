import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {


  @org.junit.jupiter.api.Test
  void size() {
    LinkedStack<Integer> t = new LinkedStack<>();
    assertEquals(0, t.size());
  }

  @org.junit.jupiter.api.Test
  void isEmpty() {
    LinkedStack<Integer> t = new LinkedStack<>();
    assertTrue(t.isEmpty());
  }

  @org.junit.jupiter.api.Test
  void top() {
    LinkedStack<Integer> t = new LinkedStack<>();
    t.push(1);
    t.push(2);
    assertEquals(2, t.top());
  }

  @org.junit.jupiter.api.Test
  void push() {
    LinkedStack<Integer> t = new LinkedStack<>();
    t.push(1);
    t.push(2);
    assertEquals(2, t.top());
  }

  @org.junit.jupiter.api.Test
  void pop() {
    LinkedStack<Integer> t = new LinkedStack<>();
    t.push(1);
    t.push(2);
    assertEquals(2, t.pop());
  }

  @org.junit.jupiter.api.Test
  void topNull() {
    LinkedStack<Integer> t = new LinkedStack<>();
    assertEquals(null, t.top());
  }

  @org.junit.jupiter.api.Test
  void popNull() {
    LinkedStack<Integer> t = new LinkedStack<>();
    assertEquals(null, t.pop());
  }

}