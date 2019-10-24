import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

  @org.junit.jupiter.api.Test
  void size() {
    ArrayList<Integer> t = new ArrayList<>();
    assertEquals(0, t.size());
  }

  @org.junit.jupiter.api.Test
  void isEmpty() {
    ArrayList<Integer> t = new ArrayList<>();
    assertTrue(t.isEmpty());
  }

  @org.junit.jupiter.api.Test
  void get() {
    ArrayList<Integer> t = new ArrayList<>();
    t.add(0, 1);
    assertEquals(1, t.get(0));
  }

  @org.junit.jupiter.api.Test
  void set() {
    ArrayList<Integer> t = new ArrayList<>();
    t.add(0, 1);
    t.add(0, 2);
    assertTrue(2 == t.set(0, 3) && 3 == t.get(0));
  }

  @org.junit.jupiter.api.Test
  void add() {
    ArrayList<Integer> t = new ArrayList<>();
    t.add(0, 1);
    t.add(0, 2);
    assertEquals(2, t.get(0));

  }

  @org.junit.jupiter.api.Test
  void remove() {
    ArrayList<Integer> t = new ArrayList<>();
    t.add(0, 1);
    t.add(1, 2);
    t.add(2, 3);
    t.remove(1);
    assertTrue(t.get(1) == 3 && t.size() == 2);
  }
}