import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularlyLinkedListTest {

  @Test
  @DisplayName("Should return size as int")
  void getSize() {
    CircularlyLinkedList<Integer> t = new CircularlyLinkedList<>();
    assertEquals(t.getSize(), 0);
  }

  @Test
  @DisplayName("Should return boolean, indicating if empty")
  void isEmpty() {
    CircularlyLinkedList<Integer> t = new CircularlyLinkedList<>();
    assertTrue(t.isEmpty());
  }

  @Test
  @DisplayName("Should return first element in list")
  void first() {
    CircularlyLinkedList<Integer> t = new CircularlyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    assertEquals(t.first(), 2);
  }

  @Test
  @DisplayName("Should return null since list empty")
  void firstEmpty() {
    CircularlyLinkedList<Integer> t = new CircularlyLinkedList<>();
    assertEquals(t.first(), null);
  }

  @Test
  @DisplayName("Should return last element in list")
  void last() {
    CircularlyLinkedList<Integer> t = new CircularlyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    assertEquals(t.last(), 1);
  }

  @Test
  @DisplayName("Should return null since list empty")
  void lastEmpty() {
    CircularlyLinkedList<Integer> t = new CircularlyLinkedList<>();
    assertEquals(t.last(), null);
  }

  @Test
  @DisplayName("Should add new element at head")
  void addFirst() {
    CircularlyLinkedList<Integer> t = new CircularlyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    t.addFirst(3);
    assertEquals(t.first(), 3);
  }

  @Test
  @DisplayName("Should add new element at tail")
  void addLast() {
    CircularlyLinkedList<Integer> t = new CircularlyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    t.addLast(4);
    assertEquals(t.last(), 4);
  }

  @Test
  @DisplayName("Should remove first element from list")
  void removeFirst() {
    CircularlyLinkedList<Integer> t = new CircularlyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    assertEquals(t.removeFirst(), 2);
  }

  @Test
  @DisplayName("Should return size as int")
  void getSizeTwo() {
    CircularlyLinkedList<Integer> t = new CircularlyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    assertEquals(t.getSize(), 2);
  }

  @Test
  @DisplayName("Tail and Head should be the same")
  void addLastEmptyList() {
    CircularlyLinkedList<Integer> t = new CircularlyLinkedList<>();
    t.addLast(4);
    assertTrue(t.last().equals(t.first()));
  }

  @Test
  @DisplayName("Should return new tail which is 2")
  void rotate() {
    CircularlyLinkedList<Integer> t = new CircularlyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    t.addLast(4);
    t.rotate();
    assertEquals(t.last(), 2);
  }
}