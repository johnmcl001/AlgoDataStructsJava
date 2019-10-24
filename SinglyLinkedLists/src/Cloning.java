public class Cloning {
  public static void main(String[] args){
    SinglyLinkedList<Integer> listOne = new SinglyLinkedList<>();

    for (int i = 0; i < 10; i++){
      listOne.addFirst(i);
    }
    System.out.printf("List One: %s%n", listOne.toString());
    try{
      SinglyLinkedList<Integer> listTwo = listOne.clone();
      System.out.printf("List Two: %s%n", listTwo.toString());
      System.out.println(listOne.equals(listTwo));

    } catch (CloneNotSupportedException e){
      System.out.println(e.getMessage());
    }
  }
}
