class Divide_Two_integers {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int quotient = 0;

        for (int i = 31; i >= 0; i--) {
            if ((dvd >> i) >= dvs) {
                quotient += (1 << i);
                dvd -= (dvs << i);
            }
        }

        return isNegative ? -quotient : quotient;
    }
}