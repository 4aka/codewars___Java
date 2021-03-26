package samples;

public class HighestAndLowestNumberInTheString {

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4")); // 42 -9
    }

    public static String highAndLow(String numbers) {
        numbers = numbers + " "; // "8 3 -5 42 -1 0 0 -9 4 7 4 -4 " last space is needed to get last int
        java.util.List<String> list = new java.util.ArrayList<>();
        String res = "";

        for (int i = 0; i < numbers.length(); i++) { // define all the ints in the string
            String s = numbers.substring(i, i + 1);

            if (!s.matches(" ")) res = res + s;
            else {
                list.add(res);
                res = "";
            }
        }
        int[] array = new int[list.size()];

        for (int k = 0; k < list.size(); k++) { // create new int array
            array[k] = Integer.parseInt(list.get(k));
        }
        return java.util.Arrays.stream(array).max().getAsInt() + " " + // find max value
                java.util.Arrays.stream(array).min().getAsInt(); // find min value
    }
}
