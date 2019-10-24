import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedDequeTest {

  @Test
  void size() {
    LinkedDeque<Integer> t = new LinkedDeque<>();
    assertEquals(0, t.size());
  }

  @Test
  void isEmpty() {
    LinkedDeque<Integer> t = new LinkedDeque<>();
    assertTrue(t.isEmpty());
  }

  @Test
  void first() {
    LinkedDeque<Integer> t = new LinkedDeque<>();
    t.addFirst(1);
    assertEquals(1, t.first());
  }

  @Test
  void last() {
    LinkedDeque<Integer> t = new LinkedDeque<>();
    t.addLast(1);
    assertEquals(1, t.last());
  }

  @Test
  void addFirst() {
    LinkedDeque<Integer> t = new LinkedDeque<>();
    t.addFirst(1);
    t.addFirst(2);
    assertEquals(2, t.first());
  }

  @Test
  void addLast() {
    LinkedDeque<Integer> t = new LinkedDeque<>();
    t.addLast(1);
    t.addLast(2);
    assertEquals(2, t.last());
  }

  @Test
  void removeFirst() {
    LinkedDeque<Integer> t = new LinkedDeque<>();
    t.addLast(1);
    t.addLast(2);
    assertEquals(1, t.removeFirst());
  }

  @Test
  void removeLast() {
    LinkedDeque<Integer> t = new LinkedDeque<>();
    t.addLast(1);
    t.addLast(2);
    t.addLast(3);
    t.removeLast();
    assertEquals(2, t.removeLast());
  }

  @Test
  void firstNull() {
    LinkedDeque<Integer> t = new LinkedDeque<>();
    assertNull(t.first());
  }

  @Test
  void lastNull() {
    LinkedDeque<Integer> t = new LinkedDeque<>();
    assertNull(t.last());
  }

  @Test
  void removeFirstNull() {
    LinkedDeque<Integer> t = new LinkedDeque<>();
    assertNull(t.removeFirst());
  }

  @Test
  void removeLastNull() {
    LinkedDeque<Integer> t = new LinkedDeque<>();
    assertNull(t.removeLast());
  }
}