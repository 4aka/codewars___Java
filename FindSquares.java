package samples;

import java.util.ArrayList;
import java.util.Objects;

public class FindSquares {

    public static void main(String[] args) {
        // TODO fix code as in the example below.

        // [230, 230, 230, 41, 41, 41, 41, 41, 25, 16, 9, 7, 2, 2, 2, 1, 1]
        for (int i : Objects.requireNonNull(sqInRect(731, 230))) System.out.println(i);
        System.out.println("----------------------");
        for (int i : Objects.requireNonNull(sqInRect(240, 32))) System.out.println(i);
    }

    public static java.util.List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth || lng == 0 || wdth == 0) return null;

        java.util.List<Integer> result = new ArrayList<>();
        int first = Math.min(lng, wdth); // set first element as min value from main
        int inequality = (lng * wdth - first * first); // (240 * 32) - (32 * 32)

        result.add(first);

        for (int i = first; i <= first && i > 0; i--) { // 32 -> 1; < 32 | > 0; 32, 31, 30...
            int k = i * i;

            if (k <= inequality) {
                result.add(i);
                inequality -= k;
            }
        }
        return result;
    }
}