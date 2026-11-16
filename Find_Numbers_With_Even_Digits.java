class Find_Numbers_With_Even_Digits {
    public int findNumbers(int[] nums) {
        int evenCount = 0;

        for (int num : nums) {
            int digits = 0;
            int temp = num;

            while (temp > 0) {
                temp = temp / 10;
                digits++;
            }

            if (digits % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }
}