import java.util.Arrays;
import java.util.Comparator;

public class Outline  {

  public static void main(String... args) { // varargs alternative to String[]
    String[] strArray = {"foo","bar","hello","jim","how","are","you"};
    System.out.println(Arrays.asList(strArray));

    // sort by length (shortest to longest)
    Arrays.sort(strArray, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    });

  }


}


