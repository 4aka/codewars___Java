package samples;

public class FindMinMax {

    public static void main(String[] args) {
        for(int i : minMax( new int[] {1,2,3,4,5})) System.out.print(i + "  ");
        System.out.println();
        for(int i : minMax( new int[] {-1,-2,-3,-4,-5})) System.out.print(i + "  ");
        System.out.println();
        for(int i : minMax( new int[] {5, 2334454})) System.out.print(i + "  ");
        System.out.println();
        for(int i : minMax( new int[] {5, 2334454, -87, 0, 90})) System.out.print(i + "  ");
        System.out.println();
    }

    public static int[] minMax(int[] numbers) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i : numbers) if (i > max) max = i;
        for (int i : numbers) if (i < min) min = i;
        return new int[] {min, max};
    }
}