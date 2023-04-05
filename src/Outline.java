import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Outline  {

  public static String[] getWords() {
    return new String[] {"foo","bar","hello","hi","jim","how","are","you"};
  }

  public static void question1_1_without_lambda() {
    String[] strArray = getWords();
    Arrays.sort(strArray, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {return 1;}
        if (o1.length() < o2.length()) {return -1;}
        return 0;
      }
    });
    System.out.println("1.1 without lambda: " + Arrays.asList(strArray));
  }


  // length i.e. shortest to longest
  public static void question1_1() {
    String[] strArray = getWords();
    Arrays.sort(strArray, (a, b) -> Integer.compare(a.length(), b.length()));
    System.out.println("1.1: " + Arrays.asList(strArray));
  }


  // length i.e. shortest to longest
  public static void question1_2() {
    String[] strArray = getWords();
    Arrays.sort(strArray, (a, b) -> Integer.compare(b.length(), a.length()));
    System.out.println("1.2: " + Arrays.asList(strArray));
  }


  public static void question1_3() {
    String[] strArray = getWords();
    Arrays.sort(strArray, (a, b) -> Character.compare(a.charAt(0), b.charAt(0)));
    System.out.println("1.3: " + Arrays.asList(strArray));
  }


  public static void question1_4() {
    String[] strArray = getWords();
    Arrays.sort(strArray, (a, b) -> {
      if (a.contains("e") && !b.contains("e")) return -1;
      if (b.contains("e") && !a.contains("e")) return 1;
      return 0;
    });
    System.out.println("1.4: " + Arrays.asList(strArray));
  }

  public static void question2() {
    String[] strArray = getWords();
    Arrays.sort(strArray, StringUtils::eChecker);
    System.out.println("2: " + Arrays.asList(strArray));
  }

  public static void question3() {
    boolean betterWord;
    betterWord = StringUtils.betterString("cool", "world", (s1, s2) -> s1.length() > s2.length());
    System.out.println("3: " + betterWord);
    betterWord = StringUtils.betterString("test1", "test2", (s1, s2) -> true);
    System.out.println("3: " + betterWord);
  }

  public static void question4() {
    boolean betterElement;
    betterElement = StringUtils.betterEntry("cool", "world", (s1, s2) -> s1.length() > s2.length());
    System.out.println("4: " + betterElement);
    betterElement = StringUtils.betterEntry("test1", "test2", (s1, s2) -> true);
    System.out.println("4: " + betterElement);
  }

  public static void question5() {
    List<String> words = List.of(getWords());
    List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
    System.out.println("5: " + shortWords);
    List<String> wordsWithH = StringUtils.allMatches(words, s -> s.contains("h"));
    System.out.println("5: " + wordsWithH);
  }

  public static void question6() {
    List<String> words = List.of(getWords());
    List<String> shortWords = StringUtils.allMatchesGeneric(words, s -> s.length() < 4);
    System.out.println("6: " + shortWords);
    List<String> wordsWithH = StringUtils.allMatchesGeneric(words, s -> s.contains("h"));
    System.out.println("6: " + wordsWithH);
    List<Integer> numbers = Arrays.asList(1,4,10,5,23,42,90,3);
    List<Integer> numbersLess5 = StringUtils.allMatchesGeneric(numbers, n -> n < 5);
    System.out.println("6: " + numbersLess5);
  }

  public static void question7() {
    List<String> words = List.of(getWords());
    List<String> upperCaseWords = StringUtils.transformedList(words, s -> s.toUpperCase());
    System.out.println("7: " + upperCaseWords);
    List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
    System.out.println("7: " + excitingWords);
  }

  public static void question8() {
    List<String> words = List.of(getWords());
    List<String> upperCaseWords = StringUtils.transformedListGenerics(words, s -> s.toUpperCase());
    System.out.println("8: " + upperCaseWords);
    List<String> excitingWords = StringUtils.transformedListGenerics(words, s -> s + "!");
    System.out.println("8: " + excitingWords);
    List<Integer> numbers = Arrays.asList(1,4,10,5,23,42,90,3);
    List<Integer> addOne = StringUtils.transformedListGenerics(numbers, n -> n + 1);
    System.out.println("8: " + addOne);
  }


  public static void main(String... args) { // varargs alternative to String[]

    question1_1_without_lambda();
    question1_1();
    question1_2();
    question1_3();
    question1_4();
    question2();
    question3();
    question4();
    question5();
    question6();
    question7();
    question8();

  }


}


