import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDequeTest {

  @Test
  void size() {
    ArrayDeque<Integer> t = new ArrayDeque<>(5);
    assertEquals(0, t.size());
  }

  @Test
  void isEmpty() {
    ArrayDeque<Integer> t = new ArrayDeque<>(5);
    assertTrue(t.isEmpty());
  }

  @Test
  void first() {
    ArrayDeque<Integer> t = new ArrayDeque<>(5);
    t.addFirst(1);
    assertEquals(1, t.first());
  }

  @Test
  void last() {
    ArrayDeque<Integer> t = new ArrayDeque<>(5);
    t.addLast(1);
    assertEquals(1, t.last());
  }

  @Test
  void addFirst() {
    ArrayDeque<Integer> t = new ArrayDeque<>(5);
    t.addFirst(1);
    t.addFirst(2);
    assertEquals(2, t.first());
  }

  @Test
  void addLast() {
    ArrayDeque<Integer> t = new ArrayDeque<>(5);
    t.addLast(1);
    t.addLast(2);
    assertEquals(2, t.last());
  }

  @Test
  void removeFirst() {
    ArrayDeque<Integer> t = new ArrayDeque<>(5);
    t.addLast(1);
    t.addLast(2);
    assertEquals(1, t.removeFirst());
  }

  @Test
  void removeLast() {
    ArrayDeque<Integer> t = new ArrayDeque<>(5);
    t.addLast(1);
    t.addLast(2);
    t.addLast(3);
    t.removeLast();
    assertEquals(2, t.removeLast());
  }

  @Test
  void firstNull() {
    ArrayDeque<Integer> t = new ArrayDeque<>(5);
    assertEquals(null, t.first());
  }

  @Test
  void lastNull() {
    ArrayDeque<Integer> t = new ArrayDeque<>(5);
    assertEquals(null, t.last());
  }

  @Test
  void addFirstIllegalStateException() {
    ArrayDeque<Integer> t = new ArrayDeque<>(1);
    assertThrows(IllegalStateException.class, () ->
            {
              t.addFirst(1);
              t.addFirst(2);
            });
  }

  @Test
  void addLastIllegalStateException() {
    ArrayDeque<Integer> t = new ArrayDeque<>(1);
    assertThrows(IllegalStateException.class, () ->
    {
      t.addLast(1);
      t.addLast(2);
    });
  }

  @Test
  void removeFirstNull() {
    ArrayDeque<Integer> t = new ArrayDeque<>(5);
    assertEquals(null, t.removeFirst());
  }

  @Test
  void removeLastNull() {
    ArrayDeque<Integer> t = new ArrayDeque<>(5);
    assertEquals(null, t.removeLast());
  }
}