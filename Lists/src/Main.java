public class Main {
  public static void main(String[] args){
    ArrayList<Integer> t = new ArrayList<>(15);

    for (int i = 0; i < 10; i++){
      t.add(i, i+1);
    }

    System.out.println(t.toString());

    t.add(2, 50);
    System.out.println(t.toString());

    t.remove(2);
    System.out.println(t.toString());

    for (int i = 0; i < 20; i++){
      t.add(i, i+1);
    }
    System.out.println(t.toString());
  }
}
