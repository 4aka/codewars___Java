package samples;

public class CreateWave {

    public static void main(String[] args) {
        for (String s : wave("a       b    ")) System.out.print(" '" + s + "', ");
        System.out.println();
        for (String s : wave("gzp vxlhd   ga")) System.out.print(" '" + s + "', ");
        System.out.println();
        for (String s : wave("ossgnaogvvjjl jgbgcrdfbt")) System.out.print(" '" + s + "', ");
        System.out.println();
        for (String s : wave("hello")) System.out.print(" '" + s + "', ");
        System.out.println();
        for (String s : wave("codewars")) System.out.print(" '" + s + "', ");
        System.out.println();
        for (String s : wave("")) System.out.println(" '" + s + "', ");
        System.out.println();
        for (String s : wave("two words")) System.out.print(" '" + s + "', ");
        System.out.println();
        for (String s : wave(" gap ")) System.out.print(" '" + s + "', ");
        System.out.println();
    }

    public static String[] wave(String str) {

        if (str.isEmpty()) return new String[]{};

        String[] result;
        String strInLowerCase = str.toLowerCase();
        int spaceQuantity = 0;

        for (int y = 0; y < str.length(); y++) { // Find quantity of spaces.
            if (str.substring(y, y + 1).contains(" ")) spaceQuantity++;
        }

        if (strInLowerCase.contains(" ")) {
            result = new String[str.length() - spaceQuantity]; // set new length of array
            int iterator = 0;

            for (int k = 0; k < strInLowerCase.length(); k++) {

                if (!strInLowerCase.substring(k, k + 1).matches(" ")) { // if symbol matches " " make next to upper case
                    result[iterator] =
                            (strInLowerCase.substring(0, k) +
                                    strInLowerCase.substring(k, k + 1).toUpperCase() +
                                    strInLowerCase.substring(k + 1));
                    iterator ++;
                }
            }
            return result;

        } else {
            result = new String[str.length()]; // set new length of array

            for (int i = 0; i < strInLowerCase.length(); i++) {
                result[i] =
                        (strInLowerCase.substring(0, i) +
                                strInLowerCase.substring(i, i + 1).toUpperCase() + //make next symbol to upper case
                                strInLowerCase.substring(i + 1));
            }
            return result;
        }
    }
}