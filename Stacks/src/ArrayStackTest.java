import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

  @org.junit.jupiter.api.Test
  void size() {
    ArrayStack<Integer> t = new ArrayStack<>();
    assertEquals(0, t.size());
  }

  @org.junit.jupiter.api.Test
  void isEmpty() {
    ArrayStack<Integer> t = new ArrayStack<>();
    assertTrue(t.isEmpty());
  }

  @org.junit.jupiter.api.Test
  void top() {
    ArrayStack<Integer> t = new ArrayStack<>();
    t.push(1);
    t.push(2);
    assertEquals(2, t.top());
  }

  @org.junit.jupiter.api.Test
  void push() {
    ArrayStack<Integer> t = new ArrayStack<>();
    t.push(1);
    t.push(2);
    assertEquals(2, t.top());
  }

  @org.junit.jupiter.api.Test
  void pop() {
    ArrayStack<Integer> t = new ArrayStack<>();
    t.push(1);
    t.push(2);
    assertEquals(2, t.pop());
  }

  @org.junit.jupiter.api.Test
  void topNull() {
    ArrayStack<Integer> t = new ArrayStack<>();
    assertEquals(null, t.top());
  }

  @org.junit.jupiter.api.Test
  void popNull() {
    ArrayStack<Integer> t = new ArrayStack<>();
    assertEquals(null, t.pop());
  }

  @org.junit.jupiter.api.Test
  void pushFullException() {
    ArrayStack<Integer> t = new ArrayStack<>(2);
    try {
      t.push(1);
      t.push(1);
      t.push(1);
    } catch (IllegalStateException e){
      assertEquals("Stack is full", e.getMessage());
    }
  }
}