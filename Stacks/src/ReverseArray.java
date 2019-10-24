import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args){
    Integer[] intArr = {1,2,3,4,5,6,7,8,9};
    System.out.println(Arrays.toString(intArr));
    reverseArray(intArr);
    System.out.println(Arrays.toString(intArr));
    System.out.println();

    String[] strArr = {"john", "david", "helen"};
    System.out.println(Arrays.toString(strArr));
    reverseArray(strArr);
    System.out.println(Arrays.toString(strArr));


  }

  private static <E> void reverseArray(E[] arr){
    Stack<E> stack = new ArrayStack<>(arr.length);
    for(E i: arr){
      stack.push(i);
    }
    for(int i = 0; i < arr.length; i++){
      arr[i] = stack.pop();
    }
  }
}
