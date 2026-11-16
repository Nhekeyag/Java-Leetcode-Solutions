class Multiply_String {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();
        int[] pos = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int d1 = num1.charAt(i) - '0';
                int d2 = num2.charAt(j) - '0';
                int sum = d1 * d2 + pos[i + j + 1];

                pos[i + j + 1] = sum % 10;
                pos[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int digit : pos) {
            if (!(sb.length() == 0 && digit == 0)) {
                sb.append(digit);
            }
        }

        return sb.toString();
    }
}