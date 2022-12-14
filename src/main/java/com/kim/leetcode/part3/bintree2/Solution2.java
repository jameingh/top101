package com.kim.leetcode.part3.bintree2;

import com.kim.leetcode.part3.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author JinXin
 * @date 2022/12/9 21:38
 * @description 二叉树的中序遍历(非递归法)
 */
public class Solution2 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> s = new Stack<>();
        //当树节点不为空或栈中有节点时
        while (root != null || !s.isEmpty()) {
            // 从 root 节点进入，沿着左子树不断遍历，把父节点、左子节点 push 进栈
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            // pop 栈顶节点
            TreeNode node = s.pop();
            list.add(node.val);
            // 让 root 指向右子树的根节点，在下一次循环时，遍历 node 的右子树
            root = node.right;
        }
        return list;
    }
}
