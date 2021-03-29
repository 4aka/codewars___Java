package samples;

public class PerimeterOfSquaresInARectangle {

    public static void main(String[] args) {
        System.out.println(perimeter(java.math.BigInteger.valueOf(30)));
    }

    public static java.math.BigInteger perimeter(java.math.BigInteger n) {
        java.math.BigInteger[] ar = new java.math.BigInteger[n.intValue() + 1];
        int quantity = n.intValue() + 1;
        java.math.BigInteger result;

        ar[0] = java.math.BigInteger.valueOf(1);
        ar[1] = java.math.BigInteger.valueOf(1);

        for (int i = 2; i < quantity; i++) {
            java.math.BigInteger iMinus1 = ar[i - 1];
            java.math.BigInteger iMinus2 = ar[i - 2];

            ar[i] = iMinus1.add(iMinus2);
        }
        result = java.util.Arrays.stream(ar)
                        .reduce(java.math.BigInteger.ZERO, java.math.BigInteger::add);

        return result.multiply(java.math.BigInteger.valueOf(4));
    }
}
