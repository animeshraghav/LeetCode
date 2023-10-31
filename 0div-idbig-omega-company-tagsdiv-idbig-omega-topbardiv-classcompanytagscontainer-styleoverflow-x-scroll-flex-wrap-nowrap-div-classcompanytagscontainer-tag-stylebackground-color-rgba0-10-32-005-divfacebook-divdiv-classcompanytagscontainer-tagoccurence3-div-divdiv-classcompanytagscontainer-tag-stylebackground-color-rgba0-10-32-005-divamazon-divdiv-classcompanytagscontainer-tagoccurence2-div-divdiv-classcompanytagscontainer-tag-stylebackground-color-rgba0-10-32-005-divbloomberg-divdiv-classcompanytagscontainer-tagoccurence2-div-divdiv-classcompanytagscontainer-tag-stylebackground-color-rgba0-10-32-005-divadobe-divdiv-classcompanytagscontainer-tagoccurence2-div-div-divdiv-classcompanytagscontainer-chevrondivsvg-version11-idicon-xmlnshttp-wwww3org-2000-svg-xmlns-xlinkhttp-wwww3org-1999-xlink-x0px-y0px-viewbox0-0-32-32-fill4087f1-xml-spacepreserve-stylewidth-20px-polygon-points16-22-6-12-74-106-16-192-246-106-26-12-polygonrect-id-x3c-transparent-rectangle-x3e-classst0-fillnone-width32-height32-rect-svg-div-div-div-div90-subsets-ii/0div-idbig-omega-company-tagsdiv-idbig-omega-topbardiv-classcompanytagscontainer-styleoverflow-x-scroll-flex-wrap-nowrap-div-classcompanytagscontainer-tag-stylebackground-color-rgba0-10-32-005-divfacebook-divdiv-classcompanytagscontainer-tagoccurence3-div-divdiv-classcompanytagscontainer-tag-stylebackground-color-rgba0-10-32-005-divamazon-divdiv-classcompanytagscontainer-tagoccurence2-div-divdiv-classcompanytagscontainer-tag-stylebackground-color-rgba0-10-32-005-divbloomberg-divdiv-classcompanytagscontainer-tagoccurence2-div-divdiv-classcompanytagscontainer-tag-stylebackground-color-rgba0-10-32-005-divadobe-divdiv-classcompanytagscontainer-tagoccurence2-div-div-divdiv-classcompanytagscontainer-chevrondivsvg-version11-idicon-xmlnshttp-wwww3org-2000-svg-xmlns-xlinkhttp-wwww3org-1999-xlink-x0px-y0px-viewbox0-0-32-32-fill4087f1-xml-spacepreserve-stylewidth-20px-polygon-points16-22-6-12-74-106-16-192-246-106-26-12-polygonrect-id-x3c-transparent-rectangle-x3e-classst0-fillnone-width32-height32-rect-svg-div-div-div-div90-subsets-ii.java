class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort the input array to handle duplicates
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();
        generateSubsets(nums, 0, currentSubset, subsets);
        return subsets;
    }
    private void generateSubsets(int[] nums, int start, List<Integer> currentSubset, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(currentSubset));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            currentSubset.add(nums[i]);
            generateSubsets(nums, i + 1, currentSubset, subsets);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}
