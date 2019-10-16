import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

  @org.junit.jupiter.api.Test
  void getSize() {
    DoublyLinkedList<Integer> t = new DoublyLinkedList<>();
    assertEquals(0, t.getSize());
  }

  @org.junit.jupiter.api.Test
  void isEmpty() {
    DoublyLinkedList<Integer> t = new DoublyLinkedList<>();
    assertTrue(t.isEmpty());
  }

  @org.junit.jupiter.api.Test
  void first() {
    DoublyLinkedList<Integer> t = new DoublyLinkedList<>();
    t.addFirst(1);
    assertEquals(1, t.first());
  }

  @org.junit.jupiter.api.Test
  void last() {
    DoublyLinkedList<Integer> t = new DoublyLinkedList<>();
    t.addFirst(1);
    assertEquals(1, t.last());
  }

  @org.junit.jupiter.api.Test
  void addFirst() {
    DoublyLinkedList<Integer> t = new DoublyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    assertEquals(2, t.first());
  }

  @org.junit.jupiter.api.Test
  void addLast() {
    DoublyLinkedList<Integer> t = new DoublyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    t.addLast(3);
    assertEquals(3, t.last());
  }

  @org.junit.jupiter.api.Test
  void removeFirst() {
    DoublyLinkedList<Integer> t = new DoublyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    t.addLast(3);
    assertEquals(2, t.removeFirst());
  }

  @org.junit.jupiter.api.Test
  void removeLast() {
    DoublyLinkedList<Integer> t = new DoublyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    t.addLast(3);
    assertEquals(3, t.removeLast());
  }

  @org.junit.jupiter.api.Test
  void firstNull() {
    DoublyLinkedList<Integer> t = new DoublyLinkedList<>();
    assertEquals(null, t.first());
  }

  @org.junit.jupiter.api.Test
  void lastNull() {
    DoublyLinkedList<Integer> t = new DoublyLinkedList<>();
    assertEquals(null, t.last());
  }

  @org.junit.jupiter.api.Test
  void removeFirstNull() {
    DoublyLinkedList<Integer> t = new DoublyLinkedList<>();
    assertEquals(null, t.removeFirst());
  }

  @org.junit.jupiter.api.Test
  void removeLastNull() {
    DoublyLinkedList<Integer> t = new DoublyLinkedList<>();
    assertEquals(null, t.removeLast());
  }
}