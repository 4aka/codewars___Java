package samples;

public class Scramblies {

    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw","world"));
        System.out.println(scramble("cedewaraaossoqqyt","codewars"));
        System.out.println(scramble("katas","steak"));                  // f
        System.out.println(scramble("scriptjavx","javascript"));        // f
        System.out.println(scramble("scriptingjava","javascript"));
        System.out.println(scramble("scriptsjava","javascripts"));
        System.out.println(scramble("javscripts","javascript"));        // f
        System.out.println(scramble("aabbcamaomsccdd","commas"));
        System.out.println(scramble("commas","commas"));
        System.out.println(scramble("sammoc","commas"));
    }

    public static boolean scramble(String str1, String str2) {
        char[] ch1 = new char[str1.length()];
        char[] ch2 = new char[str2.length()];

        for (int i = 0; i < str1.length(); i++) ch1[i] = str1.charAt(i);
        for (int i = 0; i < str2.length(); i++) ch2[i] = str2.charAt(i);
        java.util.Arrays.sort(ch1); java.util.Arrays.sort(ch2);
        int result = 0;

        for (char c : ch2) {

            for (int k = 0; k < ch1.length; k++) {

                if (c == ch1[k]) {
                    ch1[k] = ' ';
                    result ++;
                    break;
                }
            }
        }
        return str2.length() == result;
    }
}