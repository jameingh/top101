package com.kim.leetcode.part3.bintree3;

import com.kim.leetcode.part3.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author JinXin
 * @date 2022/12/9 21:38
 * @description 二叉树的后序遍历(非递归法)
 */
public class Solution2 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                // 把根节点 push 入栈
                stack.push(root);
                // 把右子节点 push 入栈，并把右指针设为 null
                if (root.right != null) {
                    stack.push(root.right);
                    root.right = null;
                }
                // 指向左子节点，在下一个循环时，把左子节点 push 入栈，把左指针设为 null
                TreeNode tmp = root.left;
                root.left = null;
                root = tmp;
            }
            // pop 出栈顶节点，如果没有子节点，就添加进结果集
            // 如果一个节点左右指针都是 null，要么它是叶子节点，要么它的子节点都已经进栈了，可以把该节点遍历进结果集
            TreeNode node = stack.pop();
            if (node.left == null && node.right == null) {
                list.add(node.val);
            } else {
                // 如果有子节点，就作为子树的根节点，继续添加进栈中
                root = node;
            }
        }
        return list;
    }

    @Test
    public void test(){
        TreeNode root = new TreeNode(4);
        root.right = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right.left = new TreeNode(1);
        root.right.left.right = new TreeNode(9);
        root.right.right = new TreeNode(0);
        root.left.left = new TreeNode(6);
        final List<Integer> result = postorderTraversal(root);
        result.forEach(System.out::print);
    }
}
