import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

  @Test
  @DisplayName("Should return size as int")
  void getSize() {
    SinglyLinkedList<Integer> t = new SinglyLinkedList<>();
    assertEquals(t.getSize(), 0);
  }

  @Test
  @DisplayName("Should return boolean, indicating if empty")
  void isEmpty() {
    SinglyLinkedList<Integer> t = new SinglyLinkedList<>();
    assertTrue(t.isEmpty());
  }

  @Test
  @DisplayName("Should return first element in list")
  void first() {
    SinglyLinkedList<Integer> t = new SinglyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    assertEquals(t.first(), 2);
  }

  @Test
  @DisplayName("Should return null since list empty")
  void firstEmpty() {
    SinglyLinkedList<Integer> t = new SinglyLinkedList<>();
    assertEquals(t.first(), null);
  }

  @Test
  @DisplayName("Should return last element in list")
  void last() {
    SinglyLinkedList<Integer> t = new SinglyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    assertEquals(t.last(), 1);
  }

  @Test
  @DisplayName("Should return null since list empty")
  void lastEmpty() {
    SinglyLinkedList<Integer> t = new SinglyLinkedList<>();
    assertEquals(t.last(), null);
  }

  @Test
  @DisplayName("Should add new element at head")
  void addFirst() {
    SinglyLinkedList<Integer> t = new SinglyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    t.addFirst(3);
    assertEquals(t.first(), 3);
  }

  @Test
  @DisplayName("Should add new element at tail")
  void addLast() {
    SinglyLinkedList<Integer> t = new SinglyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    t.addLast(4);
    assertEquals(t.last(), 4);
  }

  @Test
  @DisplayName("Should remove first element from list")
  void removeFirst() {
    SinglyLinkedList<Integer> t = new SinglyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    assertEquals(t.removeFirst(), 2);
  }

  @Test
  @DisplayName("Should return size as int")
  void getSizeTwo() {
    SinglyLinkedList<Integer> t = new SinglyLinkedList<>();
    t.addFirst(1);
    t.addFirst(2);
    assertEquals(t.getSize(), 2);
  }

  @Test
  @DisplayName("Tail and Head should be the same")
  void addLastEmptyList() {
    SinglyLinkedList<Integer> t = new SinglyLinkedList<>();
    t.addLast(4);
    assertTrue(t.last().equals(t.first()));
  }
}