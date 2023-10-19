public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int sum = 1;
        int product = 9;
        int next = 9;
        for (int i = 0; i < n; i ++) {
            if (i == 0) {
                sum = 10;
            }
            else {
                if (next > 0) {
                    product *= next;
                    sum += product;
                    next --;
                }
            }
        }
        return sum;
    }
}