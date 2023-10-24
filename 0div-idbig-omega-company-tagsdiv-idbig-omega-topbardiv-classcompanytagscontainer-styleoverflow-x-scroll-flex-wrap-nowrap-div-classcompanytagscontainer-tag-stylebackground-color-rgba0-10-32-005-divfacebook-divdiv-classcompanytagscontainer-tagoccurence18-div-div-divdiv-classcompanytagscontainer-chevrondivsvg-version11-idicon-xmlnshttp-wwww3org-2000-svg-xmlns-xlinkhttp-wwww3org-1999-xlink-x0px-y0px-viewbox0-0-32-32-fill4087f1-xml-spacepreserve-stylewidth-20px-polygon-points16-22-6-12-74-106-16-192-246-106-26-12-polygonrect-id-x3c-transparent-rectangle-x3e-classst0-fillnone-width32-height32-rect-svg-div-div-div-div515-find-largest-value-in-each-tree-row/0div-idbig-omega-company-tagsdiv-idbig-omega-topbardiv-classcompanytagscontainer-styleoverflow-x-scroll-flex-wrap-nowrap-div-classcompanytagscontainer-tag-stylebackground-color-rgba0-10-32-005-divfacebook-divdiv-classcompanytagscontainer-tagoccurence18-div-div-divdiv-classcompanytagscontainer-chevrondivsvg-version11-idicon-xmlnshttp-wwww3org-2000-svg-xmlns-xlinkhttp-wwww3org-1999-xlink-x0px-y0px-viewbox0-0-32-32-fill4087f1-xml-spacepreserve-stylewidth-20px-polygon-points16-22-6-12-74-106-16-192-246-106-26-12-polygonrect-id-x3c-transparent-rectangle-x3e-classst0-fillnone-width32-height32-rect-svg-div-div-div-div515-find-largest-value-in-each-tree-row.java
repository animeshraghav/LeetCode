class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> maxValues = new ArrayList<>();
        if(root == null) return maxValues;
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            int size = bfs.size();
            int count = 0;
            int max = Integer.MIN_VALUE;
            while(count < size){
                TreeNode curr = bfs.poll();                
                max = Math.max(max, curr.val);
                
                if(curr.left != null){
                    bfs.offer(curr.left);
                }                
                if(curr.right != null){
                    bfs.offer(curr.right);
                }       
                count++;
            }
            maxValues.add(max);
        } 
        return maxValues;
    }
}