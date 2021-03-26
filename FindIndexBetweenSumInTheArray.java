package samples;

public class FindIndexBetweenSumInTheArray {

    public static void main(String[] args) {
        System.out.println(findIndex(new int[]{2, 3, 3, 1, 1, 10}));                       // 5  (-1 bug)
        System.out.println(findIndex(new int[]{20, 10, -80, 10, 10, 15, 35}));             // 0
        System.out.println(findIndex(new int[]{10, 2, 3, 3, 1, 1}));                       // 0
        System.out.println(findIndex(new int[]{1, 2, 3, 4, 3, 2, 1}));                     // 3
        System.out.println(findIndex(new int[]{1, 100, 50, -51, 1, 1}));                   // 1
        System.out.println(findIndex(new int[]{1, 2, 3, 4, 5, 6}));                        // -1
        System.out.println(findIndex(new int[]{20, 10, 30, 10, 10, 15, 35}));              // 3
        System.out.println(findIndex(new int[]{-8505, -5130, 1926, -9026}));               // -1
        System.out.println(findIndex(new int[]{2824, 1774, -1490, -9084, -9696, 23094}));  // 1
        System.out.println(findIndex(new int[]{4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));  // 6
    }

    public static int findIndex(int[] arr) {
        int sumLeftSide = 0;
        int sumRightSide = 0;

        for (int k = 0; k <= arr.length; k++) {

            for (int l = 0; l < k; l++) sumLeftSide = sumLeftSide + arr[l]; // get left side sum
            for (int r = k + 1; r < arr.length; r++) sumRightSide = sumRightSide + arr[r]; // get right side sum

            if (sumLeftSide == sumRightSide) return k;
            else if (arr[0] == sumRightSide) return k;
//          else if (sumLeftSide == arr[arr.length - 1]) return k; // TODO fix
            else sumLeftSide = 0; sumRightSide = 0;
        }
        return -1;
    }
}