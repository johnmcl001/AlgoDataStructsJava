public class Main {
  public static void main(String[] args){
    LinkedCircularQueue<Integer> circularQueue = new LinkedCircularQueue<>();

    for (int i = 0; i < 10; i++){
      circularQueue.enqueue(i);
    }

    System.out.println(circularQueue.toString());
    circularQueue.rotate();
    circularQueue.rotate();
    System.out.println(circularQueue.toString());

  }
}
