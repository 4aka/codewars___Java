package samples;

public class IsPangram {

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));
    }

    public static boolean check(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String result = "";

        for (int i = 0; i < sentence.length(); i++) {

            if (Character.isLetter(sentence.charAt(i))) { // IsLetter
                String s = sentence.toLowerCase().substring(i, i + 1);

                if (alphabet.contains(s)) { // abcdefghijklmnopqrstuvwxyz contains "t" true

                    if (!result.contains(s)) { // if result doesn't contains "t" add letter else continue
                        result += s;
                    }
                }
            }
        }
        // if final result has length 26 (alphabet length) return true
        return result.length() == 26;
    }
}