class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> results = new ArrayList<>();
        add(root1, results);
        add(root2, results);
        Collections.sort(results);
        return results;
    }
    public void add(TreeNode root, ArrayList<Integer> list){
        if(root==null)
            return;
        list.add(root.val);
        add(root.left,list);
        add(root.right,list);
    }
}