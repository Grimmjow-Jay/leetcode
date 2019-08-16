package primary.tree;

/**
 * <pre>
给定一个二叉树，判断其是否是一个有效的二叉搜索树。

假设一个二叉搜索树具有如下特征：

节点的左子树只包含小于当前节点的数。
节点的右子树只包含大于当前节点的数。
所有左子树和右子树自身必须也是二叉搜索树。
示例 1:

输入:
    2
   / \
  1   3
输出: true
示例 2:

输入:
    5
   / \
  1   4
     / \
    3   6
输出: false
解释: 输入为: [5,1,4,null,null,3,6]。
     根节点的值为 5 ，但是其右子节点值为 4 。
 * 
 * </pre>
 */
public class ValidateBinarySearchTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left(5).right(15);
		root.right.left(6).right(20);
		boolean validBST = isValidBST(root);
		System.out.println(validBST);
	}

	public static boolean isValidBST(TreeNode root) {

		return true;
	}

}
