class Solution {
    void ABC(TreeNode root,List<Integer> ans)
    {
        if(root==null)
            return;
        ABC(root.left,ans);
        ans.add(root.val);
        ABC(root.right,ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans= new ArrayList<>();
        ABC(root,ans);
        return ans;
    }
}