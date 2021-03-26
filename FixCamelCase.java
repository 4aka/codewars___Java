package samples;

public class FixCamelCase {

    public static void main(String[] args) {
        System.out.println(fixCamelCase("camelCasing"));
        System.out.println(fixCamelCase("camelCasingTest"));
        System.out.println(fixCamelCase("camelcasingtest"));
        System.out.println(fixCamelCase("ABCDE"));
    }

    public static String fixCamelCase(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) { // "camelCasingTest"

            if (Character.isUpperCase(input.charAt(i)) && i > 0) { // camelC...
                result = result + " " + input.charAt(i); // camel C...

            } else {
                result = result + input.charAt(i); // camel Ca...
            }
        }
        return result;
    }
}