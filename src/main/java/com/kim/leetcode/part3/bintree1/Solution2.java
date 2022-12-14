package com.kim.leetcode.part3.bintree1;

import com.kim.leetcode.part3.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author JinXin
 * @date 2022/12/9 21:38
 * @description 二叉树的前序遍历(非递归法)
 */
public class Solution2 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> s = new Stack<>();
        //根节点先进栈
        s.push(root);
        while (!s.isEmpty()) {
            //每次栈顶就是访问的元素
            TreeNode node = s.pop();
            list.add(node.val);
            //如果右边还有右子节点进栈
            if (node.right != null) {
                s.push(node.right);
            }
            //如果左边还有左子节点进栈
            if (node.left != null) {
                s.push(node.left);
            }
        }
        return list;
    }
}
