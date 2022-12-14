package com.kim.leetcode.part3.bintree3;

import com.kim.leetcode.part3.TreeNode;

import java.util.List;

/**
 * @author JinXin
 * @date 2022/12/9 21:32
 * @description 二叉树的后序遍历(递归法)
 */
public class Solution1 {
    public void postorder(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(list, root.left);
        postorder(list, root.right);
        list.add(root.val);
    }
}
