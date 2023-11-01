public class Solution {
    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        process(root, count);
        int max = 0;
        int length = 0;
        for (Integer val:count.keySet()) {
            if (count.get(val) == max) {
                length ++;
            }
            if (count.get(val) > max) {
                length = 1;
                max = count.get(val);
            }
        }
        int[] result = new int[length];
        int k = 0;
        for (Integer val:count.keySet()) {
            if (count.get(val) == max) {
                result[k++] = val;
            }
        }
        return result;
    }
    private void process(TreeNode root, HashMap<Integer, Integer> count) {
        if (root == null) {
            return;
        }
        if (!count.containsKey(root.val)) {
            count.put(root.val, 1);
        }
        else {
            count.put(root.val, count.get(root.val) + 1);
        }
        process(root.left, count);
        process(root.right, count);
    }
}