public class EquivalenceTesting {
  public static void main(String[] args){
    SinglyLinkedList<Integer> listOne = new SinglyLinkedList<>();
    SinglyLinkedList<Integer> listTwo = new SinglyLinkedList<>();
    SinglyLinkedList<Integer> listThree = new SinglyLinkedList<>();

    for (int i = 0; i <= 3; i++){
      listOne.addFirst(i);
      listTwo.addFirst(i);
    }

    for(int i = 5; i <= 8; i++){
      listThree.addFirst(i);
    }

    System.out.printf("Should be true: %s%n", listOne.equals(listTwo));
    System.out.printf("Should be false: %s%n", listOne.equals(listThree));
    System.out.printf("Should be false: %s%n", listTwo.equals(listThree));
  }

}
