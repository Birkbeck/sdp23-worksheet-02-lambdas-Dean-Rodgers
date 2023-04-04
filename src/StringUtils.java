public class StringUtils {

    public static int eChecker(String s1, String s2) {
        if (s1.contains("e") && !s2.contains("e")) return -1;
        if (s1.contains("e") && !s2.contains("e")) return 1;
        return 0;

    }

}
