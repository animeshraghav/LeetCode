public class Super_Ugly_Number {
    public static void main(String[] args) {
        Super_Ugly_Number out = new Super_Ugly_Number();
        Solution s = out.new Solution();
        System.out.println(s.nthSuperUglyNumber(12, new int[]{2,7,13,19}));
    }
    class Solution {
        public int nthSuperUglyNumber(int n, int[] primes) {
            if (n <= 0 || primes == null) {
                return 0;
            }
            List<Integer> nums = new ArrayList<>();
            nums.add(1);
            int[] index = new int[primes.length];
            while (nums.size() < n) {
                int minv = Integer.MAX_VALUE;
                for (int i = 0; i < primes.length; i++) {
                    minv = Math.min(minv, primes[i] * nums.get(index[i]));
                }
                nums.add(minv);

                for (int i = 0; i < primes.length; i++) {
                    if (primes[i] * nums.get(index[i]) == minv) {
                        index[i]++;
                    }
                }
            }
            return nums.get(nums.size() - 1);
        }
    }
}
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.offer(1);
        int x = 0;
        while (n-- > 0) {
            x = q.poll();
            while (!q.isEmpty() && q.peek() == x) {
                q.poll();
            }
            for (int k : primes) {
                if (k <= Integer.MAX_VALUE / x) {
                    q.offer(k * x);
                }
                if (x % k == 0) {
                    break;
                }
            }
        }
        return x;
    }
}