package samples;

public class FindUsageTheFirstOfArrayInAnotherArray {

    static String[] a1 = {"arp", "live", "strong"};
    static String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};
    // returns ["arp", "live", "strong"]

    static String[] a3 = {"tarp", "mice", "bull"};
    static String[] a4 = {"lively", "alive", "harp", "sharp", "armstrong"};
    // returns []

    static String[] a5 = {"cod", "code", "wars", "ewar", "pillow", "bed", "phht"};
    static String[] a6 = {"lively", "alive", "harp", "sharp", "armstrong", "codewars"};

    public static void main(String[] args) {
        for (String s : inArray(a1, a2)) System.out.print(s + ", ");
        System.out.println();
        for (String s : inArray(a3, a4)) System.out.print(s + ", ");
        System.out.println();
        for (String s : inArray(a5, a6)) System.out.print(s + ", ");
    }

    public static String[] inArray(String[] array1, String[] array2) {
        java.util.List<String> list = new java.util.ArrayList<>();
        String[] result = {};

        for (String s : array1) { // "lively", "alive", "harp", "sharp", "armstrong"

            for (String value : array2) { // "arp", "live", "strong"

                if (value.contains(s)) { // arp in harp, sharp' live in alive, lively e.t.c

                    if (!list.contains(s)) {
                        list.add(s); // returns "arp", "live", "strong"
                    }
                }
            }
        }
        java.util.Collections.sort(list);
        return list.toArray(result);
    }
}