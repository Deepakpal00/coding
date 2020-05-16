package coding.com.binarysearch;

import java.util.LinkedList;
import java.util.Queue;

 class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}

	}
	public class FindMaximumFromBinaryTree {
	public static int findMaxNode(TreeNode node) {
		int max = Integer.MIN_VALUE;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(node);

		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			if (current.data > max) {
				max = current.data;
			}
			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}
		return max;
	}

	public static TreeNode createBinaryTree() {
		TreeNode rootNode = new TreeNode(7);
		rootNode.left = new TreeNode(60);
		rootNode.right = new TreeNode(5);
		rootNode.left.left = new TreeNode(4);
		rootNode.left.right = new TreeNode(3);
		rootNode.left.right.right = new TreeNode(9);
		rootNode.right.left = new TreeNode(2);
		rootNode.right.right = new TreeNode(001000000);
		return rootNode;
		}
	
	public static void main(String[] args) {
		
		int max = findMaxNode(createBinaryTree());
		System.out.println(max);
	}

}
