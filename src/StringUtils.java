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

    public static <E> List<E> allMatchesGeneric(List<E> lst, Predicate<E> func) {
        List<E> result = new ArrayList<>();
        for(E e: lst) {
            if (func.test(e)) {
                result.add(e);
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

    public static <E> List transformedListGenerics(List<E> lst, Function<E, E> func) {
        List<E> result = new ArrayList<>();
        for(E e: lst){
            result.add(func.apply(e));
        }
        return result;
    }

}
