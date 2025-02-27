package algo.leetcode.easy;

import data.tree.TreeNode;

public class __19_101_Symmetric_Tree {
	public static boolean isSymmetric(TreeNode root) {
		return root == null || isSymmetricHelp(root.left, root.right);
	}

	private static boolean isSymmetricHelp(TreeNode left, TreeNode right) {
		if (left == null || right == null) {
			return left == right;
		}

		if (left.val != right.val) {
			return false;
		}

		return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
	}
}
