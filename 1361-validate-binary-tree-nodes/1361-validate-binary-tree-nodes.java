class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] inDegree = new int[n];

        for (int child : leftChild)
            if (child != -1 && ++inDegree[child] == 2)
                return false;

        for (int child : rightChild)
            if (child != -1 && ++inDegree[child] == 2)
                return false;
        
        int root = -1;
        for (int i = 0; i < n; ++i)
            if (inDegree[i] == 0)
                if (root == -1)
                    root = i;
                else
                    return false;

        if (root == -1)
            return false;

        return dfs(root, leftChild, rightChild) == n;
    }
    
    private int dfs(int root, int[] leftChild, int[] rightChild) {
        if (root == -1)
            return 0;
        return 1 + 
            dfs(leftChild[root], leftChild, rightChild) +
            dfs(rightChild[root], leftChild, rightChild);
    }
}