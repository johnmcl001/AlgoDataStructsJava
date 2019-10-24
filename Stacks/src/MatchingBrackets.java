public class MatchingBrackets {
  public static void main(String[] args){
    String passTestOne = "{}{}{}";
    String passTestTwo = "{[()]}{}[]";
    String failTestOne = "}{}{{}}";
    String failTestTwo = "{}{}{";

    System.out.printf("Should be true: %s%n", matchBrackets(passTestOne));
    System.out.printf("Should be true: %s%n", matchBrackets(passTestTwo));
    System.out.printf("Should be false: %s%n", matchBrackets(failTestOne));
    System.out.printf("Should be false: %s%n", matchBrackets(failTestTwo));
  }

  private static <E> boolean matchBrackets(String s){
    final String opening = "{[(";
    final String closing = "}])";
    Stack<Character> buffer = new LinkedStack<>();

    for (char c: s.toCharArray()){
      if (opening.indexOf(c) != -1){
        buffer.push(c);
      } else if (closing.indexOf(c) != -1) {
        if (buffer.isEmpty()){
          return false;
        }
        if (closing.indexOf(c) != opening.indexOf(buffer.pop())){
          return false;
        }
      }
    }

    return buffer.isEmpty();
  }
}
