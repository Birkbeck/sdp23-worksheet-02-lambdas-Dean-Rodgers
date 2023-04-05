import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringUtils {


    public static int eChecker(String s1, String s2) {
        if (s1.contains("e") && !s2.contains("e")) return -1;
        if (s1.contains("e") && !s2.contains("e")) return 1;
        return 0;

    }


   public static boolean betterString(String s1, String s2, TwoStringPredicate twp) {
        return twp.betterString(s1, s2);
    }


    public static <T> boolean betterEntry(T o1, T o2, TwoElementPredicate<T> tep) {
        return tep.betterEntry(o1, o2);
    }


    public static List allMatches(List<String> lst, Predicate<String> func) {
        List<String> result = new ArrayList<>();
        for(String s: lst) {
            if (func.test(s)) {
                result.add(s);
            }
        }
        return result;
    }

    public static <T> List<T> allMatchesGeneric(List<T> lst, Predicate<T> func) {
        List<T> result = new ArrayList<>();
        for(T t: lst) {
            if (func.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static List transformedList(List<String> lst, Function<String, String> func) {
        List<String> result = new ArrayList<>();
        for(String s: lst){
            result.add(func.apply(s));
        }
        return result;
    }

    public static <T> List transformedListGenerics(List<T> lst, Function<T, T> func) {
        List<T> result = new ArrayList<>();
        for(T t: lst){
            result.add(func.apply(t));
        }
        return result;
    }

}
