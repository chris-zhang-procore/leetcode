/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> result = new ArrayList<>();
    	if(root == null) return result;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
        	int size = queue.size();
        	List<Integer> level = new ArrayList<>();
        	for(int i = 0; i < size; i++) {
        		TreeNode node = queue.poll();
        		level.add(node.val);
        		if(node.left != null) queue.offer(node.left);
        		if(node.right != null) queue.offer(node.right);
        	}
        	result.add(level);
        }

        return result;
    }
}