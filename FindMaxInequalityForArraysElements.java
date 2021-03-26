package samples;

public class FindMaxInequalityForArraysElements {

    public static void main(String[] args) {
        String[] a1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] a2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

        System.out.println("result: " + mxdiflg(a1, a2));
    }

    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) return -1;

        int a1max = 0, a2max = 0;
        int[] int1 = new int[a1.length];
        int[] int2 = new int[a2.length];

        for (int i = 0; i < a1.length; i++) {
            if (a1[i].length() > a1max) a1max = a1[i].length(); // find max value int in a1 array
            int1[i] = a1[i].length();
        }
        for (int i = 0; i < a2.length; i++) {
            if (a2[i].length() > a2max) a2max = a2[i].length(); // find max value int in a2 array
            int2[i] = a2[i].length();
        }
        int a1min = java.util.Arrays.stream(int1).min().getAsInt(); // find min value int in a1 array
        int a2min = java.util.Arrays.stream(int2).min().getAsInt(); // find min value int in a2 array

        return Math.max(a1max - a2min, a2max - a1min); // return max inequality
    }
}