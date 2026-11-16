class Pow_XN {
    public double myPow(double x, int n) {
        long exp = n;
        if (exp < 0) {
            exp = -exp;
        }

        double result = 1.0;
        double base = x;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = result * base;
            }
            base = base * base;
            exp = exp / 2;
        }

        return n < 0 ? 1.0 / result : result;
    }
}