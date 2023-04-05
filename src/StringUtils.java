public class StringUtils {


    public static int eChecker(String s1, String s2) {
        if (s1.contains("e") && !s2.contains("e")) return -1;
        if (s1.contains("e") && !s2.contains("e")) return 1;
        return 0;

    }


   public static boolean betterString(String s1, String s2, TwoStringPredicate twp) {
        return twp.betterString(s1, s2);
    }


    static <T> boolean betterEntry(T o1, T o2, TwoElementPredicate<T> tep) {
        return tep.betterEntry(o1, o2);
    }



}
