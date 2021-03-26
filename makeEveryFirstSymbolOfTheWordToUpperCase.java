package samples;

public class makeEveryFirstSymbolOfTheWordToUpperCase {

    public static void main(String[] args) {
        System.out.println(sd("qwerty asdfgh df dsfsd df d fd f "));
    }

    public static String sd(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;

        String result = phrase.substring(0, 1).toUpperCase();

        for (int i = 1; i < phrase.length(); i++) {
            String sCurrent = phrase.substring(i, i + 1);
            String sPrevious = phrase.substring(i - 1, i);

            if (sPrevious.matches(" ")) { // qwerty a
                result = result + sCurrent.toUpperCase(); // qwerty A...

            } else {
                result = result + sCurrent; // qwerty As...
            }
        }
        return result;
    }
}