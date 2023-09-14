public class Solution {
    public int[] singleNumber(int[] nums) {
        int ab = 0;
        for (int i = 0; i < nums.length; i ++) {
            ab = ab ^ nums[i];
        }
        int oneIndex = 0;
        for (int i = 0; i < 32; i ++) {
            if (((ab >>> i) & 1) == 1) {
                oneIndex = i;
                break;
            }
        }
        int[] result =  new int[2];
        result[0] = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (((nums[i] >>> oneIndex) & 1) == 1) {
                result[0] = result[0] ^ nums[i];
            }
        }
        result[1] = ab ^ result[0];
        return result;
    }
}