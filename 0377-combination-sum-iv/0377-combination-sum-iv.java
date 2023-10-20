public class Solution {
    public int combinationSum4(int[] nums, int target) {
        HashMap<Integer, Integer> ans = new HashMap<Integer, Integer>();
        return process(ans, nums, target);    
    }
    private int process(HashMap<Integer, Integer> ans, int[] nums, int target){
        if (target == 0) {
            return 1;
        }
        if (ans.containsKey(target)) {
            return ans.get(target);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] <= target) {
                count += process(ans, nums, target - nums[i]);
            }
        }
        ans.put(target, count);
        return count;
    }

}